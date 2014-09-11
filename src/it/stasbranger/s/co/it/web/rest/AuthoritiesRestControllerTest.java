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
 * Unit test for the <code>AuthoritiesRestController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.rest.AuthoritiesRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class AuthoritiesRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Authoritiesauthorities_iduserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAuthoritiesauthorities_iduserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}/userses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_iduserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAuthoritiesauthorities_iduserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}/userses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_iduserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAuthoritiesauthorities_iduserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}/userses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_idusersesusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAuthoritiesauthorities_idusersesusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}/userses/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_idusersesusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAuthoritiesauthorities_idusersesusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}/userses/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAuthoritiesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Authoritiesauthorities_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAuthoritiesauthorities_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Authorities/{authorities_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesRestController controller = (AuthoritiesRestController) context.getBean("AuthoritiesRestController");

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