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
 * Unit test for the <code>BillinginformationController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.BillinginformationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class BillinginformationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listBillinginformationUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistBillinginformationUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listBillinginformationUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBillinginformation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBillinginformation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBillinginformation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>billinginformationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbillinginformationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/billinginformationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BillinginformationController controller = (BillinginformationController) context.getBean("BillinginformationController");

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