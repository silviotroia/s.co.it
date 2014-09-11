package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Domain;

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
 * DAO to manage Domain entities.
 * 
 */
@Repository("DomainDAO")
@Transactional
public class DomainDAOImpl extends AbstractJpaDao<Domain> implements DomainDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Domain.class }));

	/**
	 * EntityManager injected by Spring for persistence unit ConnectJ
	 *
	 */
	@PersistenceContext(unitName = "ConnectJ")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DomainDAOImpl
	 *
	 */
	public DomainDAOImpl() {
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
	 * JPQL Query - findDomainByVersion
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByVersion(java.util.Calendar version) throws DataAccessException {

		return findDomainByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByVersion(java.util.Calendar version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainByFullnameContaining
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByFullnameContaining(String fullname) throws DataAccessException {

		return findDomainByFullnameContaining(fullname, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByFullnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByFullnameContaining(String fullname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByFullnameContaining", startResult, maxRows, fullname);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainByName
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByName(String name) throws DataAccessException {

		return findDomainByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByName", startResult, maxRows, name);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainByPrimaryKey
	 *
	 */
	@Transactional
	public Domain findDomainByPrimaryKey(Integer id) throws DataAccessException {

		return findDomainByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByPrimaryKey
	 *
	 */

	@Transactional
	public Domain findDomainByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDomainByPrimaryKey", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Domain) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDomainByNameContaining
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByNameContaining(String name) throws DataAccessException {

		return findDomainByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDomains
	 *
	 */
	@Transactional
	public Set<Domain> findAllDomains() throws DataAccessException {

		return findAllDomains(-1, -1);
	}

	/**
	 * JPQL Query - findAllDomains
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findAllDomains(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDomains", startResult, maxRows);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainByVerified
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByVerified(Boolean verified) throws DataAccessException {

		return findDomainByVerified(verified, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByVerified
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByVerified(Boolean verified, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByVerified", startResult, maxRows, verified);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainByFullname
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByFullname(String fullname) throws DataAccessException {

		return findDomainByFullname(fullname, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByFullname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByFullname(String fullname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByFullname", startResult, maxRows, fullname);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * JPQL Query - findDomainById
	 *
	 */
	@Transactional
	public Domain findDomainById(Integer id) throws DataAccessException {

		return findDomainById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDomainById
	 *
	 */

	@Transactional
	public Domain findDomainById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDomainById", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Domain) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDomainByEnabled
	 *
	 */
	@Transactional
	public Set<Domain> findDomainByEnabled(Boolean enabled) throws DataAccessException {

		return findDomainByEnabled(enabled, -1, -1);
	}

	/**
	 * JPQL Query - findDomainByEnabled
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Domain> findDomainByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDomainByEnabled", startResult, maxRows, enabled);
		return new LinkedHashSet<Domain>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Domain entity) {
		return true;
	}
}
