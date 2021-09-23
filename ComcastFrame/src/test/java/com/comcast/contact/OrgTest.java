package com.comcast.contact;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="smoketest")
	public void createcontactTest() {
		System.out.println("execute createContactTest");
	}
	
	@Test(groups="smoketest")
	
	
	public void createcontactwithTest() {
		System.out.println("execute createContactwithTest");
	}
	
	
	@Test(groups="Regression")
	public void deletecreatecontactTest() {
		System.out.println("execute deletecreateContactTest");
	}
	@Test(groups="Regression")
	public void deploycontactTest() {
		System.out.println("deploycontactTest");
	}
	
	@Test(groups="Regression")
	public void contactTest() {
		System.out.println("contactTest");
	}
	
	
}
