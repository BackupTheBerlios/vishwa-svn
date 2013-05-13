package com.evps.dao.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.omg.CORBA.UserException;

import com.evps.dataaccess.model.User;

public class UserDAO {

	private EntityManager em;

	public UserDAO(EntityManagerFactory emf)

	{

		em = emf.createEntityManager();

	}

	public List<User> list() throws UserException {
		List<User> response = (List<User>) em.createQuery(
				"from " + User.class.getName()).getResultList();
		return response;
	}

	public void close()

	{

		em.close();

	}

}
