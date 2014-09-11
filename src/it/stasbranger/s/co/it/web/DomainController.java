package it.stasbranger.s.co.it.web;

import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.DomainService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Domain entities
 * 
 */

@Controller("DomainController")
public class DomainController {

	/**
	 * DAO injected by Spring that manages Domain entities
	 * 
	 */
	@Autowired
	private DomainDAO domainDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Domain entities
	 * 
	 */
	@Autowired
	private DomainService domainService;

	/**
	 */
	@RequestMapping("/domainController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Domain entities
	 * 
	 */
	public String indexDomain() {
		return "redirect:/indexDomain";
	}

	/**
	 * Select the child Users entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDomainUsers")
	public ModelAndView confirmDeleteDomainUsers(@RequestParam Integer domain_id, @RequestParam Integer related_users_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(related_users_id));
		mav.addObject("domain_id", domain_id);
		mav.setViewName("domain/users/deleteUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Domain entity
	 * 
	 */
	@RequestMapping("/newDomain")
	public ModelAndView newDomain() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", new Domain());
		mav.addObject("newFlag", true);
		mav.setViewName("domain/editDomain.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Edit an existing Domain entity
	 * 
	 */
	@RequestMapping("/editDomain")
	public ModelAndView editDomain(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", domainDAO.findDomainByPrimaryKey(idKey));
		mav.setViewName("domain/editDomain.jsp");

		return mav;
	}

	/**
	 * Show all Domain entities
	 * 
	 */
	@RequestMapping("/indexDomain")
	public ModelAndView listDomains() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domains", domainService.loadDomains());

		mav.setViewName("domain/listDomains.jsp");

		return mav;
	}

	/**
	 * Select the Domain entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDomain")
	public ModelAndView confirmDeleteDomain(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", domainDAO.findDomainByPrimaryKey(idKey));
		mav.setViewName("domain/deleteDomain.jsp");

		return mav;
	}

	/**
	 * Select an existing Domain entity
	 * 
	 */
	@RequestMapping("/selectDomain")
	public ModelAndView selectDomain(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", domainDAO.findDomainByPrimaryKey(idKey));
		mav.setViewName("domain/viewDomain.jsp");

		return mav;
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping("/newDomainUsers")
	public ModelAndView newDomainUsers(@RequestParam Integer domain_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("domain_id", domain_id);
		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("domain/users/editUsers.jsp");

		return mav;
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@RequestMapping("/saveDomain")
	public String saveDomain(@ModelAttribute Domain domain) {
		domainService.saveDomain(domain);
		return "forward:/indexDomain";
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping("/selectDomainUsers")
	public ModelAndView selectDomainUsers(@RequestParam Integer domain_id, @RequestParam Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("domain_id", domain_id);
		mav.addObject("users", users);
		mav.setViewName("domain/users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Show all Users entities by Domain
	 * 
	 */
	@RequestMapping("/listDomainUsers")
	public ModelAndView listDomainUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", domainDAO.findDomainByPrimaryKey(idKey));
		mav.setViewName("domain/users/listUsers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Users entity
	 * 
	 */
	@RequestMapping("/editDomainUsers")
	public ModelAndView editDomainUsers(@RequestParam Integer domain_id, @RequestParam Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("domain_id", domain_id);
		mav.addObject("users", users);
		mav.setViewName("domain/users/editUsers.jsp");

		return mav;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping("/deleteDomainUsers")
	public ModelAndView deleteDomainUsers(@RequestParam Integer domain_id, @RequestParam Integer related_users_id) {
		ModelAndView mav = new ModelAndView();

		Domain domain = domainService.deleteDomainUsers(domain_id, related_users_id);

		mav.addObject("domain_id", domain_id);
		mav.addObject("domain", domain);
		mav.setViewName("domain/viewDomain.jsp");

		return mav;
	}

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@RequestMapping("/deleteDomain")
	public String deleteDomain(@RequestParam Integer idKey) {
		Domain domain = domainDAO.findDomainByPrimaryKey(idKey);
		domainService.deleteDomain(domain);
		return "forward:/indexDomain";
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping("/saveDomainUsers")
	public ModelAndView saveDomainUsers(@RequestParam Integer domain_id, @ModelAttribute Users users) {
		Domain parent_domain = domainService.saveDomainUsers(domain_id, users);

		ModelAndView mav = new ModelAndView();
		mav.addObject("domain_id", domain_id);
		mav.addObject("domain", parent_domain);
		mav.setViewName("domain/viewDomain.jsp");

		return mav;
	}
}