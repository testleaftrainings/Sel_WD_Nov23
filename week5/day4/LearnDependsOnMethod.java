package week5.day4;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	
	@Test             
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "createLead",alwaysRun = true)   
	public void EditLead() {
		System.out.println("EditLead");
	}
	@Test// (dependsOnMethods = {"createLead","week5.day3.CreateLead.runCreateLead"})
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
}
