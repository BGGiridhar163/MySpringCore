package com.joctopus;

public class Employee {
	int eid;
	String ename;
	Address add;
	
	public Employee(int eid, String ename, Address add) {
		this.eid = eid;
		this.ename = ename;
		this.add = add;
	}
	
	public void display() {
		System.out.println("Employee id : "+eid+" Employee Name : "+ename);
		System.out.println("House No : "+add.hno+" City : "+add.city+" State : "+add.state);
	}

}
