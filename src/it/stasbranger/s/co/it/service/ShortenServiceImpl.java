package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.dao.ShortenDAO;

import it.stasbranger.s.co.it.domain.Shorten;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Shorten entities
 * 
 */

@Service("ShortenService")
@Transactional
public class ShortenServiceImpl implements ShortenService {

	/**
	 * DAO injected by Spring that manages Shorten entities
	 * 
	 */
	@Autowired
	private ShortenDAO shortenDAO;

	/**
	 * Instantiates a new ShortenServiceImpl.
	 *
	 */
	public ShortenServiceImpl() {
	}

	/**
	 * Return all Shorten entity
	 * 
	 */
	@Transactional
	public List<Shorten> findAllShortens(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Shorten>(shortenDAO.findAllShortens(startResult, maxRows));
	}

	/**
	 * Load an existing Shorten entity
	 * 
	 */
	@Transactional
	public Set<Shorten> loadShortens() {
		return shortenDAO.findAllShortens();
	}

	/**
	 * Delete an existing Shorten entity
	 * 
	 */
	@Transactional
	public void deleteShorten(Shorten shorten) {
		shortenDAO.remove(shorten);
		shortenDAO.flush();
	}

	/**
	 */
	@Transactional
	public Shorten findShortenByPrimaryKey(Integer id) {
		return shortenDAO.findShortenByPrimaryKey(id);
	}

	/**
	 * Save an existing Shorten entity
	 * 
	 */
	@Transactional
	public void saveShorten(Shorten shorten) {
		Shorten existingShorten = shortenDAO.findShortenByPrimaryKey(shorten.getId());

		if (existingShorten != null) {
			if (existingShorten != shorten) {
				existingShorten.setId(shorten.getId());
				existingShorten.setVersion(shorten.getVersion());
				existingShorten.setCreationDate(shorten.getCreationDate());
				existingShorten.setEnabled(shorten.getEnabled());
				existingShorten.setHits(shorten.getHits());
				existingShorten.setShorturi(shorten.getShorturi());
				existingShorten.setUri(shorten.getUri());
				existingShorten.setTitle(shorten.getTitle());
				existingShorten.setDescription(shorten.getDescription());
				existingShorten.setImage(shorten.getImage());
				existingShorten.setUserId(shorten.getUserId());
				existingShorten.setDomainId(shorten.getDomainId());
			}
			shorten = shortenDAO.store(existingShorten);
		} else {
			shorten = shortenDAO.store(shorten);
		}
		shortenDAO.flush();
	}

	/**
	 * Return a count of all Shorten entity
	 * 
	 */
	@Transactional
	public Integer countShortens() {
		return ((Long) shortenDAO.createQuerySingleResult("select count(o) from Shorten o").getSingleResult()).intValue();
	}
}
