package testcase;




import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends CommonClass{

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
	
	
	//testleaf		vidya		R		99	
	//Testleaf		Princila	R		99
	
	@DataProvider
	public String[][] sendData() {		
		//The data required for the tc is in the form rows and column
		//2d string array
		String[][] data=new String[2][4];
		
	//	String[] name=new String[3];
		//name=[{1,2,3,4} {1,2,3,4}]
		
		data[0][0]="Testleaf";
		data[0][1]="Vidya";
		data[0][2]="R";
		data[0][3]="99";
		/*
		 * [(0,0) (0,1) (0,2) (0,3)] [(1,0) (1,1) (1,2) (1,3)]
		 */		
		
		data[1][0]="Testleaf";
		data[1][1]="Princilla";
		data[1][2]="R";
		data[1][3]="99";
			
		return data	;	
	}
	
	
		
}

