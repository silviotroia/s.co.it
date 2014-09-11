package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Domain entities
 * 
 */
public interface DomainService {

	/**
	 * Return all Domain entity
	 * 
	 */
	public List<Domain> findAllDomains(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public Domain saveDomainUsers(Integer id, Users related_users);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public Domain deleteDomainUsers(Integer domain_id, Integer related_users_id);

	/**
	 * Save an existing Domain entity
	 * 
	 */
	public void saveDomain(Domain domain);

	/**
	 * Load an existing Domain entity
	 * 
	 */
	public Set<Domain> loadDomains();

	/**
	 * Return a count of all Domain entity
	 * 
	 */
	public Integer countDomains();

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	public void deleteDomain(Domain domain_1);

	/**
	 */
	public Domain findDomainByPrimaryKey(Integer id_1);
}