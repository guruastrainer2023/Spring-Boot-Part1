package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Student;
import com.training.service.StudentService;

@RestController
@RequestMapping("/studentsapi")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public Student f1(@RequestBody   Student student) {
		return this.service.createStudent(student);
	}
	
	@GetMapping("/all")
	public List<Student> f2(){
		return this.service.getAllStudents();
	}
	
	@GetMapping("/get/{rn}")
	public Student f3(@PathVariable(name="rn")   int rollNumber) {
		return this.service.getStudentByRollNumber(rollNumber);
	}
	
	@PutMapping("/update")
	public Student f4(@RequestBody  Student student) {
		return this.service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{rn}")
	public Student f5(@PathVariable(name="rn")  int rollNumber) {
		return this.service.deleteStudentByRollNumber(rollNumber);
	}

}
