package com.evps.services.ui;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.evps.services.dataaccess.test.OrganisationDao;

// Will map the resource to the URL Organisations
@Path("/organisations")
public class OrganisationsService {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	// Return the list of Organisations for applications
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Organisation> getOrganisations() {
		List<Organisation> Organisations = new ArrayList<Organisation>();
		Organisations.addAll(OrganisationDao.getInstance().getModel().values());
		System.out.println("Hello");
		return Organisations;
	}

	// retuns the number of Organisations
	// Use
	// http://localhost:8080/de.vogella.jersey.Organisation/rest/Organisations/count
	// to get the total number of records
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		int count = OrganisationDao.getInstance().getModel().size();
		return String.valueOf(count);
	}

	// Defines that the next path parameter after Organisations is
	// treated as a parameter and passed to the OrganisationResources
	// Allows to type
	// http://localhost:8080/de.vogella.jersey.Organisation/rest/Organisations/1
	// 1 will be treaded as parameter Organisation and passed to
	// OrganisationResource
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Organisation getOrganisation(@PathParam("id") String id) {
		System.out.println("in this"+id);
		System.out.println("value:"+OrganisationDao.getInstance().getModel().get(id));
		return OrganisationDao.getInstance().getModel().get(id);
	}

}
