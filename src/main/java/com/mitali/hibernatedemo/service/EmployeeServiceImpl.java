package com.mitali.hibernatedemo.service;

import java.util.Optional;

import org.hibernate.HibernateException;
import org.omg.CosNaming._BindingIteratorImplBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.mitali.hibernatedemo.entity.domain.Employee;
import com.mitali.hibernatedemo.entity.request.EmployeePostRequest;
import com.mitali.hibernatedemo.entity.request.EmployeePutRequest;
import com.mitali.hibernatedemo.exception.NotFoundException;
import com.mitali.hibernatedemo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Value("${url.to.order.service}") 
	String orderServiceUrl;
	
	@Value("${name}")
	String name;

	
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public Employee addEmployee(EmployeePostRequest empPostRequest) {
		Employee empService = mappingEmployee(empPostRequest);
		
		try {
			empRepository.save(empService);
			return empService;
		} catch (Exception e) {

			e.printStackTrace();
			throw new HibernateException("Invalid Arguments");
		}
		
	}

	@Override
	public Employee getEmployee(int id) throws NotFoundException {
		
		Optional<Employee> employee = empRepository.findById(id);
		
		if(employee.isPresent()) {
			
			System.out.println("******** Calling " + orderServiceUrl + " **************");
			System.out.println("******** Calling " + name + " **************");
			
			
			
			Employee  employee2= employee.get();
			employee2.setEmpName(name); 
			
			return employee2;
			
			
		} else {
			throw new NotFoundException(HttpStatus.NOT_FOUND, "Id " + id + " does not exists");
		}
	}

	@Override
	public Employee updateEmployee(int id, EmployeePutRequest personalPutRequest) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	private Employee mappingEmployee(EmployeePostRequest empPostRequest) {
		
		Employee emp = new Employee();
		emp.setEmpName(empPostRequest.getEmpName());
		//emp.setDeptName(empPostRequest.getDeptname());
		emp.setSalary(empPostRequest.getSalary());
		return emp;
		
	}
}
