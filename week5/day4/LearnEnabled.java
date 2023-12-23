package week5.day4;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class LearnEnabled {
	
	@Test                
	public void createLead() {
		System.out.println("CreateLead");
	}
	@Ignore
	@Test
	public void EditLead() {
		System.out.println("EditLead");
	}
	@Test (enabled = false)
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
}
