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
 * Unit test for the <code>DomainController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.DomainController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class DomainControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDomainUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDomainUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDomainUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDomain()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDomain() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDomain");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>domainControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdomainControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/domainController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DomainController controller = (DomainController) context.getBean("DomainController");

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