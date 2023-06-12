package com.Nive.SampleProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements VechicalsDemo{

	@Override
	public void display() {
		System.out.println("Hi");
		
	}
	
	
}
