package com.evps.services.ui;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {

	private String id;
	private String description;
	private String summary;

	public Todo(String desc, String summary) {
		this.description= desc;
		this.summary=summary;
	}
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
