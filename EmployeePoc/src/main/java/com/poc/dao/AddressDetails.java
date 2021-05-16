package com.poc.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Address_Details")
public class AddressDetails {

	public AddressDetails() {
		super();
	}
	
	public AddressDetails(int id, String currentCity) {
		super();
		this.id = id;
		CurrentCity = currentCity;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Current_City")
	String CurrentCity;
	

	public String getCurrentCity() {
		return CurrentCity;
	}

	public void setCurrentCity(String currentCity) {
		CurrentCity = currentCity;
	}

	//@ManyToOne
    //private UserDemographic UserDemographic;
}
