package com.mitali.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mitali.hibernatedemo.service.DepartmentServiceImpl;

@ComponentScan
@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl departmentService;
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDepartment(@PathVariable int id)throws InterruptedException{
		
		
		System.out.println("First Trial***************" + departmentService.getDepartment(id));
		Thread.sleep(5000);
		System.out.println("Second Trial***************" + departmentService.getDepartment(id));
		Thread.sleep(5000);
		System.out.println("Third Trial***************" + departmentService.getDepartment(id));
		Thread.sleep(5000);
		return ResponseEntity.ok().body(departmentService.getDepartment(id));
		
		
		
	}
}