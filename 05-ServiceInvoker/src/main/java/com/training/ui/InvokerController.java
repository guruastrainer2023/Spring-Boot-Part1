package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Student;

@RestController
public class InvokerController {
	
	@Autowired
	RestTemplate template;

	@GetMapping("/invoke1")
	public String f1() {
		String url="http://localhost:8081/welcome";
		String result=this.template.getForObject(url, String.class);
		return result;
	}
	
	@GetMapping("/invoke2")
	public String f2() {
		String url="http://localhost:8082/greet";
		String result=this.template.getForObject(url, String.class);
		return result;
	}
	
	@GetMapping("/invoke3")
	public Student f3() {
		String url="http://localhost:8081/getStudent";
		Student result=this.template.getForObject(url, Student.class);
		return result;
	}
	
	@PostMapping("/invoke5")
	public Student f5(@RequestBody  Student student) {
		String url="http://localhost:8081/studentsapi/add";
		Student student1=this.template.postForObject(url, student, Student.class);
		return student1;
	}
	
	@GetMapping("/invoke6")
	public List<Student> f6(){
		String url="http://localhost:8081/studentsapi/all";
		List<Student> allStudents=this.template.getForObject(url, List.class);
		return allStudents;
	}
	
	@GetMapping("/invoke7/{rn}")
	public Student f7(@PathVariable(name="rn")  int rollNumber) {
		String url="http://localhost:8081/studentsapi/get/"+rollNumber;
		Student student=this.template.getForObject(url, Student.class);
		return student;
	}
	
	
	@PutMapping("/invoke8")
	public Student f8(@RequestBody Student student) {
		String url="http://localhost:8081/studentsapi/update";
		this.template.put(url, student);
		return student;
	}
	
	@DeleteMapping("/invoke9/{rn}")
	public Student f9(@PathVariable(name="rn") int rollNumber) {
		String url="http://localhost:8081/studentsapi/delete/"+rollNumber;
		this.template.delete(url);
		Student student=new Student();
		student.setRollNumber(rollNumber);  
		return student;
		
	}
	
	
	
}
