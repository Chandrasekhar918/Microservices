package com.project.Location.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="location_details")
public class Location {

private String location;
@Id
private int centerId;
private String centerName;
private String email;
private long contact;
private double cost;
private int totalCapacity;
private String description;

public Location() {
	
}
public Location(String location,int centerId, String centerName, String email, long contact, double cost, int totalCapacity,
		String description) {
	super();
	this.location=location;
	this.centerId = centerId;
	this.centerName = centerName;
	this.email = email;
	this.contact = contact;
	this.cost = cost;
	this.totalCapacity = totalCapacity;
	this.description = description;
}
public int getCenterId() {
	return centerId;
}
public void setCenterId(int centerId) {
	this.centerId = centerId;
}
public String getCenterName() {
	return centerName;
}
public void setCenterName(String centerName) {
	this.centerName = centerName;
}

public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public int getTotalCapacity() {
	return totalCapacity;
}
public void setTotalCapacity(int totalCapacity) {
	this.totalCapacity = totalCapacity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}
