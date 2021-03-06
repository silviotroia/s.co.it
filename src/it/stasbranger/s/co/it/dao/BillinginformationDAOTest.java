package it.stasbranger.s.co.it.dao;

import it.stasbranger.s.co.it.domain.Billinginformation;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/s.co.it-security-context.xml",
		"file:./src/s.co.it-service-context.xml",
		"file:./src/s.co.it-dao-context.xml",
		"file:./src/s.co.it-web-context.xml" })
public class BillinginformationDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private BillinginformationDAO dataStore;

	/**
	 * Instantiates a new BillinginformationDAOTest.
	 *
	 */
	public BillinginformationDAOTest() {
	}

	/**
	 * Method to test Billinginformation domain object.
	 *
	 */
	@Rollback(false)
	@Test
	public void Billinginformation() {
		Billinginformation instance = new Billinginformation();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	 */
	@Autowired
	public void setDataStore(BillinginformationDAO dataStore) {
		this.dataStore = dataStore;
	}
}
