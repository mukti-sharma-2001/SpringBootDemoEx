package com.example.SpringbootAppEx.entities;

public class Employee {

	private int EmpId;
	private String name;
	private String address;
	
	public Employee(int empId, String name, String address) {
		super();
		EmpId = empId;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", address=" + address + "]";
	}
	
}
