package com.mitali.hibernatedemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.mitali.hibernatedemo.entity.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	Optional<Employee> findById(Integer id);
}
