package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Authorities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Authorities entities.
 * 
 */
@Repository("AuthoritiesDAO")
@Transactional
public class AuthoritiesDAOImpl extends AbstractJpaDao<Authorities> implements
		AuthoritiesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Authorities.class }));

	/**
	 * EntityManager injected by Spring for persistence unit ConnectJ
	 *
	 */
	@PersistenceContext(unitName = "ConnectJ")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AuthoritiesDAOImpl
	 *
	 */
	public AuthoritiesDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 */
	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(Integer id) throws DataAccessException {

		return findAuthoritiesByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByPrimaryKey
	 *
	 */

	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAuthoritiesByPrimaryKey", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Authorities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 */
	@Transactional
	public Set<Authorities> findAllAuthoritiess() throws DataAccessException {

		return findAllAuthoritiess(-1, -1);
	}

	/**
	 * JPQL Query - findAllAuthoritiess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAllAuthoritiess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAuthoritiess", startResult, maxRows);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityNameContaining
	 *
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityNameContaining(String authorityName) throws DataAccessException {

		return findAuthoritiesByAuthorityNameContaining(authorityName, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityNameContaining(String authorityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByAuthorityNameContaining", startResult, maxRows, authorityName);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 */
	@Transactional
	public Authorities findAuthoritiesById(Integer id) throws DataAccessException {

		return findAuthoritiesById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesById
	 *
	 */

	@Transactional
	public Authorities findAuthoritiesById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAuthoritiesById", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Authorities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityName
	 *
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityName(String authorityName) throws DataAccessException {

		return findAuthoritiesByAuthorityName(authorityName, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByAuthorityName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByAuthorityName(String authorityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByAuthorityName", startResult, maxRows, authorityName);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAuthoritiesByVersion
	 *
	 */
	@Transactional
	public Set<Authorities> findAuthoritiesByVersion(java.util.Calendar version) throws DataAccessException {

		return findAuthoritiesByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findAuthoritiesByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Authorities> findAuthoritiesByVersion(java.util.Calendar version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAuthoritiesByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Authorities>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Authorities entity) {
		return true;
	}
}
