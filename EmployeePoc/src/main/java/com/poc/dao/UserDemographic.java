package com.poc.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.tomcat.jni.Address;

@Entity
@Table(name = "User_Demographic")
public class UserDemographic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column(name = "User_ID")
	int userId;
	
	@Column(name = "First_Name")
	String firstName;
	
	//for user_type table
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Type_ID")
    private UserType userTypeid;

	// Table : Address_details
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Demographic_Id" )
    private List<AddressDetails> addressDetails;
	
	// for Professional_Experience table
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_Demographic_Id")
	private List<ProfessionalExperience> professionalExperience;
	
	// for Education_Qualification table
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Demographic_Id")
	private List<EducationQualification> educationQualification;
	
	public List<EducationQualification> getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(List<EducationQualification> educationQualification) {
		educationQualification = educationQualification;
	}

	public List<ProfessionalExperience> getProfessionalExperience() {
		return professionalExperience;
	}

	public void setProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
		professionalExperience = professionalExperience;
	}

	public List<AddressDetails> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(List<AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
	}

	public UserDemographic() {
		super();
		}

	public UserDemographic(int userId, String firstName, UserType userTypeid, List<AddressDetails> addressDetails, List<ProfessionalExperience> professionalExperience,List<EducationQualification> educationQualification) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.userTypeid = userTypeid;
		this.addressDetails = addressDetails;
		this.professionalExperience=professionalExperience;
		this.educationQualification=educationQualification;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public UserType getUserTypeid() {
		return userTypeid;
	}

	public void setUserTypeid(UserType userTypeid) {
		this.userTypeid = userTypeid;
	}

// @Column(s) not allowed on a @OneToOne property: com.poc.dao.UserDemographic.userTypeid
}
