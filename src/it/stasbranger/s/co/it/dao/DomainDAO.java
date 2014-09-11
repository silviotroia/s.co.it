package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Domain;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Domain entities.
 * 
 */
public interface DomainDAO extends JpaDao<Domain> {

	/**
	 * JPQL Query - findDomainByVersion
	 *
	 */
	public Set<Domain> findDomainByVersion(java.util.Calendar version) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByVersion
	 *
	 */
	public Set<Domain> findDomainByVersion(Calendar version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByFullnameContaining
	 *
	 */
	public Set<Domain> findDomainByFullnameContaining(String fullname) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByFullnameContaining
	 *
	 */
	public Set<Domain> findDomainByFullnameContaining(String fullname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByName
	 *
	 */
	public Set<Domain> findDomainByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByName
	 *
	 */
	public Set<Domain> findDomainByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByPrimaryKey
	 *
	 */
	public Domain findDomainByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByPrimaryKey
	 *
	 */
	public Domain findDomainByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByNameContaining
	 *
	 */
	public Set<Domain> findDomainByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByNameContaining
	 *
	 */
	public Set<Domain> findDomainByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDomains
	 *
	 */
	public Set<Domain> findAllDomains() throws DataAccessException;

	/**
	 * JPQL Query - findAllDomains
	 *
	 */
	public Set<Domain> findAllDomains(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByVerified
	 *
	 */
	public Set<Domain> findDomainByVerified(Boolean verified) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByVerified
	 *
	 */
	public Set<Domain> findDomainByVerified(Boolean verified, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByFullname
	 *
	 */
	public Set<Domain> findDomainByFullname(String fullname_1) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByFullname
	 *
	 */
	public Set<Domain> findDomainByFullname(String fullname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainById
	 *
	 */
	public Domain findDomainById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDomainById
	 *
	 */
	public Domain findDomainById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByEnabled
	 *
	 */
	public Set<Domain> findDomainByEnabled(Boolean enabled) throws DataAccessException;

	/**
	 * JPQL Query - findDomainByEnabled
	 *
	 */
	public Set<Domain> findDomainByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException;

}