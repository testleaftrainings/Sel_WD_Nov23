package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		return this;
	}
	public CreateLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		return this;
	}
    public ViewLeadPage clickCreateLeadButton() {
    	driver.findElement(By.name("submitButton")).click();
    	return new ViewLeadPage();
    }
}
