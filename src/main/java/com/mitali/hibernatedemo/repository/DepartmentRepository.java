package com.mitali.hibernatedemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mitali.hibernatedemo.entity.domain.Department;
import com.mitali.hibernatedemo.entity.domain.Employee;


public interface DepartmentRepository extends CrudRepository<Department, Integer>{
	Optional<Department> findById(Integer id);
}
