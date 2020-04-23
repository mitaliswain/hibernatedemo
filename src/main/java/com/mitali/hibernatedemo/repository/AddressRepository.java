package com.mitali.hibernatedemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mitali.hibernatedemo.entity.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{
	Optional<Address> findById(Integer id);
}
