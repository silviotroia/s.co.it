package it.stasbranger.s.co.it.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
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
		@NamedQuery(name = "findAllUserss", query = "select myUsers from Users myUsers"),
		@NamedQuery(name = "findUsersByEmail", query = "select myUsers from Users myUsers where myUsers.email = ?1"),
		@NamedQuery(name = "findUsersByEmailContaining", query = "select myUsers from Users myUsers where myUsers.email like ?1"),
		@NamedQuery(name = "findUsersByEnabled", query = "select myUsers from Users myUsers where myUsers.enabled = ?1"),
		@NamedQuery(name = "findUsersByExpiretime", query = "select myUsers from Users myUsers where myUsers.expiretime = ?1"),
		@NamedQuery(name = "findUsersByFirstName", query = "select myUsers from Users myUsers where myUsers.firstName = ?1"),
		@NamedQuery(name = "findUsersByFirstNameContaining", query = "select myUsers from Users myUsers where myUsers.firstName like ?1"),
		@NamedQuery(name = "findUsersById", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByImageUrl", query = "select myUsers from Users myUsers where myUsers.imageUrl = ?1"),
		@NamedQuery(name = "findUsersByLastName", query = "select myUsers from Users myUsers where myUsers.lastName = ?1"),
		@NamedQuery(name = "findUsersByLastNameContaining", query = "select myUsers from Users myUsers where myUsers.lastName like ?1"),
		@NamedQuery(name = "findUsersByPassword", query = "select myUsers from Users myUsers where myUsers.password = ?1"),
		@NamedQuery(name = "findUsersByPasswordContaining", query = "select myUsers from Users myUsers where myUsers.password like ?1"),
		@NamedQuery(name = "findUsersByPrimaryKey", query = "select myUsers from Users myUsers where myUsers.id = ?1"),
		@NamedQuery(name = "findUsersByRegistrationDate", query = "select myUsers from Users myUsers where myUsers.registrationDate = ?1"),
		@NamedQuery(name = "findUsersByUnconfirmed", query = "select myUsers from Users myUsers where myUsers.unconfirmed = ?1"),
		@NamedQuery(name = "findUsersByUsername", query = "select myUsers from Users myUsers where myUsers.username = ?1"),
		@NamedQuery(name = "findUsersByUsernameContaining", query = "select myUsers from Users myUsers where myUsers.username like ?1"),
		@NamedQuery(name = "findUsersByVersion", query = "select myUsers from Users myUsers where myUsers.version = ?1") })
@Table(catalog = "dbscoit", name = "Users")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "s.co.it/it/stasbranger/s/co/it/domain", name = "Users")
@XmlRootElement(namespace = "s.co.it/it/stasbranger/s/co/it/domain")
public class Users implements Serializable {
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
	@Column(name = "version")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar version;
	/**
	 */

	@Column(name = "username", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
	/**
	 */

	@Column(name = "password", length = 45, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */

	@Column(name = "enabled", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean enabled;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "registration_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar registrationDate;
	/**
	 */

	@Column(name = "unconfirmed", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean unconfirmed;
	/**
	 */

	@Column(name = "first_name")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "last_name")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "image", columnDefinition = "BLOB")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] image;
	/**
	 */

	@Column(name = "imageUrl", columnDefinition = "LONGTEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String imageUrl;
	/**
	 */

	@Column(name = "email", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "expiretime", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer expiretime;

	/**
	 */
	@OneToMany(mappedBy = "users", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<it.stasbranger.s.co.it.domain.Domain> domains;
	/**
	 */
	@ManyToMany(mappedBy = "userses", fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<it.stasbranger.s.co.it.domain.Authorities> authoritieses;
	/**
	 */
	@OneToMany(mappedBy = "users", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<it.stasbranger.s.co.it.domain.Billinginformation> billinginformations;

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
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}

	/**
	 */
	public void setRegistrationDate(Calendar registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 */
	public Calendar getRegistrationDate() {
		return this.registrationDate;
	}

	/**
	 */
	public void setUnconfirmed(Boolean unconfirmed) {
		this.unconfirmed = unconfirmed;
	}

	/**
	 */
	public Boolean getUnconfirmed() {
		return this.unconfirmed;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	/**
	 */
	public byte[] getImage() {
		return this.image;
	}

	/**
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setExpiretime(Integer expiretime) {
		this.expiretime = expiretime;
	}

	/**
	 */
	public Integer getExpiretime() {
		return this.expiretime;
	}

	/**
	 */
	public void setDomains(Set<Domain> domains) {
		this.domains = domains;
	}

	/**
	 */
	@JsonIgnore
	public Set<Domain> getDomains() {
		if (domains == null) {
			domains = new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Domain>();
		}
		return domains;
	}

	/**
	 */
	public void setAuthoritieses(Set<Authorities> authoritieses) {
		this.authoritieses = authoritieses;
	}

	/**
	 */
	@JsonIgnore
	public Set<Authorities> getAuthoritieses() {
		if (authoritieses == null) {
			authoritieses = new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Authorities>();
		}
		return authoritieses;
	}

	/**
	 */
	public void setBillinginformations(Set<Billinginformation> billinginformations) {
		this.billinginformations = billinginformations;
	}

	/**
	 */
	@JsonIgnore
	public Set<Billinginformation> getBillinginformations() {
		if (billinginformations == null) {
			billinginformations = new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Billinginformation>();
		}
		return billinginformations;
	}

	/**
	 */
	public Users() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Users that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setEnabled(that.getEnabled());
		setRegistrationDate(that.getRegistrationDate());
		setUnconfirmed(that.getUnconfirmed());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setImage(that.getImage());
		setImageUrl(that.getImageUrl());
		setEmail(that.getEmail());
		setExpiretime(that.getExpiretime());
		setDomains(new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Domain>(that.getDomains()));
		setAuthoritieses(new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Authorities>(that.getAuthoritieses()));
		setBillinginformations(new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Billinginformation>(that.getBillinginformations()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");
		buffer.append("registrationDate=[").append(registrationDate).append("] ");
		buffer.append("unconfirmed=[").append(unconfirmed).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("image=[").append(image).append("] ");
		buffer.append("imageUrl=[").append(imageUrl).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("expiretime=[").append(expiretime).append("] ");

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
		if (!(obj instanceof Users))
			return false;
		Users equalCheck = (Users) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
