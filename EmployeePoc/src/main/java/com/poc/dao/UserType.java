package com.poc.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Type")
public class UserType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "User_Type_ID")
	int userTypeId;
	
	@Column(name = "User_Type_Name")
	String name;

	public UserType() {
		super();
	}
	
	public UserType(int userTypeId, String name) {
		super();
		this.userTypeId = userTypeId;
		this.name = name;
	}
	
	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
