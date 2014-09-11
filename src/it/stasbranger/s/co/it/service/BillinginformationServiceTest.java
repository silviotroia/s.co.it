package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Billinginformation;
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
public class BillinginformationServiceTest {

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
	protected BillinginformationService service;

	/**
	 * Instantiates a new BillinginformationServiceTest.
	 *
	 */
	public BillinginformationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteBillinginformationUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteBillinginformationUsers 
		Integer billinginformation_id = 0;
		Integer related_users_id = 0;
		Billinginformation response = null;
		response = service.deleteBillinginformationUsers(billinginformation_id, related_users_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBillinginformationUsers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBillinginformationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBillinginformationByPrimaryKey 
		Integer id = 0;
		Billinginformation response = null;
		response = service.findBillinginformationByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findBillinginformationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@Test
	public void deleteBillinginformation() {
		// TODO: JUnit - Populate test inputs for operation: deleteBillinginformation 
		Billinginformation billinginformation = new it.stasbranger.s.co.it.domain.Billinginformation();
		service.deleteBillinginformation(billinginformation);
	}

	/**
	 * Operation Unit Test
	 * Return all Billinginformation entity
	 * 
	 */
	@Test
	public void findAllBillinginformations() {
		// TODO: JUnit - Populate test inputs for operation: findAllBillinginformations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Billinginformation> response = null;
		response = service.findAllBillinginformations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBillinginformations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveBillinginformationUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveBillinginformationUsers 
		Integer id_1 = 0;
		Users related_users = new it.stasbranger.s.co.it.domain.Users();
		Billinginformation response = null;
		response = service.saveBillinginformationUsers(id_1, related_users);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBillinginformationUsers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Billinginformation entity
	 * 
	 */
	@Test
	public void saveBillinginformation() {
		// TODO: JUnit - Populate test inputs for operation: saveBillinginformation 
		Billinginformation billinginformation_1 = new it.stasbranger.s.co.it.domain.Billinginformation();
		service.saveBillinginformation(billinginformation_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Billinginformation entity
	 * 
	 */
	@Test
	public void countBillinginformations() {
		Integer response = null;
		response = service.countBillinginformations();
		// TODO: JUnit - Add assertions to test outputs of operation: countBillinginformations
	}

	/**
	 * Operation Unit Test
	 * Load an existing Billinginformation entity
	 * 
	 */
	@Test
	public void loadBillinginformations() {
		Set<Billinginformation> response = null;
		response = service.loadBillinginformations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBillinginformations
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
