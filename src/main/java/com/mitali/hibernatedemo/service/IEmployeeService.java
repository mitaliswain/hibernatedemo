package com.mitali.hibernatedemo.service;

//import com.mitali.personal.exception.NotFoundException;
import com.mitali.hibernatedemo.entity.domain.Employee;
import com.mitali.hibernatedemo.entity.request.EmployeePostRequest;
import com.mitali.hibernatedemo.entity.request.EmployeePutRequest;

public interface IEmployeeService {
	public void addEmployee(EmployeePostRequest empPostRequest);
/*	public Employee getPersonaltDetails(int id) throws NotFoundException;
	
	public Employee updatePersonalDetails(int id,EmployeePutRequest personalPutRequest) throws NotFoundException;
	
	public void deletePersonalDetails(int id) throws NotFoundException; */
}
