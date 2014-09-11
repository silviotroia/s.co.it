package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */
public interface UsersService {

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	public Users deleteUsersBillinginformations(Integer users_id, Integer related_billinginformations_id);

	/**
	 * Return a count of all Users entity
	 * 
	 */
	public Integer countUserss();

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	public Users saveUsersAuthoritieses(Integer id, Authorities related_authoritieses);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public void saveUsers(Users users);

	/**
	 * Return all Users entity
	 * 
	 */
	public List<Users> findAllUserss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public void deleteUsers(Users users_1);

	/**
	 * Load an existing Users entity
	 * 
	 */
	public Set<Users> loadUserss();

	/**
	 * Save an existing Domain entity
	 * 
	 */
	public Users saveUsersDomains(Integer id_1, Domain related_domains);

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	public Users deleteUsersDomains(Integer users_id_1, Integer related_domains_id);

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	public Users deleteUsersAuthoritieses(Integer users_id_2, Integer related_authoritieses_id);

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	public Users saveUsersBillinginformations(Integer id_2, Billinginformation related_billinginformations);

	/**
	 */
	public Users findUsersByPrimaryKey(Integer id_3);
}