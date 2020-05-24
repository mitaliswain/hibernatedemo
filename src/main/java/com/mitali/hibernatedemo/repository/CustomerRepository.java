package com.mitali.hibernatedemo.repository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitali.hibernatedemo.entity.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Optional<Customer> findById(Integer id);
	

}