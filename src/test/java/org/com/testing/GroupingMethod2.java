package org.com.testing;

import org.testng.annotations.Test;

public class GroupingMethod2 {
	@Test (groups= {"sanity","reg"})
	public void test5() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test5");
	}
	
	@Test (groups= {"smoke","reg"})
	public void test6() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test6");
	}
	
	@Test(groups= {"reg"})
	public void test7() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test7");
	}
	
	@Test (groups= {"reg"})
	public void test8() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test8");
	}

}