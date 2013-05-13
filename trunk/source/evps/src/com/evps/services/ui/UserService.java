package com.evps.services.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.omg.CORBA.UserException;

import com.evps.dao.test.UserDAO;
import com.evps.dataaccess.model.User;

// Will map the resource to the URL Users
@Path("/users")
public class UserService {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("evp-dao");
	UserDAO dao = new UserDAO(emf);
	
	// Return the list of Users for applications
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<User> getUsers() {
		List<User> Users = new ArrayList<User>();
		try {
			Users.addAll(dao.list());
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
		return Users;
	}

	// retuns the number of Users
	// Use
	// http://localhost:8080/de.vogella.jersey.User/rest/Users/count
	// to get the total number of records
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		int count=0;
		try {
			count = dao.list().size();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return String.valueOf(count);
	}

	// Defines that the next path parameter after Users is
	// treated as a parameter and passed to the UserResources
	// Allows to type
	// http://localhost:8080/de.vogella.jersey.User/rest/Users/1
	// 1 will be treaded as parameter User and passed to
	// UserResource
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") String id) {
		System.out.println("in this"+id);
		User user = null;
		try {
			user = dao.list().get(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("value:"+user);
		return user;
	}

}
