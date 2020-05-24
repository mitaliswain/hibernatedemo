package com.mitali.hibernatedemo.service;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.mitali.hibernatedemo.entity.domain.Customer;
import com.mitali.hibernatedemo.entity.request.CustomerPostRequest;
import com.mitali.hibernatedemo.entity.request.CustomerPutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;

public interface ICustomerService {
	
	public Customer addCustomer(CustomerPostRequest customerPostRequest);
	
	public Customer getCustomer(int id) throws NotFoundException;
	
	public Customer updateCustomer(int id,CustomerPutRequest customerPutRequest)throws NotFoundException;
	
	public void deleteCustomer(int id)throws NotFoundException;
}
