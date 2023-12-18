package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on show in Simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        //Transfer the driver control
		Alert alert = driver.switchTo().alert();//ctrl+2+l
		//verification to get the text from the pop up
		String msg = alert.getText();
		System.out.println(msg);
		alert.dismiss();
		//verification can print the successful msg
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		//confirm alert find the element to click the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Transfer the driver control
		Alert alert2 = driver.switchTo().alert();
		//print the text from the alert box
		String confirmMsg = alert2.getText();
		System.out.println(confirmMsg);
		//action method
		alert2.accept();
		//verification msg
		String alertMsg = driver.findElement(By.id("result")).getText();
		System.out.println(alertMsg);
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
		
	}

}
