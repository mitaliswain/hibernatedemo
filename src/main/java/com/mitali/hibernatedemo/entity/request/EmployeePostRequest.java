package com.mitali.hibernatedemo.entity.request;

public class EmployeePostRequest {
	
	private String empName;
	private String deptname;
	private long salary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public EmployeePostRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
}
