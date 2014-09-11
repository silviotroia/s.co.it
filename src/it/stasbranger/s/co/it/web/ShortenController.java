package it.stasbranger.s.co.it.web;

import it.stasbranger.s.co.it.dao.ShortenDAO;

import it.stasbranger.s.co.it.domain.Shorten;

import it.stasbranger.s.co.it.service.ShortenService;

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
 * Spring MVC controller that handles CRUD requests for Shorten entities
 * 
 */

@Controller("ShortenController")
public class ShortenController {

	/**
	 * DAO injected by Spring that manages Shorten entities
	 * 
	 */
	@Autowired
	private ShortenDAO shortenDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Shorten entities
	 * 
	 */
	@Autowired
	private ShortenService shortenService;

	/**
	 * Save an existing Shorten entity
	 * 
	 */
	@RequestMapping("/saveShorten")
	public String saveShorten(@ModelAttribute Shorten shorten) {
		shortenService.saveShorten(shorten);
		return "forward:/indexShorten";
	}

	/**
	 * Select the Shorten entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteShorten")
	public ModelAndView confirmDeleteShorten(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shorten", shortenDAO.findShortenByPrimaryKey(idKey));
		mav.setViewName("shorten/deleteShorten.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/shortenController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Shorten entity
	 * 
	 */
	@RequestMapping("/selectShorten")
	public ModelAndView selectShorten(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shorten", shortenDAO.findShortenByPrimaryKey(idKey));
		mav.setViewName("shorten/viewShorten.jsp");

		return mav;
	}

	/**
	 * Edit an existing Shorten entity
	 * 
	 */
	@RequestMapping("/editShorten")
	public ModelAndView editShorten(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shorten", shortenDAO.findShortenByPrimaryKey(idKey));
		mav.setViewName("shorten/editShorten.jsp");

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
	 * Entry point to show all Shorten entities
	 * 
	 */
	public String indexShorten() {
		return "redirect:/indexShorten";
	}

	/**
	 * Show all Shorten entities
	 * 
	 */
	@RequestMapping("/indexShorten")
	public ModelAndView listShortens() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shortens", shortenService.loadShortens());

		mav.setViewName("shorten/listShortens.jsp");

		return mav;
	}

	/**
	 * Delete an existing Shorten entity
	 * 
	 */
	@RequestMapping("/deleteShorten")
	public String deleteShorten(@RequestParam Integer idKey) {
		Shorten shorten = shortenDAO.findShortenByPrimaryKey(idKey);
		shortenService.deleteShorten(shorten);
		return "forward:/indexShorten";
	}

	/**
	 * Create a new Shorten entity
	 * 
	 */
	@RequestMapping("/newShorten")
	public ModelAndView newShorten() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shorten", new Shorten());
		mav.addObject("newFlag", true);
		mav.setViewName("shorten/editShorten.jsp");

		return mav;
	}
}