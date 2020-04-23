package com.mitali.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mitali.hibernatedemo.entity.domain.Employee;
import com.mitali.hibernatedemo.service.IEmployeeService;

@ComponentScan

@RestController
public class EmployeeController {
	
	@Autowired
	 IEmployeeService empService;
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@PathVariable int id) {
		
		Employee empController = empService.getEmployee(id);
		System.out.println(empController);
		return ResponseEntity.ok().body(empController);
		
		
	}

}
