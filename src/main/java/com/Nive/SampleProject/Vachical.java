package com.Nive.SampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vachical {
	@Autowired
	private VechicalsDemo vechicalsdemo;
	public void run() {
		vechicalsdemo.display();
	}

}
