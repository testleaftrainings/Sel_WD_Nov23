package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvancedXpath {

	public static void main(String[] args) {
		// setup the path and launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// find the element Enter the user name
		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("demosalesmanager");
		// find the element Enter the password
		driver.findElement(By.xpath("(//label[@for='username']/following::input)[2]")).sendKeys("crmsfa");
		// click login button
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();

	}

}
