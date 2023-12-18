package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//verify home page open
		
		//step1:Take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create folder to save the img file
        File desc =new File("./snap/login.png");
        //Merge source and destination
        FileUtils.copyFile(source, desc);
	}

}
