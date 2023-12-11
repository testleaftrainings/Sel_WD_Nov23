package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintTheDropDownValues {

	public static void main(String[] args) {
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
		//all drop down value
		List<WebElement> options = drop1.getOptions();
		for (int i = 0; i <options.size() ; i++) {
			System.out.println(options.get(i).getText());
		}
		
		

	}

}
