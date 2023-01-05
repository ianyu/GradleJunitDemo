package com.tpisoftware.gradlejunitdemo.demo2;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceTestsA {

	public int add(int a, int b) {
		return Integer.sum(a, b);
	}

}
