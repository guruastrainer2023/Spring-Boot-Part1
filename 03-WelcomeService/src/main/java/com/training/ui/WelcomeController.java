package com.training.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Student;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String f1() {
		return "Hello from Micro Service 1---Welcome Service";
	}
	
	@GetMapping("/getStudent")
	public Student f2() {
		Student student=new Student(1020, "Ambika", 80, 90, 99);
		return student;
	}

}
