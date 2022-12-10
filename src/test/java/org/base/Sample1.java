package org.base;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void username() {
		System.out.println("username");
	}
	
	// to ignore particular testcases
	@Test 
	public void password() {
		System.out.println("password");
	}
	@Test@Ignore
	public void click() {
		System.out.println("click");
	}
}
