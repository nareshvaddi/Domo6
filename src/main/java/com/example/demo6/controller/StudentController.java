package com.example.demo6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.model.Student;

@RestController
public class StudentController {

	@Autowired
	private Student student;

	@GetMapping("/stu1")
	public Student GetschoolDetailes1()

	{
		student.setId(100);
		student.setLname("raj");
		student.setFname("sriram");

		return student;
	}

	@PostMapping("/stu2")
	public Student saveschoolDetailes2(@RequestBody Student stu)
	{
		return stu;
	}

	@DeleteMapping("/stu3")
	public Student DeleteschoolDetailes3(@RequestBody Student stu)
	{
		return stu;
	}
	
	@PutMapping("/stu4")
	public Student updateschoolDetailes4(@RequestBody Student stu)
	{
		return stu;
	}
}
