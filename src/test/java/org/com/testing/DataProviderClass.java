package org.com.testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderClass  {
	@BeforeClass
public void launchUrl() {
	BaseClass.browserLaunch();
	BaseClass.launchurl("https://adactinhotelapp.com");
}
	@Test(dataProvider="getdata", dataProviderClass=DataProviderClass.class)
public void userLogin(String username, String password) {
	System.out.println(username+password);
}
}
