package com.mitali.hibernatedemo.entity.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
@Cacheable(true)
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="EMPNAME")
	private String empName;

	@Column(name="SALARY")
	private long salary;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID") 
	private Department department;
	

	@OneToMany(mappedBy="employee", fetch = FetchType.EAGER)
	//private List<Address> addresses;
	private Collection<Address> addresses = new ArrayList<>();
	
	
	
	public Collection<Address> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		System.out.println("*************");
		this.salary = salary;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ ", addresses=" + addresses + "]";
	}
	
}
