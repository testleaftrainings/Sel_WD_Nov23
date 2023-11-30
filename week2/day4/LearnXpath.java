package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		//setup the path and launch chrome browser
		ChromeDriver driver =new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the element Enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        //find the element Enter the password
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
	}

}
