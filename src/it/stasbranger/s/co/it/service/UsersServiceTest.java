package it.stasbranger.s.co.it.service;

import it.stasbranger.s.co.it.domain.Authorities;
import it.stasbranger.s.co.it.domain.Billinginformation;
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
public class UsersServiceTest {

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
	protected UsersService service;

	/**
	 * Instantiates a new UsersServiceTest.
	 *
	 */
	public UsersServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Billinginformation entity
	 * 
	 */
	@Test
	public void deleteUsersBillinginformations() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersBillinginformations 
		Integer users_id = 0;
		Integer related_billinginformations_id = 0;
		Users response = null;
		response = service.deleteUsersBillinginformations(users_id, related_billinginformations_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersBillinginformations
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Users entity
	 * 
	 */
	@Test
	public void countUserss() {
		Integer response = null;
		response = service.countUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Authorities entity
	 * 
	 */
	@Test
	public void saveUsersAuthoritieses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersAuthoritieses 
		Integer id = 0;
		Authorities related_authoritieses = new it.stasbranger.s.co.it.domain.Authorities();
		Users response = null;
		response = service.saveUsersAuthoritieses(id, related_authoritieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersAuthoritieses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Users entity
	 * 
	 */
	@Test
	public void saveUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveUsers 
		Users users = new it.stasbranger.s.co.it.domain.Users();
		service.saveUsers(users);
	}

	/**
	 * Operation Unit Test
	 * Return all Users entity
	 * 
	 */
	@Test
	public void findAllUserss() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Users> response = null;
		response = service.findAllUserss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Users entity
	 * 
	 */
	@Test
	public void deleteUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsers 
		Users users_1 = new it.stasbranger.s.co.it.domain.Users();
		service.deleteUsers(users_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Users entity
	 * 
	 */
	@Test
	public void loadUserss() {
		Set<Users> response = null;
		response = service.loadUserss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Domain entity
	 * 
	 */
	@Test
	public void saveUsersDomains() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersDomains 
		Integer id_1 = 0;
		Domain related_domains = new it.stasbranger.s.co.it.domain.Domain();
		Users response = null;
		response = service.saveUsersDomains(id_1, related_domains);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersDomains
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Domain entity
	 * 
	 */
	@Test
	public void deleteUsersDomains() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersDomains 
		Integer users_id_1 = 0;
		Integer related_domains_id = 0;
		Users response = null;
		response = service.deleteUsersDomains(users_id_1, related_domains_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersDomains
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Authorities entity
	 * 
	 */
	@Test
	public void deleteUsersAuthoritieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsersAuthoritieses 
		Integer users_id_2 = 0;
		Integer related_authoritieses_id = 0;
		Users response = null;
		response = service.deleteUsersAuthoritieses(users_id_2, related_authoritieses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsersAuthoritieses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Billinginformation entity
	 * 
	 */
	@Test
	public void saveUsersBillinginformations() {
		// TODO: JUnit - Populate test inputs for operation: saveUsersBillinginformations 
		Integer id_2 = 0;
		Billinginformation related_billinginformations = new it.stasbranger.s.co.it.domain.Billinginformation();
		Users response = null;
		response = service.saveUsersBillinginformations(id_2, related_billinginformations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsersBillinginformations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsersByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsersByPrimaryKey 
		Integer id_3 = 0;
		Users response = null;
		response = service.findUsersByPrimaryKey(id_3);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsersByPrimaryKey
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
