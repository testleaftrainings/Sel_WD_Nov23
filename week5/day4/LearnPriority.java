package week5.day4;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test                //du c de  E
	public void createLead() {
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
