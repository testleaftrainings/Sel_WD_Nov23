package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {

	// Each feature step will be implemented in java class as individual method
	// Create java methods for each feature step with meaningful name

//	public ChromeDriver driver;

	/*
	 * @Given("Launch the browser") public void launchBrowser() { driver = new
	 * ChromeDriver(); }
	 * 
	 * @Given("Load the url") public void loadUrl() {
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 */
	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("WelcomePage is displayed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}

	@But("Error message is displayed")
	public void verifyErrorMsg() {
		String errorMessage = driver
				.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']"))
				.getText();
		System.out.println(errorMessage);
	}
	/*
	 * @When("Click on {string} link") public void click_on_crmsfa_link(String
	 * locatorValue) { driver.findElement(By.linkText(locatorValue)).click(); }
	 * 
	 * @When("Enter the company name as {string}") public void
	 * enter_the_company_name(String cname) {
	 * driver.findElement(By.id("createLeadForm_companyName")) .sendKeys(cname); }
	 * 
	 * @When("Enter the firstname as {string}") public void
	 * enter_the_firstname(String fname) {
	 * driver.findElement(By.id("createLeadForm_firstName")) .sendKeys(fname); }
	 * 
	 * @When("Enter the lastname as {string}") public void enter_the_lastname(String
	 * lname) { driver.findElement(By.id("createLeadForm_lastName"))
	 * .sendKeys(lname);
	 * 
	 * }
	 * 
	 * @When("Click on the create button") public void click_on_the_create_button()
	 * { driver.findElement(By.name("submitButton")).click();
	 * 
	 * }
	 * 
	 * @Then("ViewLeadPage is displayed") public void view_lead_page_is_displayed()
	 * { System.out.println(driver.getTitle()); }
	 */
	/*
	 * @When("Click on Leads link") public void click_on_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click();
	 * 
	 * }
	 * 
	 * @When("Click on Create Lead link") public void click_on_create_lead_link() {
	 * driver.findElement(By.linkText("Create Lead")).click();
	 * 
	 * }
	 */

}
