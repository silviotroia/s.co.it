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
 * Unit test for the <code>ShortenController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.ShortenController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class ShortenControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteShorten()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteShorten() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteShorten");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>shortenControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetshortenControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/shortenController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShortenController controller = (ShortenController) context.getBean("ShortenController");

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