package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Users;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Users entities.
 * 
 */
public interface UsersDAO extends JpaDao<Users> {

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	public Set<Users> findUsersByEnabled(Boolean enabled) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	public Set<Users> findUsersByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersById
	 *
	 */
	public Users findUsersById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUsersById
	 *
	 */
	public Users findUsersById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByFirstName
	 *
	 */
	public Set<Users> findUsersByFirstName(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByFirstName
	 *
	 */
	public Set<Users> findUsersByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByFirstNameContaining
	 *
	 */
	public Set<Users> findUsersByFirstNameContaining(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByFirstNameContaining
	 *
	 */
	public Set<Users> findUsersByFirstNameContaining(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEmail
	 *
	 */
	public Set<Users> findUsersByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEmail
	 *
	 */
	public Set<Users> findUsersByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUnconfirmed
	 *
	 */
	public Set<Users> findUsersByUnconfirmed(Boolean unconfirmed) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUnconfirmed
	 *
	 */
	public Set<Users> findUsersByUnconfirmed(Boolean unconfirmed, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRegistrationDate
	 *
	 */
	public Set<Users> findUsersByRegistrationDate(java.util.Calendar registrationDate) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByRegistrationDate
	 *
	 */
	public Set<Users> findUsersByRegistrationDate(Calendar registrationDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByVersion
	 *
	 */
	public Set<Users> findUsersByVersion(java.util.Calendar version) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByVersion
	 *
	 */
	public Set<Users> findUsersByVersion(Calendar version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	public Set<Users> findUsersByUsernameContaining(String username) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	public Set<Users> findUsersByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByImageUrl
	 *
	 */
	public Set<Users> findUsersByImageUrl(String imageUrl) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByImageUrl
	 *
	 */
	public Set<Users> findUsersByImageUrl(String imageUrl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEmailContaining
	 *
	 */
	public Set<Users> findUsersByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEmailContaining
	 *
	 */
	public Set<Users> findUsersByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLastName
	 *
	 */
	public Set<Users> findUsersByLastName(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLastName
	 *
	 */
	public Set<Users> findUsersByLastName(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	public Set<Users> findUsersByUsername(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	public Set<Users> findUsersByUsername(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLastNameContaining
	 *
	 */
	public Set<Users> findUsersByLastNameContaining(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByLastNameContaining
	 *
	 */
	public Set<Users> findUsersByLastNameContaining(String lastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByExpiretime
	 *
	 */
	public Set<Users> findUsersByExpiretime(Integer expiretime) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByExpiretime
	 *
	 */
	public Set<Users> findUsersByExpiretime(Integer expiretime, int startResult, int maxRows) throws DataAccessException;

}