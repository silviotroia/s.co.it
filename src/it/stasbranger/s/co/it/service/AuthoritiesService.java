package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Authorities entities
 * 
 */
public interface AuthoritiesService {

	/**
	 * Load an existing Authorities entity
	 * 
	 */
	public Set<Authorities> loadAuthoritiess();

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Authorities deleteAuthoritiesUserses(Integer authorities_id, Integer related_userses_id);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Authorities saveAuthoritiesUserses(Integer id, Users related_userses);

	/**
	 * Return all Authorities entity
	 * 
	 */
	public List<Authorities> findAllAuthoritiess(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Authorities entity
	 * 
	 */
	public Integer countAuthoritiess();

	/**
	 */
	public Authorities findAuthoritiesByPrimaryKey(Integer id_1);

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	public void saveAuthorities(Authorities authorities);

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	public void deleteAuthorities(Authorities authorities_1);
}