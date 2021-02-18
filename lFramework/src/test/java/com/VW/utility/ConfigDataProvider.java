package com.VW.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws IOException {
		
		
		File src = new File("./Config/Config.properties");
		FileInputStream fis = new FileInputStream(src);
		
		pro = new Properties();
		
		pro.load(fis);
		
		
	
	}
	
	
	public String getdatafromConfig(String key) {
		
		return pro.getProperty(key);
		
	}
	
public String getURl() {
		
		return pro.getProperty("URL");
		
	}
	
	
}
