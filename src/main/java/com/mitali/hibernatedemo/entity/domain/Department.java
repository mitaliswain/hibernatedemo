package com.mitali.hibernatedemo.entity.domain;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
@Cacheable
public class Department {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="DEPTNAME")
	private String deptName;
	
	@Column(name="DEPTDESC")
	private String deptDesc;
   
	@OneToMany(mappedBy = "department")
	private List<Address> address = new ArrayList<Address>();
	
	
	public List<Address> getAddresses() {
		return address;
	}
	
	public void setAddresses(List<Address> address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

}
