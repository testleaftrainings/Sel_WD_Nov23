package testcase;




import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day2.ReadExcel;



public class CreateLeadwithExceldata extends CommonClass{

	@Test(dataProvider="sendData")
	public void runCreate(String cname,String fname,String lname,String phno) {
		System.out.println(Thread.currentThread().getId());		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();	
	}
	
		
	@DataProvider
	public String[][] sendData() throws IOException {		
		
		System.out.println("Raeading data from Excel");
		String[][] readData = ReadAllValues.readData();
				
		return readData	;	
	}
	
	
		//@Test-->@DataProvider<--in excel sheet
}

