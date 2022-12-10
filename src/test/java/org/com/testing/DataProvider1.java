package org.com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test(dataProvider="testdata")
	public void data(String username , String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	
	// data provider
	@DataProvider(name="testdata")
	public Object [][] getData() {
		return new Object [][] {{"Aiite","12345"},{"Aiite2","12345"},{"Aiite3","12345"},{"Aiite4","12345"}};
	}
}
