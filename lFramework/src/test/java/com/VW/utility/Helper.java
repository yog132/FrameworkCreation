package com.VW.utility;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public static void captureScreenshot( WebDriver driver) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshots/"+getdateformat()+".png"));		// we should give name by using timestamop so for that we created method for date format and use in name
		
		
	}
	

	
	
	public static String getdateformat() {
		DateFormat customformat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");	//only MM and HH are uppercase
		
		Date currentdate= new Date();		// use java.util
	
		return customformat.format(currentdate);
	}
}
