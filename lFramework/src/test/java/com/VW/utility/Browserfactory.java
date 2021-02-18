package com.VW.utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	
	/* Create Browser Factory to start application, implicit wait, maximize browser and close browser
	 * 
	 * 
	 */
	WebDriver driver;
	
	public static WebDriver StartApplication(WebDriver driver, String browsername, String URL) {
		
		
		if(browsername.equals("Chrome")) {
		
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
					}
		
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecho.driver","./Drivers/geckodriver.exe" );
			driver = new ChromeDriver();
			driver = new FirefoxDriver();
		}
		
		
		else if(browsername.equals("IE")) {
			System.setProperty("webdriver.IE.driver","./Drivers/IEDriverServer.exe" );
			driver = new ChromeDriver();
			driver = new InternetExplorerDriver();
		}
		
		
		else
		{
			System.out.println("We dont support Browser");
		}
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		return driver;
		
		}
	
	
	
	
	public static void quiteBrowser(WebDriver driver) {
		driver.close();
		
	}
	
	
	
	
	

	
	

}
