package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	public MyHomePage clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
    public void logOut() {
		
	}
}
