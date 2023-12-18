package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the driver control
		driver.switchTo().frame(0);
		//find the element to click
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
       //verification 
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		//switch back from the existing frame
		driver.switchTo().defaultContent();//back to main window
		//nested frame
		driver.switchTo().frame(3);//parent
		//webelement
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");//child
		
		//to click the button
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		//verification
		String text2 = driver.findElement(By.id("Click")).getText();
		System.out.println(text2);
		//back to parent
		driver.switchTo().parentFrame();
		
	}

}
