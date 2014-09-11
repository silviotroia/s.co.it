package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Shorten;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Shorten entities
 * 
 */
public interface ShortenService {

	/**
	 * Return all Shorten entity
	 * 
	 */
	public List<Shorten> findAllShortens(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Shorten entity
	 * 
	 */
	public Set<Shorten> loadShortens();

	/**
	 * Delete an existing Shorten entity
	 * 
	 */
	public void deleteShorten(Shorten shorten);

	/**
	 */
	public Shorten findShortenByPrimaryKey(Integer id);

	/**
	 * Save an existing Shorten entity
	 * 
	 */
	public void saveShorten(Shorten shorten_1);

	/**
	 * Return a count of all Shorten entity
	 * 
	 */
	public Integer countShortens();
}