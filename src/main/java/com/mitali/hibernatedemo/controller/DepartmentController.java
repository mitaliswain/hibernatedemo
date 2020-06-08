package com.mitali.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mitali.hibernatedemo.service.DepartmentServiceAdvImpl;
import com.mitali.hibernatedemo.service.DepartmentServiceImpl;
import com.mitali.hibernatedemo.service.IDepartmentService;

@ComponentScan
@Controller
public class DepartmentController {
	
	@Autowired
	IDepartmentService departmentService;
	
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDepartment(@PathVariable int id)throws InterruptedException{
		
		return ResponseEntity.ok().body(departmentService.getDepartment(id));
		
		
		
	}
}
