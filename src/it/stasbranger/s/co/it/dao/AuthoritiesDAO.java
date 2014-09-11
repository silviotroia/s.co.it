package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Authorities;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Authorities entities.
 * 
 */
public interface AuthoritiesDAO extends JpaDao<Authorities> {

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 */
	public Authorities findAuthoritiesByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 */
	public Authorities findAuthoritiesByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 */
	public Set<Authorities> findAllAuthoritiess() throws DataAccessException;

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 */
	public Set<Authorities> findAllAuthoritiess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityNameContaining
	 *
	 */
	public Set<Authorities> findAuthoritiesByAuthorityNameContaining(String authorityName) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityNameContaining
	 *
	 */
	public Set<Authorities> findAuthoritiesByAuthorityNameContaining(String authorityName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 */
	public Authorities findAuthoritiesById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 */
	public Authorities findAuthoritiesById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityName
	 *
	 */
	public Set<Authorities> findAuthoritiesByAuthorityName(String authorityName_1) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByAuthorityName
	 *
	 */
	public Set<Authorities> findAuthoritiesByAuthorityName(String authorityName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByVersion
	 *
	 */
	public Set<Authorities> findAuthoritiesByVersion(java.util.Calendar version) throws DataAccessException;

	/**
	 * JPQL Query - findAuthoritiesByVersion
	 *
	 */
	public Set<Authorities> findAuthoritiesByVersion(Calendar version, int startResult, int maxRows) throws DataAccessException;

}