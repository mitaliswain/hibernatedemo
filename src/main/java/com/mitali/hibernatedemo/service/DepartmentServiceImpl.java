package com.mitali.hibernatedemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mitali.hibernatedemo.entity.domain.Department;
import com.mitali.hibernatedemo.entity.request.DepartmentPostRequest;
import com.mitali.hibernatedemo.entity.request.DepartmentPutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;
import com.mitali.hibernatedemo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(DepartmentPostRequest departmentpostRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartment(int id) throws NotFoundException {
		
		Optional<Department> department = departmentRepository.findById(id);
		
		if(department.isPresent()) {
			return department.get();
		} else {
			throw new NotFoundException(HttpStatus.NOT_FOUND, "Id " + id + " does not exists");
		}
	}

	@Override
	public Department updateDepartment(int id, DepartmentPutRequest departmentPutRequest) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}

}
