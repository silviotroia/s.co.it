package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.dao.DomainDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Domain entities
 * 
 */

@Service("DomainService")
@Transactional
public class DomainServiceImpl implements DomainService {

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
	 * Instantiates a new DomainServiceImpl.
	 *
	 */
	public DomainServiceImpl() {
	}

	/**
	 * Return all Domain entity
	 * 
	 */
	@Transactional
	public List<Domain> findAllDomains(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Domain>(domainDAO.findAllDomains(startResult, maxRows));
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Domain saveDomainUsers(Integer id, Users related_users) {
		Domain domain = domainDAO.findDomainByPrimaryKey(id, -1, -1);
		Users existingusers = usersDAO.findUsersByPrimaryKey(related_users.getId());

		// copy into the existing record to preserve existing relationships
		if (existingusers != null) {
			existingusers.setId(related_users.getId());
			existingusers.setVersion(related_users.getVersion());
			existingusers.setUsername(related_users.getUsername());
			existingusers.setPassword(related_users.getPassword());
			existingusers.setEnabled(related_users.getEnabled());
			existingusers.setRegistrationDate(related_users.getRegistrationDate());
			existingusers.setUnconfirmed(related_users.getUnconfirmed());
			existingusers.setFirstName(related_users.getFirstName());
			existingusers.setLastName(related_users.getLastName());
			existingusers.setImage(related_users.getImage());
			existingusers.setImageUrl(related_users.getImageUrl());
			existingusers.setEmail(related_users.getEmail());
			existingusers.setExpiretime(related_users.getExpiretime());
			related_users = existingusers;
		}

		domain.setUsers(related_users);
		related_users.getDomains().add(domain);
		domain = domainDAO.store(domain);
		domainDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		return domain;
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Domain deleteDomainUsers(Integer domain_id, Integer related_users_id) {
		Domain domain = domainDAO.findDomainByPrimaryKey(domain_id, -1, -1);
		Users related_users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		domain.setUsers(null);
		related_users.getDomains().remove(domain);
		domain = domainDAO.store(domain);
		domainDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		usersDAO.remove(related_users);
		usersDAO.flush();

		return domain;
	}

	/**
	 * Save an existing Domain entity
	 * 
	 */
	@Transactional
	public void saveDomain(Domain domain) {
		Domain existingDomain = domainDAO.findDomainByPrimaryKey(domain.getId());

		if (existingDomain != null) {
			if (existingDomain != domain) {
				existingDomain.setId(domain.getId());
				existingDomain.setVersion(domain.getVersion());
				existingDomain.setName(domain.getName());
				existingDomain.setEnabled(domain.getEnabled());
				existingDomain.setFullname(domain.getFullname());
				existingDomain.setVerified(domain.getVerified());
			}
			domain = domainDAO.store(existingDomain);
		} else {
			domain = domainDAO.store(domain);
		}
		domainDAO.flush();
	}

	/**
	 * Load an existing Domain entity
	 * 
	 */
	@Transactional
	public Set<Domain> loadDomains() {
		return domainDAO.findAllDomains();
	}

	/**
	 * Return a count of all Domain entity
	 * 
	 */
	@Transactional
	public Integer countDomains() {
		return ((Long) domainDAO.createQuerySingleResult("select count(o) from Domain o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Domain entity
	 * 
	 */
	@Transactional
	public void deleteDomain(Domain domain) {
		domainDAO.remove(domain);
		domainDAO.flush();
	}

	/**
	 */
	@Transactional
	public Domain findDomainByPrimaryKey(Integer id) {
		return domainDAO.findDomainByPrimaryKey(id);
	}
}
