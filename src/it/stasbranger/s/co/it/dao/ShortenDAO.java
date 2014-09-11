package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Shorten;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Shorten entities.
 * 
 */
public interface ShortenDAO extends JpaDao<Shorten> {

	/**
	 * JPQL Query - findAllShortens
	 *
	 */
	public Set<Shorten> findAllShortens() throws DataAccessException;

	/**
	 * JPQL Query - findAllShortens
	 *
	 */
	public Set<Shorten> findAllShortens(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByTitleContaining
	 *
	 */
	public Set<Shorten> findShortenByTitleContaining(String title) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByTitleContaining
	 *
	 */
	public Set<Shorten> findShortenByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByVersion
	 *
	 */
	public Set<Shorten> findShortenByVersion(java.util.Calendar version) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByVersion
	 *
	 */
	public Set<Shorten> findShortenByVersion(Calendar version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByCreationDate
	 *
	 */
	public Set<Shorten> findShortenByCreationDate(java.util.Calendar creationDate) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByCreationDate
	 *
	 */
	public Set<Shorten> findShortenByCreationDate(Calendar creationDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByHits
	 *
	 */
	public Set<Shorten> findShortenByHits(Integer hits) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByHits
	 *
	 */
	public Set<Shorten> findShortenByHits(Integer hits, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByPrimaryKey
	 *
	 */
	public Shorten findShortenByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByPrimaryKey
	 *
	 */
	public Shorten findShortenByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByUri
	 *
	 */
	public Set<Shorten> findShortenByUri(String uri) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByUri
	 *
	 */
	public Set<Shorten> findShortenByUri(String uri, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByUserId
	 *
	 */
	public Set<Shorten> findShortenByUserId(Integer userId) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByUserId
	 *
	 */
	public Set<Shorten> findShortenByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDescription
	 *
	 */
	public Set<Shorten> findShortenByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDescription
	 *
	 */
	public Set<Shorten> findShortenByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByTitle
	 *
	 */
	public Set<Shorten> findShortenByTitle(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByTitle
	 *
	 */
	public Set<Shorten> findShortenByTitle(String title_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByEnabled
	 *
	 */
	public Set<Shorten> findShortenByEnabled(Boolean enabled) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByEnabled
	 *
	 */
	public Set<Shorten> findShortenByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByShorturiContaining
	 *
	 */
	public Set<Shorten> findShortenByShorturiContaining(String shorturi) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByShorturiContaining
	 *
	 */
	public Set<Shorten> findShortenByShorturiContaining(String shorturi, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByShorturi
	 *
	 */
	public Set<Shorten> findShortenByShorturi(String shorturi_1) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByShorturi
	 *
	 */
	public Set<Shorten> findShortenByShorturi(String shorturi_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByImage
	 *
	 */
	public Set<Shorten> findShortenByImage(String image) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByImage
	 *
	 */
	public Set<Shorten> findShortenByImage(String image, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByImageContaining
	 *
	 */
	public Set<Shorten> findShortenByImageContaining(String image_1) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByImageContaining
	 *
	 */
	public Set<Shorten> findShortenByImageContaining(String image_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDomainId
	 *
	 */
	public Set<Shorten> findShortenByDomainId(Integer domainId) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDomainId
	 *
	 */
	public Set<Shorten> findShortenByDomainId(Integer domainId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenById
	 *
	 */
	public Shorten findShortenById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findShortenById
	 *
	 */
	public Shorten findShortenById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDescriptionContaining
	 *
	 */
	public Set<Shorten> findShortenByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findShortenByDescriptionContaining
	 *
	 */
	public Set<Shorten> findShortenByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

}