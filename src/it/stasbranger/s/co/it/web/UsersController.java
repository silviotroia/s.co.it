package it.stasbranger.s.co.it.web;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.UsersService;

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
 * Spring MVC controller that handles CRUD requests for Users entities
 * 
 */

@Controller("UsersController")
public class UsersController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Billinginformation entities
	 * 
	 */
	@Autowired
	private BillinginformationDAO billinginformationDAO;

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
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@RequestMapping("/deleteUsersDomains")
	public ModelAndView deleteUsersDomains(@RequestParam Integer users_id, @RequestParam Integer related_domains_id) {
		ModelAndView mav = new ModelAndView();

		Users users = usersService.deleteUsersDomains(users_id, related_domains_id);

		mav.addObject("users_id", users_id);
		mav.addObject("users", users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@RequestMapping("/deleteUsersAuthoritieses")
	public ModelAndView deleteUsersAuthoritieses(@RequestParam Integer users_id, @RequestParam Integer related_authoritieses_id) {
		ModelAndView mav = new ModelAndView();

		Users users = usersService.deleteUsersAuthoritieses(users_id, related_authoritieses_id);

		mav.addObject("users_id", users_id);
		mav.addObject("users", users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping("/newUsers")
	public ModelAndView newUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	 * Show all Billinginformation entities by Users
	 * 
	 */
	@RequestMapping("/listUsersBillinginformations")
	public ModelAndView listUsersBillinginformations(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/billinginformations/listBillinginformations.jsp");

		return mav;
	}

	/**
	 * Edit an existing Authorities entity
	 * 
	 */
	@RequestMapping("/editUsersAuthoritieses")
	public ModelAndView editUsersAuthoritieses(@RequestParam Integer users_id, @RequestParam Integer authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("users/authoritieses/editAuthoritieses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Domain entity
	 * 
	 */
	@RequestMapping("/editUsersDomains")
	public ModelAndView editUsersDomains(@RequestParam Integer users_id, @RequestParam Integer domains_id) {
		Domain domain = domainDAO.findDomainByPrimaryKey(domains_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("domain", domain);
		mav.setViewName("users/domains/editDomains.jsp");

		return mav;
	}

	/**
	 * Show all Users entities
	 * 
	 */
	@RequestMapping("/indexUsers")
	public ModelAndView listUserss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userss", usersService.loadUserss());

		mav.setViewName("users/listUserss.jsp");

		return mav;
	}

	/**
	 * Edit an existing Users entity
	 * 
	 */
	@RequestMapping("/editUsers")
	public ModelAndView editUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/editUsers.jsp");

		return mav;
	}

	/**
	 * View an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/selectUsersBillinginformations")
	public ModelAndView selectUsersBillinginformations(@RequestParam Integer users_id, @RequestParam Integer billinginformations_id) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(billinginformations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("billinginformation", billinginformation);
		mav.setViewName("users/billinginformations/viewBillinginformations.jsp");

		return mav;
	}

	/**
	 * View an existing Domain entity
	 * 
	 */
	@RequestMapping("/selectUsersDomains")
	public ModelAndView selectUsersDomains(@RequestParam Integer users_id, @RequestParam Integer domains_id) {
		Domain domain = domainDAO.findDomainByPrimaryKey(domains_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("domain", domain);
		mav.setViewName("users/domains/viewDomains.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/usersController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the child Authorities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsersAuthoritieses")
	public ModelAndView confirmDeleteUsersAuthoritieses(@RequestParam Integer users_id, @RequestParam Integer related_authoritieses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id));
		mav.addObject("users_id", users_id);
		mav.setViewName("users/authoritieses/deleteAuthoritieses.jsp");

		return mav;
	}

	/**
	 * Show all Domain entities by Users
	 * 
	 */
	@RequestMapping("/listUsersDomains")
	public ModelAndView listUsersDomains(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/domains/listDomains.jsp");

		return mav;
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/deleteUsersBillinginformations")
	public ModelAndView deleteUsersBillinginformations(@RequestParam Integer users_id, @RequestParam Integer related_billinginformations_id) {
		ModelAndView mav = new ModelAndView();

		Users users = usersService.deleteUsersBillinginformations(users_id, related_billinginformations_id);

		mav.addObject("users_id", users_id);
		mav.addObject("users", users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@RequestMapping("/saveUsersAuthoritieses")
	public ModelAndView saveUsersAuthoritieses(@RequestParam Integer users_id, @ModelAttribute Authorities authoritieses) {
		Users parent_users = usersService.saveUsersAuthoritieses(users_id, authoritieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("users", parent_users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Select the child Domain entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsersDomains")
	public ModelAndView confirmDeleteUsersDomains(@RequestParam Integer users_id, @RequestParam Integer related_domains_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("domain", domainDAO.findDomainByPrimaryKey(related_domains_id));
		mav.addObject("users_id", users_id);
		mav.setViewName("users/domains/deleteDomains.jsp");

		return mav;
	}

	/**
	 * Edit an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/editUsersBillinginformations")
	public ModelAndView editUsersBillinginformations(@RequestParam Integer users_id, @RequestParam Integer billinginformations_id) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(billinginformations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("billinginformation", billinginformation);
		mav.setViewName("users/billinginformations/editBillinginformations.jsp");

		return mav;
	}

	/**
	 * Show all Authorities entities by Users
	 * 
	 */
	@RequestMapping("/listUsersAuthoritieses")
	public ModelAndView listUsersAuthoritieses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/authoritieses/listAuthoritieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping("/deleteUsers")
	public String deleteUsers(@RequestParam Integer idKey) {
		Users users = usersDAO.findUsersByPrimaryKey(idKey);
		usersService.deleteUsers(users);
		return "forward:/indexUsers";
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
	 * Create a new Authorities entity
	 * 
	 */
	@RequestMapping("/newUsersAuthoritieses")
	public ModelAndView newUsersAuthoritieses(@RequestParam Integer users_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", new Authorities());
		mav.addObject("newFlag", true);
		mav.setViewName("users/authoritieses/editAuthoritieses.jsp");

		return mav;
	}

	/**
	 * Select the child Billinginformation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsersBillinginformations")
	public ModelAndView confirmDeleteUsersBillinginformations(@RequestParam Integer users_id, @RequestParam Integer related_billinginformations_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", billinginformationDAO.findBillinginformationByPrimaryKey(related_billinginformations_id));
		mav.addObject("users_id", users_id);
		mav.setViewName("users/billinginformations/deleteBillinginformations.jsp");

		return mav;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping("/saveUsers")
	public String saveUsers(@ModelAttribute Users users) {
		usersService.saveUsers(users);
		return "forward:/indexUsers";
	}

	/**
	 * Select the Users entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsers")
	public ModelAndView confirmDeleteUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/deleteUsers.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Users entities
	 * 
	 */
	public String indexUsers() {
		return "redirect:/indexUsers";
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/saveUsersBillinginformations")
	public ModelAndView saveUsersBillinginformations(@RequestParam Integer users_id, @ModelAttribute Billinginformation billinginformations) {
		Users parent_users = usersService.saveUsersBillinginformations(users_id, billinginformations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("users", parent_users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@RequestMapping("/selectUsers")
	public ModelAndView selectUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(idKey));
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Domain entity
	 * 
	 */
	@RequestMapping("/newUsersDomains")
	public ModelAndView newUsersDomains(@RequestParam Integer users_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("domain", new Domain());
		mav.addObject("newFlag", true);
		mav.setViewName("users/domains/editDomains.jsp");

		return mav;
	}

	/**
	 * View an existing Authorities entity
	 * 
	 */
	@RequestMapping("/selectUsersAuthoritieses")
	public ModelAndView selectUsersAuthoritieses(@RequestParam Integer users_id, @RequestParam Integer authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("users/authoritieses/viewAuthoritieses.jsp");

		return mav;
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@RequestMapping("/saveUsersDomains")
	public ModelAndView saveUsersDomains(@RequestParam Integer users_id, @ModelAttribute Domain domains) {
		Users parent_users = usersService.saveUsersDomains(users_id, domains);

		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("users", parent_users);
		mav.setViewName("users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Billinginformation entity
	 * 
	 */
	@RequestMapping("/newUsersBillinginformations")
	public ModelAndView newUsersBillinginformations(@RequestParam Integer users_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users_id", users_id);
		mav.addObject("billinginformation", new Billinginformation());
		mav.addObject("newFlag", true);
		mav.setViewName("users/billinginformations/editBillinginformations.jsp");

		return mav;
	}
}