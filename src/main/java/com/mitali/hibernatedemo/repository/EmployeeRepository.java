package com.mitali.hibernatedemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitali.hibernatedemo.entity.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	Optional<Employee> findById(Integer id);
}
