package com.poc.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eId;
	
	@Column(name = "Name")
	String name;
	@Column(name = "Age")
	int age;
	public long geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeEntity(int eId, String name, int age) {
		super();
		this.eId = eId;
		this.name = name;
		this.age = age;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
