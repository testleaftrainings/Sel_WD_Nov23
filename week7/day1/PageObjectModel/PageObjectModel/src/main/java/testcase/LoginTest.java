package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
@Test
	public void runCreateLead() {
	System.out.println("Test Driver"+ driver);
		LoginPage lp =new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLogin();
	}
}
