package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Authorities;
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
public class AuthoritiesServiceTest {

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
	protected AuthoritiesService service;

	/**
	 * Instantiates a new AuthoritiesServiceTest.
	 *
	 */
	public AuthoritiesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Authorities entity
	 * 
	 */
	@Test
	public void loadAuthoritiess() {
		Set<Authorities> response = null;
		response = service.loadAuthoritiess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAuthoritiess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteAuthoritiesUserses() {
		// TODO: JUnit - Populate test inputs for operation: deleteAuthoritiesUserses 
		Integer authorities_id = 0;
		Integer related_userses_id = 0;
		Authorities response = null;
		response = service.deleteAuthoritiesUserses(authorities_id, related_userses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAuthoritiesUserses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveAuthoritiesUserses() {
		// TODO: JUnit - Populate test inputs for operation: saveAuthoritiesUserses 
		Integer id = 0;
		Users related_userses = new it.stasbranger.s.co.it.domain.Users();
		Authorities response = null;
		response = service.saveAuthoritiesUserses(id, related_userses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAuthoritiesUserses
	}

	/**
	 * Operation Unit Test
	 * Return all Authorities entity
	 * 
	 */
	@Test
	public void findAllAuthoritiess() {
		// TODO: JUnit - Populate test inputs for operation: findAllAuthoritiess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Authorities> response = null;
		response = service.findAllAuthoritiess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAuthoritiess
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Authorities entity
	 * 
	 */
	@Test
	public void countAuthoritiess() {
		Integer response = null;
		response = service.countAuthoritiess();
		// TODO: JUnit - Add assertions to test outputs of operation: countAuthoritiess
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAuthoritiesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAuthoritiesByPrimaryKey 
		Integer id_1 = 0;
		Authorities response = null;
		response = service.findAuthoritiesByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAuthoritiesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Authorities entity
	 * 
	 */
	@Test
	public void saveAuthorities() {
		// TODO: JUnit - Populate test inputs for operation: saveAuthorities 
		Authorities authorities = new it.stasbranger.s.co.it.domain.Authorities();
		service.saveAuthorities(authorities);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Authorities entity
	 * 
	 */
	@Test
	public void deleteAuthorities() {
		// TODO: JUnit - Populate test inputs for operation: deleteAuthorities 
		Authorities authorities_1 = new it.stasbranger.s.co.it.domain.Authorities();
		service.deleteAuthorities(authorities_1);
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
