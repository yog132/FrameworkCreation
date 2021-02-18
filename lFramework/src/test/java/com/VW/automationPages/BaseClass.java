package com.VW.automationPages;

import java.io.File;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.VW.utility.Browserfactory;
import com.VW.utility.ConfigDataProvider;
import com.VW.utility.ExcelDataProvider;
import com.VW.utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class BaseClass {
	
	/* Keep exceldata provider, configdata provider and extentreports in @before suit so that it will initialize at the start of suite.
	 * 
	 */

public WebDriver driver;
public ExcelDataProvider excel;
public ConfigDataProvider  config;
public ExtentReports report;



@BeforeSuite
public void setupSuite() throws IOException {
	
	excel = new ExcelDataProvider();
	config = new ConfigDataProvider();
		
}




@BeforeMethod
	
	public void setup() {
		driver =Browserfactory.StartApplication(driver, config.getdatafromConfig("Browser"), config.getURl());
		
	}
	 

@AfterMethod

public void tearDown() {

	Browserfactory.quiteBrowser(driver);
	
}

//We will capture screenshot onnce test fail
public void tearDownmethod(ITestResult result) throws IOException {
	
	if(result.getStatus()==ITestResult.FAILURE) {
		Helper.captureScreenshot(driver);
	}
	
}





}
