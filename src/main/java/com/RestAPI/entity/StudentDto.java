package com.RestAPI.entity;

public class StudentDto {
private Long id;
private String firstname;
private String lastname;
private String email;
private String contact;
//private String City;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastsname) {
	this.lastname = lastsname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
/*
 * public String getCity() { return City; } public void setCity(String city) {
 * City = city; }
 */
}
