package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
@Test
	public  void runCreateLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		driver.findElement(By.name("submitButton")).click();
		
}
}






