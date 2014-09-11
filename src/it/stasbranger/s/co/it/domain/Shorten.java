package it.stasbranger.s.co.it.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllShortens", query = "select myShorten from Shorten myShorten"),
		@NamedQuery(name = "findShortenByCreationDate", query = "select myShorten from Shorten myShorten where myShorten.creationDate = ?1"),
		@NamedQuery(name = "findShortenByDescription", query = "select myShorten from Shorten myShorten where myShorten.description = ?1"),
		@NamedQuery(name = "findShortenByDescriptionContaining", query = "select myShorten from Shorten myShorten where myShorten.description like ?1"),
		@NamedQuery(name = "findShortenByDomainId", query = "select myShorten from Shorten myShorten where myShorten.domainId = ?1"),
		@NamedQuery(name = "findShortenByEnabled", query = "select myShorten from Shorten myShorten where myShorten.enabled = ?1"),
		@NamedQuery(name = "findShortenByHits", query = "select myShorten from Shorten myShorten where myShorten.hits = ?1"),
		@NamedQuery(name = "findShortenById", query = "select myShorten from Shorten myShorten where myShorten.id = ?1"),
		@NamedQuery(name = "findShortenByImage", query = "select myShorten from Shorten myShorten where myShorten.image = ?1"),
		@NamedQuery(name = "findShortenByImageContaining", query = "select myShorten from Shorten myShorten where myShorten.image like ?1"),
		@NamedQuery(name = "findShortenByPrimaryKey", query = "select myShorten from Shorten myShorten where myShorten.id = ?1"),
		@NamedQuery(name = "findShortenByShorturi", query = "select myShorten from Shorten myShorten where myShorten.shorturi = ?1"),
		@NamedQuery(name = "findShortenByShorturiContaining", query = "select myShorten from Shorten myShorten where myShorten.shorturi like ?1"),
		@NamedQuery(name = "findShortenByTitle", query = "select myShorten from Shorten myShorten where myShorten.title = ?1"),
		@NamedQuery(name = "findShortenByTitleContaining", query = "select myShorten from Shorten myShorten where myShorten.title like ?1"),
		@NamedQuery(name = "findShortenByUri", query = "select myShorten from Shorten myShorten where myShorten.uri = ?1"),
		@NamedQuery(name = "findShortenByUserId", query = "select myShorten from Shorten myShorten where myShorten.userId = ?1"),
		@NamedQuery(name = "findShortenByVersion", query = "select myShorten from Shorten myShorten where myShorten.version = ?1") })
@Table(catalog = "dbscoit", name = "shorten")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "s.co.it/it/stasbranger/s/co/it/domain", name = "Shorten")
public class Shorten implements Serializable {
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar creationDate;
	/**
	 */

	@Column(name = "enabled", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean enabled;
	/**
	 */

	@Column(name = "hits")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer hits;
	/**
	 */

	@Column(name = "shorturi", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String shorturi;
	/**
	 */

	@Column(name = "uri", nullable = false, columnDefinition = "TEXT")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String uri;
	/**
	 */

	@Column(name = "title")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String title;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "image")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String image;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer userId;
	/**
	 */

	@Column(name = "domain_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer domainId;

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
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 */
	public Calendar getCreationDate() {
		return this.creationDate;
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
	public void setHits(Integer hits) {
		this.hits = hits;
	}

	/**
	 */
	public Integer getHits() {
		return this.hits;
	}

	/**
	 */
	public void setShorturi(String shorturi) {
		this.shorturi = shorturi;
	}

	/**
	 */
	public String getShorturi() {
		return this.shorturi;
	}

	/**
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 */
	public String getUri() {
		return this.uri;
	}

	/**
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 */
	public String getImage() {
		return this.image;
	}

	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	/**
	 */
	public Integer getDomainId() {
		return this.domainId;
	}

	/**
	 */
	public Shorten() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Shorten that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setCreationDate(that.getCreationDate());
		setEnabled(that.getEnabled());
		setHits(that.getHits());
		setShorturi(that.getShorturi());
		setUri(that.getUri());
		setTitle(that.getTitle());
		setDescription(that.getDescription());
		setImage(that.getImage());
		setUserId(that.getUserId());
		setDomainId(that.getDomainId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("creationDate=[").append(creationDate).append("] ");
		buffer.append("enabled=[").append(enabled).append("] ");
		buffer.append("hits=[").append(hits).append("] ");
		buffer.append("shorturi=[").append(shorturi).append("] ");
		buffer.append("uri=[").append(uri).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("image=[").append(image).append("] ");
		buffer.append("userId=[").append(userId).append("] ");
		buffer.append("domainId=[").append(domainId).append("] ");

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
		if (!(obj instanceof Shorten))
			return false;
		Shorten equalCheck = (Shorten) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
