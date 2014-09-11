package it.stasbranger.s.co.it.web;

import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Users;

import it.stasbranger.s.co.it.service.BillinginformationService;

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
 * Spring MVC controller that handles CRUD requests for Billinginformation entities
 * 
 */

@Controller("BillinginformationController")
public class BillinginformationController {

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
	 * Entry point to show all Billinginformation entities
	 * 
	 */
	public String indexBillinginformation() {
		return "redirect:/indexBillinginformation";
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping("/saveBillinginformationUsers")
	public ModelAndView saveBillinginformationUsers(@RequestParam Integer billinginformation_id, @ModelAttribute Users users) {
		Billinginformation parent_billinginformation = billinginformationService.saveBillinginformationUsers(billinginformation_id, users);

		ModelAndView mav = new ModelAndView();
		mav.addObject("billinginformation_id", billinginformation_id);
		mav.addObject("billinginformation", parent_billinginformation);
		mav.setViewName("billinginformation/viewBillinginformation.jsp");

		return mav;
	}

	/**
	 * Show all Billinginformation entities
	 * 
	 */
	@RequestMapping("/indexBillinginformation")
	public ModelAndView listBillinginformations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformations", billinginformationService.loadBillinginformations());

		mav.setViewName("billinginformation/listBillinginformations.jsp");

		return mav;
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/deleteBillinginformation")
	public String deleteBillinginformation(@RequestParam Integer idKey) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(idKey);
		billinginformationService.deleteBillinginformation(billinginformation);
		return "forward:/indexBillinginformation";
	}

	/**
	 * Show all Users entities by Billinginformation
	 * 
	 */
	@RequestMapping("/listBillinginformationUsers")
	public ModelAndView listBillinginformationUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", billinginformationDAO.findBillinginformationByPrimaryKey(idKey));
		mav.setViewName("billinginformation/users/listUsers.jsp");

		return mav;
	}

	/**
	 * View an existing Users entity
	 * 
	 */
	@RequestMapping("/selectBillinginformationUsers")
	public ModelAndView selectBillinginformationUsers(@RequestParam Integer billinginformation_id, @RequestParam Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("billinginformation_id", billinginformation_id);
		mav.addObject("users", users);
		mav.setViewName("billinginformation/users/viewUsers.jsp");

		return mav;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping("/deleteBillinginformationUsers")
	public ModelAndView deleteBillinginformationUsers(@RequestParam Integer billinginformation_id, @RequestParam Integer related_users_id) {
		ModelAndView mav = new ModelAndView();

		Billinginformation billinginformation = billinginformationService.deleteBillinginformationUsers(billinginformation_id, related_users_id);

		mav.addObject("billinginformation_id", billinginformation_id);
		mav.addObject("billinginformation", billinginformation);
		mav.setViewName("billinginformation/viewBillinginformation.jsp");

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
	 * Select the child Users entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBillinginformationUsers")
	public ModelAndView confirmDeleteBillinginformationUsers(@RequestParam Integer billinginformation_id, @RequestParam Integer related_users_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", usersDAO.findUsersByPrimaryKey(related_users_id));
		mav.addObject("billinginformation_id", billinginformation_id);
		mav.setViewName("billinginformation/users/deleteUsers.jsp");

		return mav;
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping("/newBillinginformationUsers")
	public ModelAndView newBillinginformationUsers(@RequestParam Integer billinginformation_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("billinginformation_id", billinginformation_id);
		mav.addObject("users", new Users());
		mav.addObject("newFlag", true);
		mav.setViewName("billinginformation/users/editUsers.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/billinginformationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Users entity
	 * 
	 */
	@RequestMapping("/editBillinginformationUsers")
	public ModelAndView editBillinginformationUsers(@RequestParam Integer billinginformation_id, @RequestParam Integer users_id) {
		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("billinginformation_id", billinginformation_id);
		mav.addObject("users", users);
		mav.setViewName("billinginformation/users/editUsers.jsp");

		return mav;
	}

	/**
	 * Select the Billinginformation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBillinginformation")
	public ModelAndView confirmDeleteBillinginformation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", billinginformationDAO.findBillinginformationByPrimaryKey(idKey));
		mav.setViewName("billinginformation/deleteBillinginformation.jsp");

		return mav;
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/saveBillinginformation")
	public String saveBillinginformation(@ModelAttribute Billinginformation billinginformation) {
		billinginformationService.saveBillinginformation(billinginformation);
		return "forward:/indexBillinginformation";
	}

	/**
	 * Select an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/selectBillinginformation")
	public ModelAndView selectBillinginformation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", billinginformationDAO.findBillinginformationByPrimaryKey(idKey));
		mav.setViewName("billinginformation/viewBillinginformation.jsp");

		return mav;
	}

	/**
	 * Create a new Billinginformation entity
	 * 
	 */
	@RequestMapping("/newBillinginformation")
	public ModelAndView newBillinginformation() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", new Billinginformation());
		mav.addObject("newFlag", true);
		mav.setViewName("billinginformation/editBillinginformation.jsp");

		return mav;
	}

	/**
	 * Edit an existing Billinginformation entity
	 * 
	 */
	@RequestMapping("/editBillinginformation")
	public ModelAndView editBillinginformation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("billinginformation", billinginformationDAO.findBillinginformationByPrimaryKey(idKey));
		mav.setViewName("billinginformation/editBillinginformation.jsp");

		return mav;
	}
}