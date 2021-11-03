package com.example.demo6.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@Component
public class Student {

	private int id;
	private String fname;
	private String lname;

}


