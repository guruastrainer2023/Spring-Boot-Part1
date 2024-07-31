package com.training.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.bean.Student;

@Service
public class StudentService {
	
	List<Student> allStudents=new LinkedList<>();
	
	public Student createStudent(Student student) {
		IdGenerator instance=IdGenerator.getInstance();
		int auto_rollNumber=instance.next();
		student.setRollNumber(auto_rollNumber);
		
		this.allStudents.add(student);
		
		return student;
	}
	
	public List<Student> getAllStudents(){
		return this.allStudents;
	}
	
	public Student getStudentByRollNumber(int rollnumber) {
		Student student=new Student();
		student.setRollNumber(rollnumber);
		
		int index=this.allStudents.indexOf(student);
		if(index>=0) {
			return this.allStudents.get(index);
		}else {
			return null;
		}
			
	}
	
	public Student updateStudent(Student student) {
		int index=this.allStudents.indexOf(student);
		if(index>=0) {
			this.allStudents.set(index, student);
			return this.allStudents.get(index);
		}else {
			return null;
		}
	}
	
	public Student deleteStudentByRollNumber(int rollnumber) {
		Student student=new Student();
		student.setRollNumber(rollnumber);
		
		int index=this.allStudents.indexOf(student);
		if(index>=0)
		{
			Student student1=this.allStudents.remove(index);
			return student1;
		}else {
			return null;
		}
		
		
	}
	

}
