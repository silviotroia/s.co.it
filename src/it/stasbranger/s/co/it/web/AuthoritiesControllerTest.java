package it.stasbranger.s.co.it.web;

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
 * Unit test for the <code>AuthoritiesController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.AuthoritiesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class AuthoritiesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAuthoritiesUserses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAuthoritiesUserses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAuthoritiesUserses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAuthorities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAuthorities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAuthorities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>authoritiesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetauthoritiesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/authoritiesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AuthoritiesController controller = (AuthoritiesController) context.getBean("AuthoritiesController");

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