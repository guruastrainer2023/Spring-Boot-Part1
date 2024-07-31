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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;


@RestController
@RequestMapping("/studentapi")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public Student f1(@RequestBody   Student student) {
		return this.service.createStudent(student);
	}

	
	@Operation(summary = "Get a Student by its roll Number")
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Found the Student",
	content = { @Content(mediaType = "application/json",
	schema = @Schema(implementation = Student.class)) }),
	@ApiResponse(responseCode = "400", description = "Invalid Roll Number supplied",
	content = @Content),
	@ApiResponse(responseCode = "404", description = "Student not found",
	content = @Content) })
	
	@GetMapping("/get/{rollNumber}")
	public Student f2(@PathVariable(name="rollNumber")   int rollNumber) {
		return this.service.getStudentByRollNumber(rollNumber);
	}
	
	@Operation(summary = "Get all Students")
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Found all the Students",
	content = { @Content(mediaType = "application/json",
	schema = @Schema(implementation = Student.class)) })})
	
	@GetMapping("/all")
	public List<Student> f3(){
		return this.service.getAllStudents();
	}
	
	@PutMapping("/update")
	public Student f4(@RequestBody  Student student) {
		return this.service.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{rn}")
	public String f5(@PathVariable(name="rn")   int rollNumber) {
		return this.service.deleteStudentByRollNumber(rollNumber);
	}
	
	@GetMapping("/all/name/{name}")
	public List<Student> f6(@PathVariable(name="name")  String name){
		return this.service.getAllStudentsByName(name);
	}
	
	@GetMapping("/all/mark3/{mark}")
	public List<Student> f7(@PathVariable(name="mark")  int mark){
		return this.service.getAllStudentsByMarks(mark);
	}
	

	@GetMapping("/all/mark2/above/{mark}")
	public List<Student> f8(@PathVariable(name="mark")  int mark){
		return this.service.getAllStudentsByMark2Above(mark);
	}
	
}
