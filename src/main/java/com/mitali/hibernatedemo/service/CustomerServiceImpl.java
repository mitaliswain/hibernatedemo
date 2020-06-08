package com.mitali.hibernatedemo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mitali.hibernatedemo.entity.domain.Customer;
import com.mitali.hibernatedemo.entity.domain.Person;
import com.mitali.hibernatedemo.entity.request.CustomerPostRequest;
import com.mitali.hibernatedemo.entity.request.CustomerPutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;
import com.mitali.hibernatedemo.repository.CustomerRepository;
import com.mitali.hibernatedemo.repository.PersonRepository;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	PersonRepository personRepository;
	
	@Override
	
	@Transactional
	
	public Customer addCustomer(CustomerPostRequest customerPostRequest) {
		Customer customer = new Customer();
		customer.setAddress(customerPostRequest.getAddress());
		customer.setName(customerPostRequest.getName());
		customer.setAge(customerPostRequest.getAge());
		customer.setSalary(customerPostRequest.getSalary());
		customerRepository.save(customer);
		
		Person person = new Person();
		person.setAge(customerPostRequest.getAge());
		person.setFirstName(customerPostRequest.getName());
		person.setLastName(customerPostRequest.getName() + "L");
		personRepository.save(person);
		
		return null;
	}

	@Override
	public Customer getCustomer(int id) throws NotFoundException {
	
			Optional<Customer> customer = customerRepository.findById(id);
			if(customer.isPresent()) {
				return customer.get();
			}else {
				throw new NotFoundException(HttpStatus.NOT_FOUND, "Id " + id + " does not exists");
			}
		
		
	}

	@Override
	public Customer updateCustomer(int id, CustomerPutRequest customerPutRequest) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}

}
