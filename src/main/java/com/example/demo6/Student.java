package com.example.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Student {
	@Autowired
	private school stu;
	
	@GetMapping("/stu1")
	public school GetschoolDetailes1(@RequestBody school stu)
	
	{
		stu.setId(100);
		stu.setLname("raj");
		stu.setFname("sriram");
		
		return stu;
	}


@PostMapping("/stu2")
public school saveschoolDetailes2(@RequestBody school stu)
{
	return stu;
}

@DeleteMapping("/stu3")
public school DeleteschoolDetailes3(@RequestBody school stu)
{
	return stu;
}
@PutMapping("/stu4")
public school updateschoolDetailes4(@RequestBody school stu)
{
	return stu;
}
	

}


