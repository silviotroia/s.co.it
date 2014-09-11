package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Billinginformation;

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
 * DAO to manage Billinginformation entities.
 * 
 */
@Repository("BillinginformationDAO")
@Transactional
public class BillinginformationDAOImpl extends AbstractJpaDao<Billinginformation>
		implements BillinginformationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Billinginformation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit ConnectJ
	 *
	 */
	@PersistenceContext(unitName = "ConnectJ")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BillinginformationDAOImpl
	 *
	 */
	public BillinginformationDAOImpl() {
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
	 * JPQL Query - findBillinginformationByVatNumber
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByVatNumber(String vatNumber) throws DataAccessException {

		return findBillinginformationByVatNumber(vatNumber, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByVatNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByVatNumber(String vatNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByVatNumber", startResult, maxRows, vatNumber);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByProvince
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByProvince(String province) throws DataAccessException {

		return findBillinginformationByProvince(province, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByProvince
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByProvince(String province, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByProvince", startResult, maxRows, province);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByZipCode
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByZipCode(String zipCode) throws DataAccessException {

		return findBillinginformationByZipCode(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByZipCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByZipCode", startResult, maxRows, zipCode);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationById
	 *
	 */
	@Transactional
	public Billinginformation findBillinginformationById(Integer id) throws DataAccessException {

		return findBillinginformationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationById
	 *
	 */

	@Transactional
	public Billinginformation findBillinginformationById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBillinginformationById", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Billinginformation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBillinginformationByZipCodeContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByZipCodeContaining(String zipCode) throws DataAccessException {

		return findBillinginformationByZipCodeContaining(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByZipCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByZipCodeContaining(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByZipCodeContaining", startResult, maxRows, zipCode);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByVat
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByVat(Integer vat) throws DataAccessException {

		return findBillinginformationByVat(vat, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByVat
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByVat(Integer vat, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByVat", startResult, maxRows, vat);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByAddressContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByAddressContaining(String address) throws DataAccessException {

		return findBillinginformationByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByPrimaryKey
	 *
	 */
	@Transactional
	public Billinginformation findBillinginformationByPrimaryKey(Integer id) throws DataAccessException {

		return findBillinginformationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByPrimaryKey
	 *
	 */

	@Transactional
	public Billinginformation findBillinginformationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBillinginformationByPrimaryKey", startResult, maxRows, id);
			return (it.stasbranger.s.co.it.domain.Billinginformation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBillinginformationByVatNumberContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByVatNumberContaining(String vatNumber) throws DataAccessException {

		return findBillinginformationByVatNumberContaining(vatNumber, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByVatNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByVatNumberContaining(String vatNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByVatNumberContaining", startResult, maxRows, vatNumber);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByProvinceContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByProvinceContaining(String province) throws DataAccessException {

		return findBillinginformationByProvinceContaining(province, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByProvinceContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByProvinceContaining(String province, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByProvinceContaining", startResult, maxRows, province);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByAddress
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByAddress(String address) throws DataAccessException {

		return findBillinginformationByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCompanyNameContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCompanyNameContaining(String companyName) throws DataAccessException {

		return findBillinginformationByCompanyNameContaining(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCompanyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCompanyNameContaining", startResult, maxRows, companyName);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCompanyName
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCompanyName(String companyName) throws DataAccessException {

		return findBillinginformationByCompanyName(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCompanyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCompanyName", startResult, maxRows, companyName);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCountry
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCountry(String country) throws DataAccessException {

		return findBillinginformationByCountry(country, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCountry
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCountry(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCountry", startResult, maxRows, country);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByVersion
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByVersion(java.util.Calendar version) throws DataAccessException {

		return findBillinginformationByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByVersion(java.util.Calendar version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCity
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCity(String city) throws DataAccessException {

		return findBillinginformationByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCity", startResult, maxRows, city);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCountryContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCountryContaining(String country) throws DataAccessException {

		return findBillinginformationByCountryContaining(country, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCountryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCountryContaining(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCountryContaining", startResult, maxRows, country);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBillinginformations
	 *
	 */
	@Transactional
	public Set<Billinginformation> findAllBillinginformations() throws DataAccessException {

		return findAllBillinginformations(-1, -1);
	}

	/**
	 * JPQL Query - findAllBillinginformations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findAllBillinginformations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBillinginformations", startResult, maxRows);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * JPQL Query - findBillinginformationByCityContaining
	 *
	 */
	@Transactional
	public Set<Billinginformation> findBillinginformationByCityContaining(String city) throws DataAccessException {

		return findBillinginformationByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findBillinginformationByCityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Billinginformation> findBillinginformationByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBillinginformationByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<Billinginformation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Billinginformation entity) {
		return true;
	}
}
