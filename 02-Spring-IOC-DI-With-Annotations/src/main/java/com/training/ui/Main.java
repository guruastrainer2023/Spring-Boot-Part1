package com.training.ui;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Employee;
import com.training.db.EmployeeDAO;
import com.training.db.EmployeeDAOImplmentation;
import com.training.service.EmployeeService;



public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee =(Employee) context.getBean("employeeBean");
		EmployeeDAO edao= context.getBean("empDAO", EmployeeDAOImplmentation.class);
		EmployeeService service=context.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employee);
		System.out.println(edao);
		System.out.println(service);
		

	}

}
