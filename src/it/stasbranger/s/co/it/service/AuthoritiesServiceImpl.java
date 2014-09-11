package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Authorities entities
 * 
 */

@Service("AuthoritiesService")
@Transactional
public class AuthoritiesServiceImpl implements AuthoritiesService {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new AuthoritiesServiceImpl.
	 *
	 */
	public AuthoritiesServiceImpl() {
	}

	/**
	 * Load an existing Authorities entity
	 * 
	 */
	@Transactional
	public Set<Authorities> loadAuthoritiess() {
		return authoritiesDAO.findAllAuthoritiess();
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Authorities deleteAuthoritiesUserses(Integer authorities_id, Integer related_userses_id) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities_id, -1, -1);
		Users related_userses = usersDAO.findUsersByPrimaryKey(related_userses_id, -1, -1);

		authorities.getUserses().remove(related_userses);
		related_userses.getAuthoritieses().remove(authorities);
		authorities = authoritiesDAO.store(authorities);
		authoritiesDAO.flush();

		related_userses = usersDAO.store(related_userses);
		usersDAO.flush();

		usersDAO.remove(related_userses);
		usersDAO.flush();

		return authorities;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Authorities saveAuthoritiesUserses(Integer id, Users related_userses) {
		Authorities authorities = authoritiesDAO.findAuthoritiesByPrimaryKey(id, -1, -1);
		Users existinguserses = usersDAO.findUsersByPrimaryKey(related_userses.getId());

		// copy into the existing record to preserve existing relationships
		if (existinguserses != null) {
			existinguserses.setId(related_userses.getId());
			existinguserses.setVersion(related_userses.getVersion());
			existinguserses.setUsername(related_userses.getUsername());
			existinguserses.setPassword(related_userses.getPassword());
			existinguserses.setEnabled(related_userses.getEnabled());
			existinguserses.setRegistrationDate(related_userses.getRegistrationDate());
			existinguserses.setUnconfirmed(related_userses.getUnconfirmed());
			existinguserses.setFirstName(related_userses.getFirstName());
			existinguserses.setLastName(related_userses.getLastName());
			existinguserses.setImage(related_userses.getImage());
			existinguserses.setImageUrl(related_userses.getImageUrl());
			existinguserses.setEmail(related_userses.getEmail());
			existinguserses.setExpiretime(related_userses.getExpiretime());
			related_userses = existinguserses;
		} else {
			related_userses = usersDAO.store(related_userses);
			usersDAO.flush();
		}

		authorities.getUserses().add(related_userses);
		related_userses.getAuthoritieses().add(authorities);
		authorities = authoritiesDAO.store(authorities);
		authoritiesDAO.flush();

		related_userses = usersDAO.store(related_userses);
		usersDAO.flush();

		return authorities;
	}

	/**
	 * Return all Authorities entity
	 * 
	 */
	@Transactional
	public List<Authorities> findAllAuthoritiess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Authorities>(authoritiesDAO.findAllAuthoritiess(startResult, maxRows));
	}

	/**
	 * Return a count of all Authorities entity
	 * 
	 */
	@Transactional
	public Integer countAuthoritiess() {
		return ((Long) authoritiesDAO.createQuerySingleResult("select count(o) from Authorities o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Authorities findAuthoritiesByPrimaryKey(Integer id) {
		return authoritiesDAO.findAuthoritiesByPrimaryKey(id);
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@Transactional
	public void saveAuthorities(Authorities authorities) {
		Authorities existingAuthorities = authoritiesDAO.findAuthoritiesByPrimaryKey(authorities.getId());

		if (existingAuthorities != null) {
			if (existingAuthorities != authorities) {
				existingAuthorities.setId(authorities.getId());
				existingAuthorities.setVersion(authorities.getVersion());
				existingAuthorities.setAuthorityName(authorities.getAuthorityName());
			}
			authorities = authoritiesDAO.store(existingAuthorities);
		} else {
			authorities = authoritiesDAO.store(authorities);
		}
		authoritiesDAO.flush();
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@Transactional
	public void deleteAuthorities(Authorities authorities) {
		authoritiesDAO.remove(authorities);
		authoritiesDAO.flush();
	}
}
