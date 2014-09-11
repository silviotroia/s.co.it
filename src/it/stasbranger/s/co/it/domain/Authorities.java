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
		@NamedQuery(name = "findAllAuthoritiess", query = "select myAuthorities from Authorities myAuthorities"),
		@NamedQuery(name = "findAuthoritiesByAuthorityName", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.authorityName = ?1"),
		@NamedQuery(name = "findAuthoritiesByAuthorityNameContaining", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.authorityName like ?1"),
		@NamedQuery(name = "findAuthoritiesById", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.id = ?1"),
		@NamedQuery(name = "findAuthoritiesByPrimaryKey", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.id = ?1"),
		@NamedQuery(name = "findAuthoritiesByVersion", query = "select myAuthorities from Authorities myAuthorities where myAuthorities.version = ?1") })
@Table(catalog = "dbscoit", name = "Authorities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "s.co.it/it/stasbranger/s/co/it/domain", name = "Authorities")
public class Authorities implements Serializable {
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

	@Column(name = "authorityName", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String authorityName;

	/**
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(catalog = "dbscoit", name = "Users_has_Authorities", joinColumns = { @JoinColumn(name = "Authorities_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Users_id", referencedColumnName = "id", nullable = false, updatable = false) })
	@XmlElement(name = "", namespace = "")
	java.util.Set<it.stasbranger.s.co.it.domain.Users> userses;

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
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	/**
	 */
	public String getAuthorityName() {
		return this.authorityName;
	}

	/**
	 */
	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	/**
	 */
	@JsonIgnore
	public Set<Users> getUserses() {
		if (userses == null) {
			userses = new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Users>();
		}
		return userses;
	}

	/**
	 */
	public Authorities() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Authorities that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setAuthorityName(that.getAuthorityName());
		setUserses(new java.util.LinkedHashSet<it.stasbranger.s.co.it.domain.Users>(that.getUserses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("authorityName=[").append(authorityName).append("] ");

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
		if (!(obj instanceof Authorities))
			return false;
		Authorities equalCheck = (Authorities) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
