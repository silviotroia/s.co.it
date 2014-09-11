package it.stasbranger.s.co.it.web.rest;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.AuthoritiesService;

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
 * Spring Rest controller that handles CRUD requests for Authorities entities
 * 
 */

@Controller("AuthoritiesRestController")
public class AuthoritiesRestController {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Authorities entities
	 * 
	 */
	@Autowired
	private AuthoritiesService authoritiesService;

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveAuthoritiesUserses(@PathVariable Integer authorities_id, @RequestBody Users userses) {
		authoritiesService.saveAuthoritiesUserses(authorities_id, userses);
		return usersDAO.findUsersByPrimaryKey(userses.getId());
	}

	/**
	 * Create a new Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Authorities", method = RequestMethod.POST)
	@ResponseBody
	public Authorities newAuthorities(@RequestBody Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}

	/**
	 * Select an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}", method = RequestMethod.GET)
	@ResponseBody
	public Authorities loadAuthorities(@PathVariable Integer authorities_id) {
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id);
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
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.POST)
	@ResponseBody
	public Users newAuthoritiesUserses(@PathVariable Integer authorities_id, @RequestBody Users users) {
		authoritiesService.saveAuthoritiesUserses(authorities_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAuthorities(@PathVariable Integer authorities_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id);
		authoritiesService.deleteAuthorities(authorities);
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}/userses/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAuthoritiesUserses(@PathVariable Integer authorities_id, @PathVariable Integer related_userses_id) {
		authoritiesService.deleteAuthoritiesUserses(authorities_id, related_userses_id);
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}/userses/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadAuthoritiesUserses(@PathVariable Integer authorities_id, @PathVariable Integer related_userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_userses_id, -1, -1);

		return users;
	}

	/**
	 * Show all Authorities entities
	 * 
	 */
	@RequestMapping(value = "/Authorities", method = RequestMethod.GET)
	@ResponseBody
	public List<Authorities> listAuthoritiess() {
		return new java.util.ArrayList<Authorities>(authoritiesService.loadAuthoritiess());
	}

	/**
	 * Show all Users entities by Authorities
	 * 
	 */
	@RequestMapping(value = "/Authorities/{authorities_id}/userses", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> getAuthoritiesUserses(@PathVariable Integer authorities_id) {
		return new java.util.ArrayList<Users>(authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id).getUserses());
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@RequestMapping(value = "/Authorities", method = RequestMethod.PUT)
	@ResponseBody
	public Authorities saveAuthorities(@RequestBody Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());
	}
}