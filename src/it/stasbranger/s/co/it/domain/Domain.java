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
		@NamedQuery(name = "findAllDomains", query = "select myDomain from Domain myDomain"),
		@NamedQuery(name = "findDomainByEnabled", query = "select myDomain from Domain myDomain where myDomain.enabled = ?1"),
		@NamedQuery(name = "findDomainByFullname", query = "select myDomain from Domain myDomain where myDomain.fullname = ?1"),
		@NamedQuery(name = "findDomainByFullnameContaining", query = "select myDomain from Domain myDomain where myDomain.fullname like ?1"),
		@NamedQuery(name = "findDomainById", query = "select myDomain from Domain myDomain where myDomain.id = ?1"),
		@NamedQuery(name = "findDomainByName", query = "select myDomain from Domain myDomain where myDomain.name = ?1"),
		@NamedQuery(name = "findDomainByNameContaining", query = "select myDomain from Domain myDomain where myDomain.name like ?1"),
		@NamedQuery(name = "findDomainByPrimaryKey", query = "select myDomain from Domain myDomain where myDomain.id = ?1"),
		@NamedQuery(name = "findDomainByVerified", query = "select myDomain from Domain myDomain where myDomain.verified = ?1"),
		@NamedQuery(name = "findDomainByVersion", query = "select myDomain from Domain myDomain where myDomain.version = ?1") })
@Table(catalog = "dbscoit", name = "Domain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "s.co.it/it/stasbranger/s/co/it/domain", name = "Domain")
public class Domain implements Serializable {
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

	@Column(name = "name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "enabled")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean enabled;
	/**
	 */

	@Column(name = "fullname")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fullname;
	/**
	 */

	@Column(name = "verified")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean verified;

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
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
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
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 */
	public String getFullname() {
		return this.fullname;
	}

	/**
	 */
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	/**
	 */
	public Boolean getVerified() {
		return this.verified;
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
	public Domain() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Domain that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setName(that.getName());
		setEnabled(that.getEnabled());
		setFullname(that.getFullname());
		setVerified(that.getVerified());
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
		buffer.append("name=[").append(name).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");
		buffer.append("fullname=[").append(fullname).append("] ");
		buffer.append("verified=[").append(verified).append("] ");

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
		if (!(obj instanceof Domain))
			return false;
		Domain equalCheck = (Domain) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
