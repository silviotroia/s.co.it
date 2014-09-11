package it.stasbranger.s.co.it.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>UsersRestController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.rest.UsersRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class UsersRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Usersusers_iddomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_iddomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/domains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_iddomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_iddomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/domains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_iddomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_iddomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/domains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_iddomainsdomain_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_iddomainsdomain_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/domains/{domain_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_iddomainsdomain_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_iddomainsdomain_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/domains/{domain_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idauthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritiesesauthorities_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idauthoritiesesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idauthoritiesesauthorities_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idauthoritiesesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/authoritieses/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idbillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idbillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/billinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idbillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsersusers_idbillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/billinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idbillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsersusers_idbillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/billinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idbillinginformationsbillinginformation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_idbillinginformationsbillinginformation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/billinginformations/{billinginformation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_idbillinginformationsbillinginformation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_idbillinginformationsbillinginformation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}/billinginformations/{billinginformation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Users()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Usersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteUsersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersRestController controller = (UsersRestController) context.getBean("UsersRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}