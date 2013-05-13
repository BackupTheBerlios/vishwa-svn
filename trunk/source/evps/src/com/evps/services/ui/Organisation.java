package com.evps.services.ui;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Organisation {

	private String id;
	private String type;
	private String name;
	
	public Organisation(String id, String type, String name) {
		this.id=id;
		this.type=type;
		this.name=name;
	}
	
	public Organisation() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
