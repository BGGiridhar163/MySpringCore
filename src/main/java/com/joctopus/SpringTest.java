package com.joctopus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ClassPathXMLApplicationContext  FileSystemXMLApplicationContext  WebXMLApplicationContext
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-config.xml");
		/*Course co =(Course)ctx.getBean("c");
		System.out.println(co.toString());
		Faculty fa = (Faculty)ctx.getBean("f");
		fa.display();*/
		Employee emp = (Employee)ctx.getBean("e");
		emp.display();

	}

}
