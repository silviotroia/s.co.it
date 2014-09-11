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
 * Unit test for the <code>BillinginformationRestController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.rest.BillinginformationRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class BillinginformationRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Billinginformationbillinginformation_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBillinginformationbillinginformation_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBillinginformationbillinginformation_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_idusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBillinginformationbillinginformation_idusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}/users");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBillinginformationbillinginformation_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_idusersusers_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBillinginformationbillinginformation_idusersusers_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}/users/{users_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBillinginformationbillinginformation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Billinginformationbillinginformation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBillinginformationbillinginformation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Billinginformation/{billinginformation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationRestController controller = (BillinginformationRestController) context.getBean("BillinginformationRestController");

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