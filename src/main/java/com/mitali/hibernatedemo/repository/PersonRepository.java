package com.mitali.hibernatedemo.repository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitali.hibernatedemo.entity.domain.Customer;
import com.mitali.hibernatedemo.entity.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
	
	Optional<Person> findById(Integer id);
	

}