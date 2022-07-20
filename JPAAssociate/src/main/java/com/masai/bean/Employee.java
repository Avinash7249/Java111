package com.masai.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String ename;
	private String address;
	private int salary;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Department dept;
	
	
	
	
	public Department getDept() {
		return dept;
	}





	public void setDept(Department dept) {
		this.dept = dept;
	}





	public Employee() {
		super();
	}





	public int getEmpId() {
		return empId;
	}





	public void setEmpId(int empId) {
		this.empId = empId;
	}





	public String getEname() {
		return ename;
	}





	public void setEname(String ename) {
		this.ename = ename;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public int getSalary() {
		return salary;
	}





	public void setSalary(int salary) {
		this.salary = salary;
	}





	public Employee(int empId, String ename, String address, int salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}






	

}
