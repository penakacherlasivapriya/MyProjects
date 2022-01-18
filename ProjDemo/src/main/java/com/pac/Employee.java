package com.pac;

public class Employee {
	int eno;
	String ename;
	Address address;
	public Employee(int ide,String nam,Address addr)
	{
		eno=ide;
		ename=nam;
		address=addr;
	}
	public Employee(String nam1,int ide1,Address addr1)
	{
		System.out.println("into this");
		ename=nam1;
		eno=ide1;
		address=addr1;
		
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
