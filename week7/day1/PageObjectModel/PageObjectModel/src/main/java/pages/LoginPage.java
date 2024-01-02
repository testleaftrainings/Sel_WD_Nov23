package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage enterUserName() {
		System.out.println("Page driver"+ driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
    public LoginPage enterPassword() {
    	driver.findElement(By.id("password")).sendKeys("crmsfa");
    	return this;
	}
    public WelcomePage clickLogin() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage();
	}
}
