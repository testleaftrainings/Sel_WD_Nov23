package week5.day4;

import org.testng.annotations.Test;

public class LearnInvocation {
	
	@Test   (invocationCount = 5,threadPoolSize = 3)            
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("CreateLead");
	}
	@Test(priority = 1)
	public void EditLead() {
		System.out.println("EditLead");
	}
	@Test (priority = -1)
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
}
