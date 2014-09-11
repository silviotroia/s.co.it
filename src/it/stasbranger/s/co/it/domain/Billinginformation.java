package it.stasbranger.s.co.it.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBillinginformations", query = "select myBillinginformation from Billinginformation myBillinginformation"),
		@NamedQuery(name = "findBillinginformationByAddress", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.address = ?1"),
		@NamedQuery(name = "findBillinginformationByAddressContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.address like ?1"),
		@NamedQuery(name = "findBillinginformationByCity", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.city = ?1"),
		@NamedQuery(name = "findBillinginformationByCityContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.city like ?1"),
		@NamedQuery(name = "findBillinginformationByCompanyName", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.companyName = ?1"),
		@NamedQuery(name = "findBillinginformationByCompanyNameContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.companyName like ?1"),
		@NamedQuery(name = "findBillinginformationByCountry", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.country = ?1"),
		@NamedQuery(name = "findBillinginformationByCountryContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.country like ?1"),
		@NamedQuery(name = "findBillinginformationById", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.id = ?1"),
		@NamedQuery(name = "findBillinginformationByPrimaryKey", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.id = ?1"),
		@NamedQuery(name = "findBillinginformationByProvince", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.province = ?1"),
		@NamedQuery(name = "findBillinginformationByProvinceContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.province like ?1"),
		@NamedQuery(name = "findBillinginformationByVat", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.vat = ?1"),
		@NamedQuery(name = "findBillinginformationByVatNumber", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.vatNumber = ?1"),
		@NamedQuery(name = "findBillinginformationByVatNumberContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.vatNumber like ?1"),
		@NamedQuery(name = "findBillinginformationByVersion", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.version = ?1"),
		@NamedQuery(name = "findBillinginformationByZipCode", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.zipCode = ?1"),
		@NamedQuery(name = "findBillinginformationByZipCodeContaining", query = "select myBillinginformation from Billinginformation myBillinginformation where myBillinginformation.zipCode like ?1") })
@Table(catalog = "dbscoit", name = "BillingInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "s.co.it/it/stasbranger/s/co/it/domain", name = "Billinginformation")
public class Billinginformation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "version", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar version;
	/**
	 */

	@Column(name = "company_name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String companyName;
	/**
	 */

	@Column(name = "vat_number", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String vatNumber;
	/**
	 */

	@Column(name = "vat", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer vat;
	/**
	 */

	@Column(name = "address", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "zip_code", length = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode;
	/**
	 */

	@Column(name = "city", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String city;
	/**
	 */

	@Column(name = "province", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String province;
	/**
	 */

	@Column(name = "country", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String country;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Users users;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setVersion(Calendar version) {
		this.version = version;
	}

	/**
	 */
	public Calendar getVersion() {
		return this.version;
	}

	/**
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 */
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	/**
	 */
	public String getVatNumber() {
		return this.vatNumber;
	}

	/**
	 */
	public void setVat(Integer vat) {
		this.vat = vat;
	}

	/**
	 */
	public Integer getVat() {
		return this.vat;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	/**
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 */
	public String getProvince() {
		return this.province;
	}

	/**
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 */
	@JsonIgnore
	public Users getUsers() {
		return users;
	}

	/**
	 */
	public Billinginformation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Billinginformation that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setCompanyName(that.getCompanyName());
		setVatNumber(that.getVatNumber());
		setVat(that.getVat());
		setAddress(that.getAddress());
		setZipCode(that.getZipCode());
		setCity(that.getCity());
		setProvince(that.getProvince());
		setCountry(that.getCountry());
		setUsers(that.getUsers());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("companyName=[").append(companyName).append("] ");
		buffer.append("vatNumber=[").append(vatNumber).append("] ");
		buffer.append("vat=[").append(vat).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("zipCode=[").append(zipCode).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("province=[").append(province).append("] ");
		buffer.append("country=[").append(country).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Billinginformation))
			return false;
		Billinginformation equalCheck = (Billinginformation) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
