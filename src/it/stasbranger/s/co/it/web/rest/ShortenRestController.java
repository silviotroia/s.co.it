package it.stasbranger.s.co.it.web.rest;

import it.stasbranger.s.co.it.dao.ShortenDAO;

import it.stasbranger.s.co.it.domain.Shorten;

import it.stasbranger.s.co.it.service.ShortenService;

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
 * Spring Rest controller that handles CRUD requests for Shorten entities
 * 
 */

@Controller("ShortenRestController")
public class ShortenRestController {

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
	 * Select an existing Shorten entity
	 * 
	 */
	@RequestMapping(value = "/Shorten/{shorten_id}", method = RequestMethod.GET)
	@ResponseBody
	public Shorten loadShorten(@PathVariable Integer shorten_id) {
		return shortenDAO.findShortenByPrimaryKey(shorten_id);
	}

	/**
	 * Show all Shorten entities
	 * 
	 */
	@RequestMapping(value = "/Shorten", method = RequestMethod.GET)
	@ResponseBody
	public List<Shorten> listShortens() {
		return new java.util.ArrayList<Shorten>(shortenService.loadShortens());
	}

	/**
	 * Save an existing Shorten entity
	 * 
	 */
	@RequestMapping(value = "/Shorten", method = RequestMethod.PUT)
	@ResponseBody
	public Shorten saveShorten(@RequestBody Shorten shorten) {
		shortenService.saveShorten(shorten);
		return shortenDAO.findShortenByPrimaryKey(shorten.getId());
	}

	/**
	 * Create a new Shorten entity
	 * 
	 */
	@RequestMapping(value = "/Shorten", method = RequestMethod.POST)
	@ResponseBody
	public Shorten newShorten(@RequestBody Shorten shorten) {
		shortenService.saveShorten(shorten);
		return shortenDAO.findShortenByPrimaryKey(shorten.getId());
	}

	/**
	 * Delete an existing Shorten entity
	 * 
	 */
	@RequestMapping(value = "/Shorten/{shorten_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteShorten(@PathVariable Integer shorten_id) {
		Shorten shorten = shortenDAO.findShortenByPrimaryKey(shorten_id);
		shortenService.deleteShorten(shorten);
	}
}