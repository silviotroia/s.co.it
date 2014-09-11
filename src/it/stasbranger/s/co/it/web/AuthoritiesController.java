package it.stasbranger.s.co.it.web;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.AuthoritiesService;

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
 * Spring MVC controller that handles CRUD requests for Authorities entities
 * 
 */

@Controller("AuthoritiesController")
public class AuthoritiesController {

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
	 */
	@RequestMapping("/authoritiesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Users entity
	 * 
	 */
	@RequestMapping("/editAuthoritiesUserses")
	public ModelAndView editAuthoritiesUserses(@RequestParam Integer authorities_id, @RequestParam Integer userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(userses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", users);
		mav.setViewName("authorities/userses/editUserses.jsp");

		return mav;
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping("/selectAuthoritiesUserses")
	public ModelAndView selectAuthoritiesUserses(@RequestParam Integer authorities_id, @RequestParam Integer userses_id) {
		Users users = usersDAO.findUsersByPrimaryKey(userses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", users);
		mav.setViewName("authorities/userses/viewUserses.jsp");

		return mav;
	}

	/**
	 * Show all Users entities by Authorities
	 * 
	 */
	@RequestMapping("/listAuthoritiesUserses")
	public ModelAndView listAuthoritiesUserses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/userses/listUserses.jsp");

		return mav;
	}

	/**
	 * Select the Authorities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAuthorities")
	public ModelAndView confirmDeleteAuthorities(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/deleteAuthorities.jsp");

		return mav;
	}

	/**
	 * Select an existing Authorities entity
	 * 
	 */
	@RequestMapping("/selectAuthorities")
	public ModelAndView selectAuthorities(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping("/newAuthoritiesUserses")
	public ModelAndView newAuthoritiesUserses(@RequestParam Integer authorities_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("authorities/userses/editUserses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping("/deleteAuthoritiesUserses")
	public ModelAndView deleteAuthoritiesUserses(@RequestParam Integer authorities_id, @RequestParam Integer related_userses_id) {
		ModelAndView mav = new ModelAndView();

		Authorities authorities = authoritiesService.deleteAuthoritiesUserses(authorities_id, related_userses_id);

		mav.addObject("authorities_id", authorities_id);
		mav.addObject("authorities", authorities);
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Authorities entities
	 * 
	 */
	public String indexAuthorities() {
		return "redirect:/indexAuthorities";
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@RequestMapping("/saveAuthorities")
	public String saveAuthorities(@ModelAttribute Authorities authorities) {
		authoritiesService.saveAuthorities(authorities);
		return "forward:/indexAuthorities";
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping("/saveAuthoritiesUserses")
	public ModelAndView saveAuthoritiesUserses(@RequestParam Integer authorities_id, @ModelAttribute Users userses) {
		Authorities parent_authorities = authoritiesService.saveAuthoritiesUserses(authorities_id, userses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("authorities_id", authorities_id);
		mav.addObject("authorities", parent_authorities);
		mav.setViewName("authorities/viewAuthorities.jsp");

		return mav;
	}

	/**
	 * Edit an existing Authorities entity
	 * 
	 */
	@RequestMapping("/editAuthorities")
	public ModelAndView editAuthorities(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", authoritiesDAO.findAuthoritiesByPrimaryKey(idKey));
		mav.setViewName("authorities/editAuthorities.jsp");

		return mav;
	}

	/**
	 * Show all Authorities entities
	 * 
	 */
	@RequestMapping("/indexAuthorities")
	public ModelAndView listAuthoritiess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authoritiess", authoritiesService.loadAuthoritiess());

		mav.setViewName("authorities/listAuthoritiess.jsp");

		return mav;
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@RequestMapping("/deleteAuthorities")
	public String deleteAuthorities(@RequestParam Integer idKey) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(idKey);
		authoritiesService.deleteAuthorities(authorities);
		return "forward:/indexAuthorities";
	}

	/**
	 * Select the child Users entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAuthoritiesUserses")
	public ModelAndView confirmDeleteAuthoritiesUserses(@RequestParam Integer authorities_id, @RequestParam Integer related_userses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(related_userses_id));
		mav.addObject("authorities_id", authorities_id);
		mav.setViewName("authorities/userses/deleteUserses.jsp");

		return mav;
	}

	/**
	 * Create a new Authorities entity
	 * 
	 */
	@RequestMapping("/newAuthorities")
	public ModelAndView newAuthorities() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("authorities", new Authorities());
		mav.addObject("newFlag", true);
		mav.setViewName("authorities/editAuthorities.jsp");

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
}