package com.VW.automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class a1LoginPage {
	
	/* we will create constructor to initialize webdriver.
	 * 
	 */
	WebDriver driver;
	public a1LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	
	@FindBy(name="uname") WebElement username;
	@FindBy(id="ped") WebElement password;
	@FindBy(xpath="//a[@value='submit']") WebElement submit;
	
	 
	public void login(String U1, String P1) {
		username.sendKeys(U1);
		password.sendKeys(P1);
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
