package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassPage2 {

	

	public WebDriver driver;


	public ClassPage2(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}

	@FindBy(tagName = "a")
	private List<WebElement> links;
	

	@FindBy(tagName = "img")
	private List<WebElement> images;
	

	public WebDriver getDriver() {
		return driver;
	}


	public List<WebElement> getLinks() {
		return links;
	}


	public List<WebElement> getImages() {
		return images;
	}

	
	

}
