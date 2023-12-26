package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CommonClass {

	//public ChromeDriver driver;

	//public EdgeDriver driver1;
	
	public RemoteWebDriver  driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void browserSetUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
