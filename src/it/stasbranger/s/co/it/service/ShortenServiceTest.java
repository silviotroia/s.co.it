package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Shorten;

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
public class ShortenServiceTest {

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
	protected ShortenService service;

	/**
	 * Instantiates a new ShortenServiceTest.
	 *
	 */
	public ShortenServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Shorten entity
	 * 
	 */
	@Test
	public void findAllShortens() {
		// TODO: JUnit - Populate test inputs for operation: findAllShortens 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Shorten> response = null;
		response = service.findAllShortens(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllShortens
	}

	/**
	 * Operation Unit Test
	 * Load an existing Shorten entity
	 * 
	 */
	@Test
	public void loadShortens() {
		Set<Shorten> response = null;
		response = service.loadShortens();
		// TODO: JUnit - Add assertions to test outputs of operation: loadShortens
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Shorten entity
	 * 
	 */
	@Test
	public void deleteShorten() {
		// TODO: JUnit - Populate test inputs for operation: deleteShorten 
		Shorten shorten = new it.stasbranger.s.co.it.domain.Shorten();
		service.deleteShorten(shorten);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findShortenByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findShortenByPrimaryKey 
		Integer id = 0;
		Shorten response = null;
		response = service.findShortenByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findShortenByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Shorten entity
	 * 
	 */
	@Test
	public void saveShorten() {
		// TODO: JUnit - Populate test inputs for operation: saveShorten 
		Shorten shorten_1 = new it.stasbranger.s.co.it.domain.Shorten();
		service.saveShorten(shorten_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Shorten entity
	 * 
	 */
	@Test
	public void countShortens() {
		Integer response = null;
		response = service.countShortens();
		// TODO: JUnit - Add assertions to test outputs of operation: countShortens
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
