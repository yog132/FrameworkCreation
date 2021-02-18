package com.VW.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.VW.automationPages.BaseClass;
import com.VW.automationPages.a1LoginPage;
import com.VW.utility.Browserfactory;
import com.VW.utility.ExcelDataProvider;
import com.VW.utility.Helper;

public class TestCase1 extends BaseClass {

	
	 /* To get data from excel we need to create object of that class and call method 
	  * 
	  *  
	  */
	
	
	 
	@Test
	public void logincheck() throws IOException {
		
	
		ExcelDataProvider excel = new ExcelDataProvider();			// we can keep this in Base class by craeting method
		
		String username  = excel.getStringData("Login", 0, 0);
		System.out.println(username);
		String Password  = excel.getStringData("Login", 0, 1);
		System.out.println(Password);
	
		
		
		/*
		a1LoginPage loginpage = PageFactory.initElements(driver, a1LoginPage.class);		//initelements return type is page.
		
		
		 loginpage.login(username, Password);			// we use abstraction here to hide webelements and methods.
		
		*/
		
	}
	

	
	
		
	
}
