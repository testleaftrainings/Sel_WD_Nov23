package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	// Each feature step will be implemented in java class as individual method
	// Create java methods for each feature step with meaningful name
	public ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("Enter the username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

	}

	@Given("Enter the password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}

	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("WelcomePage is displayed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}

	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@When("Click on Create Lead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@When("Enter the company name")
	public void enter_the_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}

	@When("Enter the firstname")
	public void enter_the_firstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");

	}

	@When("Enter the lastname")
	public void enter_the_lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

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
