package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.dao.BillinginformationDAO;
import it.stasbranger.s.co.it.dao.UsersDAO;

import it.stasbranger.s.co.it.domain.Billinginformation;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Billinginformation entities
 * 
 */

@Service("BillinginformationService")
@Transactional
public class BillinginformationServiceImpl implements BillinginformationService {

	/**
	 * DAO injected by Spring that manages Billinginformation entities
	 * 
	 */
	@Autowired
	private BillinginformationDAO billinginformationDAO;

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new BillinginformationServiceImpl.
	 *
	 */
	public BillinginformationServiceImpl() {
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public Billinginformation deleteBillinginformationUsers(Integer billinginformation_id, Integer related_users_id) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation_id, -1, -1);
		Users related_users = usersDAO.findUsersByPrimaryKey(related_users_id, -1, -1);

		billinginformation.setUsers(null);
		related_users.getBillinginformations().remove(billinginformation);
		billinginformation = billinginformationDAO.store(billinginformation);
		billinginformationDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		usersDAO.remove(related_users);
		usersDAO.flush();

		return billinginformation;
	}

	/**
	 */
	@Transactional
	public Billinginformation findBillinginformationByPrimaryKey(Integer id) {
		return billinginformationDAO.findBillinginformationByPrimaryKey(id);
	}

	/**
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@Transactional
	public void deleteBillinginformation(Billinginformation billinginformation) {
		billinginformationDAO.remove(billinginformation);
		billinginformationDAO.flush();
	}

	/**
	 * Return all Billinginformation entity
	 * 
	 */
	@Transactional
	public List<Billinginformation> findAllBillinginformations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Billinginformation>(billinginformationDAO.findAllBillinginformations(startResult, maxRows));
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public Billinginformation saveBillinginformationUsers(Integer id, Users related_users) {
		Billinginformation billinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(id, -1, -1);
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

		billinginformation.setUsers(related_users);
		related_users.getBillinginformations().add(billinginformation);
		billinginformation = billinginformationDAO.store(billinginformation);
		billinginformationDAO.flush();

		related_users = usersDAO.store(related_users);
		usersDAO.flush();

		return billinginformation;
	}

	/**
	 * Save an existing Billinginformation entity
	 * 
	 */
	@Transactional
	public void saveBillinginformation(Billinginformation billinginformation) {
		Billinginformation existingBillinginformation = billinginformationDAO.findBillinginformationByPrimaryKey(billinginformation.getId());

		if (existingBillinginformation != null) {
			if (existingBillinginformation != billinginformation) {
				existingBillinginformation.setId(billinginformation.getId());
				existingBillinginformation.setVersion(billinginformation.getVersion());
				existingBillinginformation.setCompanyName(billinginformation.getCompanyName());
				existingBillinginformation.setVatNumber(billinginformation.getVatNumber());
				existingBillinginformation.setVat(billinginformation.getVat());
				existingBillinginformation.setAddress(billinginformation.getAddress());
				existingBillinginformation.setZipCode(billinginformation.getZipCode());
				existingBillinginformation.setCity(billinginformation.getCity());
				existingBillinginformation.setProvince(billinginformation.getProvince());
				existingBillinginformation.setCountry(billinginformation.getCountry());
			}
			billinginformation = billinginformationDAO.store(existingBillinginformation);
		} else {
			billinginformation = billinginformationDAO.store(billinginformation);
		}
		billinginformationDAO.flush();
	}

	/**
	 * Return a count of all Billinginformation entity
	 * 
	 */
	@Transactional
	public Integer countBillinginformations() {
		return ((Long) billinginformationDAO.createQuerySingleResult("select count(o) from Billinginformation o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Billinginformation entity
	 * 
	 */
	@Transactional
	public Set<Billinginformation> loadBillinginformations() {
		return billinginformationDAO.findAllBillinginformations();
	}
}
