package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Billinginformation entities
 * 
 */
public interface BillinginformationService {

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Billinginformation deleteBillinginformationUsers(Integer billinginformation_id, Integer related_users_id);

	/**
	 */
	public Billinginformation findBillinginformationByPrimaryKey(Integer id);

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	public void deleteBillinginformation(Billinginformation billinginformation);

	/**
	 * Return all Billinginformation entity
	 * 
	 */
	public List<Billinginformation> findAllBillinginformations(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Billinginformation saveBillinginformationUsers(Integer id_1, Users related_users);

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	public void saveBillinginformation(Billinginformation billinginformation_1);

	/**
	 * Return a count of all Billinginformation entity
	 * 
	 */
	public Integer countBillinginformations();

	/**
	 * Load an existing Billinginformation entity
	 * 
	 */
	public Set<Billinginformation> loadBillinginformations();
}