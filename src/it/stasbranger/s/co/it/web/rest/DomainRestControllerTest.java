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
 * Unit test for the <code>DomainRestController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.rest.DomainRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class DomainRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Domaindomain_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDomaindomain_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDomaindomain_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDomaindomain_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDomaindomain_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDomaindomain_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDomaindomain_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Domaindomain_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDomaindomain_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Domain/{domain_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainRestController controller = (DomainRestController) context.getBean("DomainRestController");

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