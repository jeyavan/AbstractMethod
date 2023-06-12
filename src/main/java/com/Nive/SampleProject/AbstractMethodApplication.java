package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;




@SpringBootApplication

public class AbstractMethodApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(AbstractMethodApplication.class, args);
	
		VechicalsDemo vec=context.getBean(VechicalsDemo.class);
		vec.display();
	}	
}	
	


