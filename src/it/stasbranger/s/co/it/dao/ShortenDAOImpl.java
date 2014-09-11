package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Shorten;

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
 * DAO to manage Shorten entities.
 * 
 */
@Repository("ShortenDAO")
@Transactional
public class ShortenDAOImpl extends AbstractJpaDao<Shorten> implements
		ShortenDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Shorten.class }));

	/**
	 * EntityManager injected by Spring for persistence unit ConnectJ
	 *
	 */
	@PersistenceContext(unitName = "ConnectJ")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ShortenDAOImpl
	 *
	 */
	public ShortenDAOImpl() {
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
	 * JPQL Query - findAllShortens
	 *
	 */
	@Transactional
	public Set<Shorten> findAllShortens() throws DataAccessException {

		return findAllShortens(-1, -1);
	}

	/**
	 * JPQL Query - findAllShortens
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findAllShortens(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllShortens", startResult, maxRows);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByTitleContaining
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByTitleContaining(String title) throws DataAccessException {

		return findShortenByTitleContaining(title, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByTitleContaining", startResult, maxRows, title);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByVersion
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByVersion(java.util.Calendar version) throws DataAccessException {

		return findShortenByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByVersion(java.util.Calendar version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByCreationDate
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByCreationDate(java.util.Calendar creationDate) throws DataAccessException {

		return findShortenByCreationDate(creationDate, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByCreationDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByCreationDate(java.util.Calendar creationDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByCreationDate", startResult, maxRows, creationDate);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByHits
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByHits(Integer hits) throws DataAccessException {

		return findShortenByHits(hits, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByHits
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByHits(Integer hits, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByHits", startResult, maxRows, hits);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByPrimaryKey
	 *
	 */
	@Transactional
	public Shorten findShortenByPrimaryKey(Integer id) throws DataAccessException {

		return findShortenByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByPrimaryKey
	 *
	 */

	@Transactional
	public Shorten findShortenByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findShortenByPrimaryKey", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Shorten) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findShortenByUri
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByUri(String uri) throws DataAccessException {

		return findShortenByUri(uri, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByUri
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByUri(String uri, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByUri", startResult, maxRows, uri);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByUserId
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByUserId(Integer userId) throws DataAccessException {

		return findShortenByUserId(userId, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByUserId", startResult, maxRows, userId);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByDescription
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByDescription(String description) throws DataAccessException {

		return findShortenByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByTitle
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByTitle(String title) throws DataAccessException {

		return findShortenByTitle(title, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByTitle(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByTitle", startResult, maxRows, title);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByEnabled
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByEnabled(Boolean enabled) throws DataAccessException {

		return findShortenByEnabled(enabled, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByEnabled
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByEnabled", startResult, maxRows, enabled);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByShorturiContaining
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByShorturiContaining(String shorturi) throws DataAccessException {

		return findShortenByShorturiContaining(shorturi, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByShorturiContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByShorturiContaining(String shorturi, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByShorturiContaining", startResult, maxRows, shorturi);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByShorturi
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByShorturi(String shorturi) throws DataAccessException {

		return findShortenByShorturi(shorturi, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByShorturi
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByShorturi(String shorturi, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByShorturi", startResult, maxRows, shorturi);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByImage
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByImage(String image) throws DataAccessException {

		return findShortenByImage(image, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByImage
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByImage(String image, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByImage", startResult, maxRows, image);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByImageContaining
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByImageContaining(String image) throws DataAccessException {

		return findShortenByImageContaining(image, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByImageContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByImageContaining(String image, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByImageContaining", startResult, maxRows, image);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenByDomainId
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByDomainId(Integer domainId) throws DataAccessException {

		return findShortenByDomainId(domainId, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByDomainId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByDomainId(Integer domainId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByDomainId", startResult, maxRows, domainId);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * JPQL Query - findShortenById
	 *
	 */
	@Transactional
	public Shorten findShortenById(Integer id) throws DataAccessException {

		return findShortenById(id, -1, -1);
	}

	/**
	 * JPQL Query - findShortenById
	 *
	 */

	@Transactional
	public Shorten findShortenById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findShortenById", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Shorten) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findShortenByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Shorten> findShortenByDescriptionContaining(String description) throws DataAccessException {

		return findShortenByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findShortenByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Shorten> findShortenByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShortenByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Shorten>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Shorten entity) {
		return true;
	}
}
