package com.poc.service;

import java.util.ArrayList;
import java.util.List;
import com.poc.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDemographicRepository userRepo;
	
	
	public List<UserDemographic> getAllUsers() {
		
		return (List<UserDemographic>)userRepo.findAll();
	}

	public void createUser() {
		AddressDetails ad=new AddressDetails(1, "hyderabad");
		List<AddressDetails> adlist=new ArrayList<AddressDetails>();
		adlist.add(ad);
		
		
		ProfessionalExperience pe=new ProfessionalExperience("DICP", 1);
		List<ProfessionalExperience> peList=new ArrayList<ProfessionalExperience>();
		peList.add(pe);
		
		EducationQualification eq=new EducationQualification(1, "BTECH");
		List<EducationQualification> eqList=new ArrayList<EducationQualification>();
		eqList.add(eq);
		
		UserType ut=new UserType(1, "Employee");
		
		
		UserDemographic ud=new UserDemographic(1, "AMarendra", ut, adlist, peList, eqList);
		userRepo.save(ud);
	}

	public UserService() {
		super();
			}
	
	
}
