package com.comcast.contact;

import org.testng.annotations.Test;

public class Contacttest {
	@Test
	public void createcontctTest() {
		String URL=System.getProperty("url");
		String browser=System.getProperty("browserName");
		System.out.println("------"+browser);
		System.out.println("------"+URL);
		
		System.out.println("execute createContactTest");
	}
	
	@Test
	
	public void orgcontactTest() {
		System.out.println("execute orgContactTest");
	}
	
	@Test
	public void createctactwithTest() {
		System.out.println("execute createContactwithTest");
	}
	
	
	@Test
	public void deletecreatecontactTest() {
		System.out.println("execute deletecreateContactTest");
	}

}
