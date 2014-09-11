package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Domain;
import it.stasbranger.s.co.it.domain.Users;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
@Transactional
public class DomainServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected DomainService service;

	/**
	 * Instantiates a new DomainServiceTest.
	 *
	 */
	public DomainServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Domain entity
	 * 
	 */
	@Test
	public void findAllDomains() {
		// TODO: JUnit - Populate test inputs for operation: findAllDomains 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Domain> response = null;
		response = service.findAllDomains(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDomains
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveDomainUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveDomainUsers 
		Integer id = 0;
		Users related_users = new it.stasbranger.s.co.it.domain.Users();
		Domain response = null;
		response = service.saveDomainUsers(id, related_users);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDomainUsers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteDomainUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteDomainUsers 
		Integer domain_id = 0;
		Integer related_users_id = 0;
		Domain response = null;
		response = service.deleteDomainUsers(domain_id, related_users_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDomainUsers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Domain entity
	 * 
	 */
	@Test
	public void saveDomain() {
		// TODO: JUnit - Populate test inputs for operation: saveDomain 
		Domain domain = new it.stasbranger.s.co.it.domain.Domain();
		service.saveDomain(domain);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Domain entity
	 * 
	 */
	@Test
	public void loadDomains() {
		Set<Domain> response = null;
		response = service.loadDomains();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDomains
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Domain entity
	 * 
	 */
	@Test
	public void countDomains() {
		Integer response = null;
		response = service.countDomains();
		// TODO: JUnit - Add assertions to test outputs of operation: countDomains
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Domain entity
	 * 
	 */
	@Test
	public void deleteDomain() {
		// TODO: JUnit - Populate test inputs for operation: deleteDomain 
		Domain domain_1 = new it.stasbranger.s.co.it.domain.Domain();
		service.deleteDomain(domain_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDomainByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDomainByPrimaryKey 
		Integer id_1 = 0;
		Domain response = null;
		response = service.findDomainByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findDomainByPrimaryKey
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
