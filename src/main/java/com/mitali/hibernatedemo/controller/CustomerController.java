package com.mitali.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mitali.hibernatedemo.entity.request.CustomerPostRequest;
import com.mitali.hibernatedemo.service.ICustomerService;

@ComponentScan

@RestController
public class CustomerController {

	@Autowired
	ICustomerService customerService;
	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@PathVariable int id) throws InterruptedException {
		
		System.out.println("First Trial***************" + customerService.getCustomer(id));
		Thread.sleep(5000);
		
		System.out.println("Second Trial***************" + customerService.getCustomer(id));
		Thread.sleep(5000);
		
		System.out.println("Third Trial***************" + customerService.getCustomer(id));
		Thread.sleep(5000);
		return ResponseEntity.ok().body(customerService.getCustomer(id));	
		
		
		
	}
	
	
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public ResponseEntity<?> addEmployee(@RequestBody CustomerPostRequest customerPostRequest) throws InterruptedException {
		
		System.out.println(customerPostRequest.getName());
		System.out.println("***************");
		customerService.addCustomer(customerPostRequest);
		return ResponseEntity.ok("Successfully Added");	
		
		
		
	}
}
