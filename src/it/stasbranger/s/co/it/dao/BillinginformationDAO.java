package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Billinginformation;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Billinginformation entities.
 * 
 */
public interface BillinginformationDAO extends JpaDao<Billinginformation> {

	/**
	 * JPQL Query - findBillinginformationByVatNumber
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVatNumber(String vatNumber) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVatNumber
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVatNumber(String vatNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByProvince
	 *
	 */
	public Set<Billinginformation> findBillinginformationByProvince(String province) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByProvince
	 *
	 */
	public Set<Billinginformation> findBillinginformationByProvince(String province, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByZipCode
	 *
	 */
	public Set<Billinginformation> findBillinginformationByZipCode(String zipCode) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByZipCode
	 *
	 */
	public Set<Billinginformation> findBillinginformationByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationById
	 *
	 */
	public Billinginformation findBillinginformationById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationById
	 *
	 */
	public Billinginformation findBillinginformationById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByZipCodeContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByZipCodeContaining(String zipCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByZipCodeContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByZipCodeContaining(String zipCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVat
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVat(Integer vat) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVat
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVat(Integer vat, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByAddressContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByAddressContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByPrimaryKey
	 *
	 */
	public Billinginformation findBillinginformationByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByPrimaryKey
	 *
	 */
	public Billinginformation findBillinginformationByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVatNumberContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVatNumberContaining(String vatNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVatNumberContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVatNumberContaining(String vatNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByProvinceContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByProvinceContaining(String province_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByProvinceContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByProvinceContaining(String province_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByAddress
	 *
	 */
	public Set<Billinginformation> findBillinginformationByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByAddress
	 *
	 */
	public Set<Billinginformation> findBillinginformationByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCompanyNameContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCompanyNameContaining(String companyName) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCompanyNameContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCompanyName
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCompanyName(String companyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCompanyName
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCompanyName(String companyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCountry
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCountry(String country) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCountry
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCountry(String country, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVersion
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVersion(java.util.Calendar version) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByVersion
	 *
	 */
	public Set<Billinginformation> findBillinginformationByVersion(Calendar version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCity
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCity(String city) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCity
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCity(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCountryContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCountryContaining(String country_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCountryContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCountryContaining(String country_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBillinginformations
	 *
	 */
	public Set<Billinginformation> findAllBillinginformations() throws DataAccessException;

	/**
	 * JPQL Query - findAllBillinginformations
	 *
	 */
	public Set<Billinginformation> findAllBillinginformations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCityContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCityContaining(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findBillinginformationByCityContaining
	 *
	 */
	public Set<Billinginformation> findBillinginformationByCityContaining(String city_1, int startResult, int maxRows) throws DataAccessException;

}