package com.codingdojo.survey.model;

public class Survey {
	public String name;
	public String location;
	public String language;
	public String comments;
	public Survey(String name, String location, String language, String comments) {
		this.setName(name);
		this.setLocation(location);
		this.setLanguage(language);
		this.setComments(comments);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setComments(String comments) {
		this.comments=comments;
	}
	public String getComments() {
		return comments;
	}
}
