package com.tpisoftware.gradlejunitdemo.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceTestsB {

	@Autowired
	private DemoServiceTestsA demoServiceTestsA;
	
	public int addInt(int a, int b) {
		return demoServiceTestsA.add(a, b);
	}
}
