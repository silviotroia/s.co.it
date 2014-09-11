package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Users;

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
 * DAO to manage Users entities.
 * 
 */
@Repository("UsersDAO")
@Transactional
public class UsersDAOImpl extends AbstractJpaDao<Users> implements UsersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Users.class }));

	/**
	 * EntityManager injected by Spring for persistence unit ConnectJ
	 *
	 */
	@PersistenceContext(unitName = "ConnectJ")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsersDAOImpl
	 *
	 */
	public UsersDAOImpl() {
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
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled) throws DataAccessException {

		return findUsersByEnabled(enabled, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByEnabled", startResult, maxRows, enabled);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersById
	 *
	 */
	@Transactional
	public Users findUsersById(Integer id) throws DataAccessException {

		return findUsersById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersById
	 *
	 */

	@Transactional
	public Users findUsersById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersById", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByFirstName
	 *
	 */
	@Transactional
	public Set<Users> findUsersByFirstName(String firstName) throws DataAccessException {

		return findUsersByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException {

		return findUsersByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByFirstNameContaining(String firstName) throws DataAccessException {

		return findUsersByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByEmail
	 *
	 */
	@Transactional
	public Set<Users> findUsersByEmail(String email) throws DataAccessException {

		return findUsersByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUnconfirmed
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUnconfirmed(Boolean unconfirmed) throws DataAccessException {

		return findUsersByUnconfirmed(unconfirmed, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUnconfirmed
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUnconfirmed(Boolean unconfirmed, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUnconfirmed", startResult, maxRows, unconfirmed);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByRegistrationDate
	 *
	 */
	@Transactional
	public Set<Users> findUsersByRegistrationDate(java.util.Calendar registrationDate) throws DataAccessException {

		return findUsersByRegistrationDate(registrationDate, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByRegistrationDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByRegistrationDate(java.util.Calendar registrationDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByRegistrationDate", startResult, maxRows, registrationDate);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPassword(String password) throws DataAccessException {

		return findUsersByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByVersion
	 *
	 */
	@Transactional
	public Set<Users> findUsersByVersion(java.util.Calendar version) throws DataAccessException {

		return findUsersByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByVersion(java.util.Calendar version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username) throws DataAccessException {

		return findUsersByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByImageUrl
	 *
	 */
	@Transactional
	public Set<Users> findUsersByImageUrl(String imageUrl) throws DataAccessException {

		return findUsersByImageUrl(imageUrl, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByImageUrl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByImageUrl(String imageUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByImageUrl", startResult, maxRows, imageUrl);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByEmailContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByEmailContaining(String email) throws DataAccessException {

		return findUsersByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	@Transactional
	public Set<Users> findAllUserss() throws DataAccessException {

		return findAllUserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserss", startResult, maxRows);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer id) throws DataAccessException {

		return findUsersByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */

	@Transactional
	public Users findUsersByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByPrimaryKey", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByLastName
	 *
	 */
	@Transactional
	public Set<Users> findUsersByLastName(String lastName) throws DataAccessException {

		return findUsersByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUsername(String username) throws DataAccessException {

		return findUsersByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByLastNameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByLastNameContaining(String lastName) throws DataAccessException {

		return findUsersByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByExpiretime
	 *
	 */
	@Transactional
	public Set<Users> findUsersByExpiretime(Integer expiretime) throws DataAccessException {

		return findUsersByExpiretime(expiretime, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByExpiretime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByExpiretime(Integer expiretime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByExpiretime", startResult, maxRows, expiretime);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Users entity) {
		return true;
	}
}
