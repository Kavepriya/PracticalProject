package org.com.testing;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CrtThread extends BaseClass{
	public WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		System.out.println(Thread.currentThread().getId());
		browserLaunch();
	
	}

	@Test
	public void test() {
		System.out.println(Thread.currentThread().getId());
		launchurl("https://adactinhotelapp.com/index.php");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(Thread.currentThread().getId());
		browserClose();
	}
}
