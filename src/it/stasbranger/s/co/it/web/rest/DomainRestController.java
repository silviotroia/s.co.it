package it.stasbranger.s.co.it.web.rest;

import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.DomainService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Domain entities
 * 
 */

@Controller("DomainRestController")
public class DomainRestController {

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
	 * Create a new Domain entity
	 * 
	 */
	@RequestMapping(value = "/Domain", method = RequestMethod.POST)
	@ResponseBody
	public Domain newDomain(@RequestBody Domain domain) {
		domainService.saveDomain(domain);
		return domainDAO.findDomainByPrimaryKey(domain.getId());
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Domain", method = RequestMethod.PUT)
	@ResponseBody
	public Domain saveDomain(@RequestBody Domain domain) {
		domainService.saveDomain(domain);
		return domainDAO.findDomainByPrimaryKey(domain.getId());
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}/users/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDomainUsers(@PathVariable Integer domain_id, @PathVariable Integer related_users_id) {
		domainService.deleteDomainUsers(domain_id, related_users_id);
	}

	/**
	 * Show all Domain entities
	 * 
	 */
	@RequestMapping(value = "/Domain", method = RequestMethod.GET)
	@ResponseBody
	public List<Domain> listDomains() {
		return new java.util.ArrayList<Domain>(domainService.loadDomains());
	}

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDomain(@PathVariable Integer domain_id) {
		Domain domain = domainDAO.findDomainByPrimaryKey(domain_id);
		domainService.deleteDomain(domain);
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}/users", method = RequestMethod.POST)
	@ResponseBody
	public Users newDomainUsers(@PathVariable Integer domain_id, @RequestBody Users users) {
		domainService.saveDomainUsers(domain_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
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
	 * Get Users entity by Domain
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}/users", method = RequestMethod.GET)
	@ResponseBody
	public Users getDomainUsers(@PathVariable Integer domain_id) {
		return domainDAO.findDomainByPrimaryKey(domain_id).getUsers();
	}

	/**
	 * Select an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}", method = RequestMethod.GET)
	@ResponseBody
	public Domain loadDomain(@PathVariable Integer domain_id) {
		return domainDAO.findDomainByPrimaryKey(domain_id);
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}/users/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadDomainUsers(@PathVariable Integer domain_id, @PathVariable Integer related_users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		return users;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Domain/{domain_id}/users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveDomainUsers(@PathVariable Integer domain_id, @RequestBody Users users) {
		domainService.saveDomainUsers(domain_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}
}