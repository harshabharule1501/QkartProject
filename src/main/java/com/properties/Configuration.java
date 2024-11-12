package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public static Properties p;
	
	public Configuration() throws IOException {
	File f = new File("E:\\AutomationProject\\QKart_Project\\src\\main\\java\\com\\properties\\qkart.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getBrowserName() {
		String browsername = p.getProperty("browsername");
		return browsername;
	}

}