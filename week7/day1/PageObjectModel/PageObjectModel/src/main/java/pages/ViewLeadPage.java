package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		//verfication
		if(text.contains(text)) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}

}
