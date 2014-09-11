package it.stasbranger.s.co.it.web.rest;

import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.BillinginformationService;

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
 * Spring Rest controller that handles CRUD requests for Billinginformation entities
 * 
 */

@Controller("BillinginformationRestController")
public class BillinginformationRestController {

	/**
	 * DAO injected by Spring that manages Billinginformation entities
	 * 
	 */
	@Autowired
	private BillinginformationDAO billinginformationDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Billinginformation entities
	 * 
	 */
	@Autowired
	private BillinginformationService billinginformationService;

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}/users", method = RequestMethod.POST)
	@ResponseBody
	public Users newBillinginformationUsers(@PathVariable Integer billinginformation_id, @RequestBody Users users) {
		billinginformationService.saveBillinginformationUsers(billinginformation_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation", method = RequestMethod.PUT)
	@ResponseBody
	public Billinginformation saveBillinginformation(@RequestBody Billinginformation billinginformation) {
		billinginformationService.saveBillinginformation(billinginformation);
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation.getId());
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}/users/{users_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBillinginformationUsers(@PathVariable Integer billinginformation_id, @PathVariable Integer related_users_id) {
		billinginformationService.deleteBillinginformationUsers(billinginformation_id, related_users_id);
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
	 * Select an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Billinginformation loadBillinginformation(@PathVariable Integer billinginformation_id) {
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation_id);
	}

	/**
	 * Create a new Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation", method = RequestMethod.POST)
	@ResponseBody
	public Billinginformation newBillinginformation(@RequestBody Billinginformation billinginformation) {
		billinginformationService.saveBillinginformation(billinginformation);
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation.getId());
	}

	/**
	 * Get Users entity by Billinginformation
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}/users", method = RequestMethod.GET)
	@ResponseBody
	public Users getBillinginformationUsers(@PathVariable Integer billinginformation_id) {
		return billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation_id).getUsers();
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}/users/{users_id}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadBillinginformationUsers(@PathVariable Integer billinginformation_id, @PathVariable Integer related_users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		return users;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}/users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveBillinginformationUsers(@PathVariable Integer billinginformation_id, @RequestBody Users users) {
		billinginformationService.saveBillinginformationUsers(billinginformation_id, users);
		return usersDAO.findUsersByPrimaryKey(users.getId());
	}

	/**
	 * Show all Billinginformation entities
	 * 
	 */
	@RequestMapping(value = "/Billinginformation", method = RequestMethod.GET)
	@ResponseBody
	public List<Billinginformation> listBillinginformations() {
		return new java.util.ArrayList<Billinginformation>(billinginformationService.loadBillinginformations());
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@RequestMapping(value = "/Billinginformation/{billinginformation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBillinginformation(@PathVariable Integer billinginformation_id) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation_id);
		billinginformationService.deleteBillinginformation(billinginformation);
	}
}