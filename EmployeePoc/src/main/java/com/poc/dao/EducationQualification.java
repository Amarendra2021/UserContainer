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
@Table(name = "Education_Qualification")
public class EducationQualification {
	
	public EducationQualification() {
		super();

	}

	public EducationQualification(int id, String highestQualification) {
		super();
		Id = id;
		HighestQualification = highestQualification;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	
	@Column(name = "Highest_Qualification")
	String HighestQualification;

	//@ManyToOne
   // private UserDemographic UserDemographic;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getHighestQualification() {
		return HighestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		HighestQualification = highestQualification;
	}
	
}
