package org.pageexe;

import org.base.BaseClass;
import org.locator.LoginLocator;

public class LoginPageExe extends LoginLocator{

	public static void userName() {
		BaseClass.sendkeys(BaseClass.findElementBy(LoginLocator.username),"Nagarajkavi");
	}
	public static void passWord() {
		BaseClass.sendkeys(BaseClass.findElementBy(LoginLocator.password),"123456");
	}
	
}