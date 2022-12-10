package org.exe;

import org.pageexe.LoginPageExe;
import org.testng.annotations.Test;

public class ExecutionClass extends LoginPageExe{
@Test
public void Output() {
	browserLaunch();
	maximizeScreen();
	launchurl("https://adactinhotelapp.com/");
	userName();
	passWord();
}
}
