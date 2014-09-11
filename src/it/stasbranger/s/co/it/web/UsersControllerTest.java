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
 * Unit test for the <code>UsersController</code> controller.
 *
 * @see it.stasbranger.s.co.it.web.UsersController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class UsersControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsersDomains()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsersDomains() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsersDomains");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsersAuthoritieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsersAuthoritieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsersAuthoritieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsersBillinginformations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsersBillinginformations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsersBillinginformations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>usersControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetusersControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/usersController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsersController controller = (UsersController) context.getBean("UsersController");

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