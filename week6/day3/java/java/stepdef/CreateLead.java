package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	
	
	@When("Click on {string} link")
	public void click_on_crmsfa_link(String locatorValue) {
		driver.findElement(By.linkText(locatorValue)).click();
	}	

	@When("Enter the company name as {string}")
	public void enter_the_company_name(String cname) {
		driver.findElement(By.id("createLeadForm_companyName"))
		   .sendKeys(cname);
	}

	@When("Enter the firstname as {string}")
	public void enter_the_firstname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName"))
		   .sendKeys(fname);
	}
	@When("Enter the lastname as {string}")
	public void enter_the_lastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName"))
		.sendKeys(lname);

	}
	@When("Click on the create button")
	public void click_on_the_create_button() {
		driver.findElement(By.name("submitButton")).click();	

	}

	@Then("ViewLeadPage is displayed")
	public void view_lead_page_is_displayed() {
		System.out.println(driver.getTitle());
	}
	
	
}
