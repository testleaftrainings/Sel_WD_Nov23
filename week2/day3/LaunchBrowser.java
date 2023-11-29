package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//setup the path and launch chrome browser
		ChromeDriver driver =new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//find the element Enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //find the element Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
	}

}
