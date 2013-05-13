package com.evps.services.dataaccess.test;

import java.util.HashMap;
import java.util.Map;

import com.evps.services.ui.Organisation;

public class OrganisationDao{
		
	  private Map<String, Organisation> contentProvider = new HashMap<String, Organisation>();
	  
	  private OrganisationDao() {
	    
	    Organisation org = new Organisation("1","School", "Oxford School");
	    contentProvider.put("1", org);
	    org = new Organisation("2","LEA", "Hampshire Council");
	    contentProvider.put("2", org);	    
	  }
	  
	  public Map<String, Organisation> getModel(){
	    return contentProvider;
	  }

	  public static OrganisationDao getInstance(){
		  OrganisationDao dao = new OrganisationDao();
		  return dao;
	  }
}
