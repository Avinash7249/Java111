package com.masai.Dao;



import java.util.List;

import com.masai.bean.Employee;

public interface EmployeeDao {
	
	
	public List<Employee> getAllEmployee(int empId);

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);

}
