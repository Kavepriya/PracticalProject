package org.com.testing;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertTest {
@Test
	public void testa() {
		System.out.println("Test Method A");
		String a= "kaveraj";
		String b= "kaveraj";
		boolean c=a.equals(b);
		System.out.println(c);
		
		Assert.assertEquals(a, b);
		System.out.println("True");
		
//		String expected = "Facebook Url";
//		String actual = "Facebook Url";
//		boolean a = expected.equals(actual);
//		System.out.println(a);
//		Assert.assertEquals(expected, actual);
		//Assert.assertTrue(a); 
		//Assert.assertFalse(a); //--> pass
	}}