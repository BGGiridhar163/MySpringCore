package com.joctopus;

public class Faculty {
	int fid;
	String fname;
	String subject;
	float salary;

	public Faculty() {
		System.out.println("I'm no argumented constructor of Faculty class");
	}
	
	public Faculty(int fid, String fname, String subject, float salary) {
		this.fid = fid;
		this.fname = fname;
		this.subject = subject;
		this.salary = salary;
		System.out.println("I'm a argumented constructor of Faculty class");
	}
	
	public void display() {
		System.out.println("Faculty Id : "+fid+" Faculty Name : "+fname+" Subject : "+subject+" Salary : "+salary);
	}
}
