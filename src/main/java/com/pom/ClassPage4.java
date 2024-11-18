package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassPage4 {

	

	public WebDriver driver;
	public ClassPage4(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Login;
	


	public WebElement getLogin() {
		return Login;
	}

	
	public WebElement getUsernm() {
		return usernm;
	}
	public WebElement getPwd() {
		return pwd;
	}


//	public WebDriver getDriver() {
//		return driver;
//	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernm;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwd;
	
	
	

}
