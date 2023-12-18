package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click and confirm new window opening
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//verify the title of  open window
		System.out.println(driver.getTitle());
		//get the current open window reference
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);//B6FBCA4B9FCE345C827F313D55A7CD0B
		//E12BC9B118FD914DF39C969B7C06C0C2
		
		//step 1: switch to new open window 
		Set<String> windowHandles = driver.getWindowHandles();
		//step2:convert set into list
		List<String> lstWindow =new ArrayList<String>(windowHandles);
		//step3:Switch into the new open window
		driver.switchTo().window(lstWindow.get(1));
		//verify the title of new open window
		System.out.println(driver.getTitle());
		System.out.println(windowHandles.size());
		//To close the open window
		driver.close();
		//switch back 
		driver.switchTo().window(lstWindow.get(0));
		System.out.println(driver.getTitle());
		//close the all open window
		//driver.quit();
		
	}

}
