package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Step:1 Locate the dropdown web element
		 * 
		 * Step:2 Instantiate Select class
		 * 
		 * Step:3 Call select class method to pick the option from dropdown
		 * 
		 */

		// setup the path and launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// Load the url
		driver.get("https://www.leafground.com/select.xhtml");
		// Step:1 Locate the dropdown web element
		WebElement tools = driver.findElement(By.className("ui-selectonemenu"));//ctrl+2+l
        //Step:2 Instantiate Select class
		Select drop1 = new Select(tools);
		//Step:3 Call select class method to pick the option from dropdown
		// drop1.selectByIndex(3);
		drop1.selectByVisibleText("Playwright");
		//drop1.selectByValue("ui-selectonemenu-label");
		
		//Not present inside select
		driver.findElement(By.id("j_idt87:country_label")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:country_2")).click();
		//verification 
		//text from the Dom page
		String text = driver.findElement(By.id("j_idt87:country_3")).getText();
		System.out.println(text);
		//To get the title of page
		String title = driver.getTitle();
		System.out.println(title );
		
	    
		//To close the open browser
		driver.close();
	}

}
