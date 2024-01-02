package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
@Test
	public void runCreateLead() {
		LoginPage lp =new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.lastName()
		.clickCreateLeadButton()
		.verifyFirstName();
	}
}
