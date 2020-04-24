package com.mitali.hibernatedemo.service;


import org.springframework.stereotype.Service;

import com.mitali.hibernatedemo.entity.domain.Department;
import com.mitali.hibernatedemo.entity.request.DepartmentPostRequest;
import com.mitali.hibernatedemo.entity.request.DepartmentPutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;


@Service
public interface IDepartmentService {
	
	public Department addDepartment(DepartmentPostRequest departmentpostRequest);
	
	public Department getDepartment(int id) throws NotFoundException;
	
	public Department updateDepartment(int id,DepartmentPutRequest departmentPutRequest) throws NotFoundException;
	
	public void deleteDepartment(int id) throws NotFoundException;
	
}
