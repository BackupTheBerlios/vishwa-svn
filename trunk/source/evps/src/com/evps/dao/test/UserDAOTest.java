package com.evps.dao.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.omg.CORBA.UserException;

public class UserDAOTest {

	private EntityManagerFactory emf;
	private UserDAO dao;

	/**
	 * 
	 * Method to setup basic thing need for implementation like entiny manager
	 * 
	 * factory,entity manager etc.
	 * 
	 * @throws Exception
	 */

	protected void setUp() throws Exception

	{

		/**
		 * 
		 * Create the entity manager factory with the help of persistence.
		 * 
		 * @Param NameofPersistence unit form Persistence.xml
		 */

		emf = Persistence.createEntityManagerFactory("evp-dao");

		/**
		 * 
		 * create Departmanager
		 * 
		 * @Param Entity Manager Factory
		 */

		dao = new UserDAO(emf);

	}

	/**
	 * 
	 * Method to close entity manager and entity manager factory.
	 * 
	 * (i.e) Remove from the persistence context
	 * 
	 * @throws Exception
	 */

	protected void close() throws Exception

	{

		dao.close();

		emf.close();

	}

	public static void main(String args[])

	{

		System.out.println("Inside TestJPA main");

		UserDAOTest testJPA = new UserDAOTest();

		try

		{

			testJPA.setUp();

			testJPA.test();

			testJPA.close();

		}

		catch (Exception e)

		{

			e.printStackTrace();

		}

		System.out.println("End of TestJPA main");

	}

	private void test() {
		try {
			System.out.println(dao.list().toString());
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
