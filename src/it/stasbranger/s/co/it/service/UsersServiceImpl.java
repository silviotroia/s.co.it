package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.dao.AuthoritiesDAO;
import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */

@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	/**
	 * DAO injected by Spring that manages Authorities entities
	 * 
	 */
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

	/**
	 * DAO injected by Spring that manages Billinginformation entities
	 * 
	 */
	@Autowired
	private BillinginformationDAO billinginformationDAO;

	/**
	 * DAO injected by Spring that manages Domain entities
	 * 
	 */
	@Autowired
	private DomainDAO domainDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new UsersServiceImpl.
	 *
	 */
	public UsersServiceImpl() {
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@Transactional
	public Users deleteUsersBillinginformations(Integer users_id, Integer related_billinginformations_id) {
		Billinginformation related_billinginformations = billinginformationDAO.findBillinginformationByPrimaryKey(related_billinginformations_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_billinginformations.setUsers(null);
		users.getBillinginformations().remove(related_billinginformations);

		billinginformationDAO.remove(related_billinginformations);
		billinginformationDAO.flush();

		return users;
	}

	/**
	 * Return a count of all Users entity
	 * 
	 */
	@Transactional
	public Integer countUserss() {
		return ((Long) usersDAO.createQuerySingleResult("select count(o) from Users o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Authorities entity
	 * 
	 */
	@Transactional
	public Users saveUsersAuthoritieses(Integer id, Authorities related_authoritieses) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Authorities existingauthoritieses = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingauthoritieses != null) {
			existingauthoritieses.setId(related_authoritieses.getId());
			existingauthoritieses.setVersion(related_authoritieses.getVersion());
			existingauthoritieses.setAuthorityName(related_authoritieses.getAuthorityName());
			related_authoritieses = existingauthoritieses;
		} else {
			related_authoritieses = authoritiesDAO.store(related_authoritieses);
			authoritiesDAO.flush();
		}

		related_authoritieses.getUserses().add(users);
		users.getAuthoritieses().add(related_authoritieses);
		related_authoritieses = authoritiesDAO.store(related_authoritieses);
		authoritiesDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public void saveUsers(Users users) {
		Users existingUsers = usersDAO.findUsersByPrimaryKey(users.getId());

		if (existingUsers != null) {
			if (existingUsers != users) {
				existingUsers.setId(users.getId());
				existingUsers.setVersion(users.getVersion());
				existingUsers.setUsername(users.getUsername());
				existingUsers.setPassword(users.getPassword());
				existingUsers.setEnabled(users.getEnabled());
				existingUsers.setRegistrationDate(users.getRegistrationDate());
				existingUsers.setUnconfirmed(users.getUnconfirmed());
				existingUsers.setFirstName(users.getFirstName());
				existingUsers.setLastName(users.getLastName());
				existingUsers.setImage(users.getImage());
				existingUsers.setImageUrl(users.getImageUrl());
				existingUsers.setEmail(users.getEmail());
				existingUsers.setExpiretime(users.getExpiretime());
			}
			users = usersDAO.store(existingUsers);
		} else {
			users = usersDAO.store(users);
		}
		usersDAO.flush();
	}

	/**
	 * Return all Users entity
	 * 
	 */
	@Transactional
	public List<Users> findAllUserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Users>(usersDAO.findAllUserss(startResult, maxRows));
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public void deleteUsers(Users users) {
		usersDAO.remove(users);
		usersDAO.flush();
	}

	/**
	 * Load an existing Users entity
	 * 
	 */
	@Transactional
	public Set<Users> loadUserss() {
		return usersDAO.findAllUserss();
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@Transactional
	public Users saveUsersDomains(Integer id, Domain related_domains) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Domain existingdomains = domainDAO.findDomainByPrimaryKey(related_domains.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdomains != null) {
			existingdomains.setId(related_domains.getId());
			existingdomains.setVersion(related_domains.getVersion());
			existingdomains.setName(related_domains.getName());
			existingdomains.setEnabled(related_domains.getEnabled());
			existingdomains.setFullname(related_domains.getFullname());
			existingdomains.setVerified(related_domains.getVerified());
			related_domains = existingdomains;
		}

		related_domains.setUsers(users);
		users.getDomains().add(related_domains);
		related_domains = domainDAO.store(related_domains);
		domainDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@Transactional
	public Users deleteUsersDomains(Integer users_id, Integer related_domains_id) {
		Domain related_domains = domainDAO.findDomainByPrimaryKey(related_domains_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_domains.setUsers(null);
		users.getDomains().remove(related_domains);

		domainDAO.remove(related_domains);
		domainDAO.flush();

		return users;
	}

	/**
	 * Delete an existing Authorities entity
	 * 
	 */
	@Transactional
	public Users deleteUsersAuthoritieses(Integer users_id, Integer related_authoritieses_id) {
		Authorities related_authoritieses = authoritiesDAO.findAuthoritiesByPrimaryKey(related_authoritieses_id, -1, -1);

		Users users = usersDAO.findUsersByPrimaryKey(users_id, -1, -1);

		related_authoritieses.getUserses().remove(users);
		users.getAuthoritieses().remove(related_authoritieses);

		authoritiesDAO.remove(related_authoritieses);
		authoritiesDAO.flush();

		return users;
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@Transactional
	public Users saveUsersBillinginformations(Integer id, Billinginformation related_billinginformations) {
		Users users = usersDAO.findUsersByPrimaryKey(id, -1, -1);
		Billinginformation existingbillinginformations = billinginformationDAO.findBillinginformationByPrimaryKey(related_billinginformations.getId());

		// copy into the existing record to preserve existing relationships
		if (existingbillinginformations != null) {
			existingbillinginformations.setId(related_billinginformations.getId());
			existingbillinginformations.setVersion(related_billinginformations.getVersion());
			existingbillinginformations.setCompanyName(related_billinginformations.getCompanyName());
			existingbillinginformations.setVatNumber(related_billinginformations.getVatNumber());
			existingbillinginformations.setVat(related_billinginformations.getVat());
			existingbillinginformations.setAddress(related_billinginformations.getAddress());
			existingbillinginformations.setZipCode(related_billinginformations.getZipCode());
			existingbillinginformations.setCity(related_billinginformations.getCity());
			existingbillinginformations.setProvince(related_billinginformations.getProvince());
			existingbillinginformations.setCountry(related_billinginformations.getCountry());
			related_billinginformations = existingbillinginformations;
		}

		related_billinginformations.setUsers(users);
		users.getBillinginformations().add(related_billinginformations);
		related_billinginformations = billinginformationDAO.store(related_billinginformations);
		billinginformationDAO.flush();

		users = usersDAO.store(users);
		usersDAO.flush();

		return users;
	}

	/**
	 */
	@Transactional
	public Users findUsersByPrimaryKey(Integer id) {
		return usersDAO.findUsersByPrimaryKey(id);
	}
}
