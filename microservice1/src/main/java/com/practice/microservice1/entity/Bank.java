package com.practice.microservice1.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Document(collection="bank")

@Entity
@Table(name="details")
public class Bank {

	@Id
	private int id;
	private String bankname;
	private String name;
	private Long phoneno;
	private String state;
	
	public  Bank() {
		
	}
	public Bank(int id,String bankname,String name,Long phoneno,String state) {
		this.id=id;
		this.bankname=bankname;
		this.name=name;
		this.phoneno=phoneno;
		this.state=state;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBankname() {
		return bankname;
		
	}
	public void setBankname(String bankname) {
		this.bankname=bankname;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public Long getPhoneno() {
		return phoneno;
	}
	
	public void setPhoneno(Long phoneno) {
		this.phoneno=phoneno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	
}

