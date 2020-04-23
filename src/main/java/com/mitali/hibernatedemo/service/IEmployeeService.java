package com.mitali.hibernatedemo.service;

import com.mitali.hibernatedemo.entity.domain.Employee;
import com.mitali.hibernatedemo.entity.request.EmployeePostRequest;
import com.mitali.hibernatedemo.entity.request.EmployeePutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;

public interface IEmployeeService {
	
	public Employee addEmployee(EmployeePostRequest empPostRequest);
	
	public Employee getEmployee(int id) throws NotFoundException;
	
	public Employee updateEmployee(int id,EmployeePutRequest personalPutRequest) throws NotFoundException;
	
	public void deleteEmployee(int id) throws NotFoundException; 
}
