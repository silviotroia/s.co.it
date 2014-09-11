package it.stasbranger.s.co.it.web.rest;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.UsersService;

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
 * Spring Rest controller that handles CRUD requests for Users entities
 * 
 */

@Controller("UsersRestController")
public class UsersRestController {

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
	 * Show all Billinginformation entities by Users
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/billinginformations", method = RequestMethod.GET)
	@ResponseBody
	public List<Billinginformation> getUsersBillinginformations(@PathVariable Integer users_id) {
		return new java.util.ArrayList<Billinginformation>(usersDAO.findUsersByPrimaryKey(users_id).getBillinginformations());
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/billinginformations", method = RequestMethod.PUT)
	@ResponseBody
	public Billinginformation saveUsersBillinginformations(@PathVariable Integer users_id, @RequestBody Billinginformation billinginformations) {
		usersService.saveUsersBillinginformations(users_id, billinginformations);
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformations.getId());
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/billinginformations/{billinginformation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsersBillinginformations(@PathVariable Integer users_id, @PathVariable Integer related_billinginformations_id) {
		usersService.deleteUsersBillinginformations(users_id, related_billinginformations_id);
	}

	/**
	 * View an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/authoritieses/{authorities_id}", method = RequestMethod.GET)
	@ResponseBody
	public Authorities loadUsersAuthoritieses(@PathVariable Integer users_id, @PathVariable Integer related_authoritieses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id, -1, -1);

		return authorities;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsers(@PathVariable Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id);
		usersService.deleteUsers(users);
	}

	/**
	 * Show all Users entities
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUserss() {
		return new java.util.ArrayList<Users>(usersService.loadUserss());
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/authoritieses/{authorities_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsersAuthoritieses(@PathVariable Integer users_id, @PathVariable Integer related_authoritieses_id) {
		usersService.deleteUsersAuthoritieses(users_id, related_authoritieses_id);
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadUsers(@PathVariable Integer users_id) {
		return usersDAO.findUsersByPrimaryKey(users_id);
	}

	/**
	 * View an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/billinginformations/{billinginformation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Billinginformation loadUsersBillinginformations(@PathVariable Integer users_id, @PathVariable Integer related_billinginformations_id) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(related_billinginformations_id, -1, -1);

		return billinginformation;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/domains/{domain_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsersDomains(@PathVariable Integer users_id, @PathVariable Integer related_domains_id) {
		usersService.deleteUsersDomains(users_id, related_domains_id);
	}

	/**
	 * Show all Authorities entities by Users
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.GET)
	@ResponseBody
	public List<Authorities> getUsersAuthoritieses(@PathVariable Integer users_id) {
		return new java.util.ArrayList<Authorities>(usersDAO.findUsersByPrimaryKey(users_id).getAuthoritieses());
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
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public Users newUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/domains", method = RequestMethod.PUT)
	@ResponseBody
	public Domain saveUsersDomains(@PathVariable Integer users_id, @RequestBody Domain domains) {
		usersService.saveUsersDomains(users_id, domains);
		return domainDAO.findDomainByPrimaryKey(domains.getId());
	}

	/**
	 * Create a new Domain entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/domains", method = RequestMethod.POST)
	@ResponseBody
	public Domain newUsersDomains(@PathVariable Integer users_id, @RequestBody Domain domain) {
		usersService.saveUsersDomains(users_id, domain);
		return domainDAO.findDomainByPrimaryKey(domain.getId());
	}

	/**
	 * Show all Domain entities by Users
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/domains", method = RequestMethod.GET)
	@ResponseBody
	public List<Domain> getUsersDomains(@PathVariable Integer users_id) {
		return new java.util.ArrayList<Domain>(usersDAO.findUsersByPrimaryKey(users_id).getDomains());
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.PUT)
	@ResponseBody
	public Authorities saveUsersAuthoritieses(@PathVariable Integer users_id, @RequestBody Authorities authoritieses) {
		usersService.saveUsersAuthoritieses(users_id, authoritieses);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authoritieses.getId());
	}

	/**
	 * View an existing Domain entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/domains/{domain_id}", method = RequestMethod.GET)
	@ResponseBody
	public Domain loadUsersDomains(@PathVariable Integer users_id, @PathVariable Integer related_domains_id) {
		Domain domain = domainDAO.findDomainByPrimaryKey(related_domains_id, -1, -1);

		return domain;
	}

	/**
	 * Create a new Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/billinginformations", method = RequestMethod.POST)
	@ResponseBody
	public Billinginformation newUsersBillinginformations(@PathVariable Integer users_id, @RequestBody Billinginformation billinginformation) {
		usersService.saveUsersBillinginformations(users_id, billinginformation);
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation.getId());
	}

	/**
	 * Create a new Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_id}/authoritieses", method = RequestMethod.POST)
	@ResponseBody
	public Authorities newUsersAuthoritieses(@PathVariable Integer users_id, @RequestBody Authorities authorities) {
		usersService.saveUsersAuthoritieses(users_id, authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}
}