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
@Table(name = "Professional_Experience")
public class ProfessionalExperience {

	public ProfessionalExperience() {
		super();
	}

	public ProfessionalExperience(String currentCompany, int peId) {
		super();
		CurrentCompany = currentCompany;
		this.peId = peId;
	}

	@Column(name = "Current_Company")
	String CurrentCompany;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int peId;

	public String getCurrentCompany() {
		return CurrentCompany;
	}

	public void setCurrentCompany(String currentCompany) {
		CurrentCompany = currentCompany;
	}

	public int getPeId() {
		return peId;
	}

	public void setPeId(int peId) {
		this.peId = peId;
	}
	
	//@ManyToOne
  //  private UserDemographic UserDemographic;	
	
}
