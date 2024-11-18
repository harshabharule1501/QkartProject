package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClassPage1 extends BaseClass {

	public WebDriver driver;
	public ClassPage1(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Login;
	

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement Register;
	
	@FindBy(xpath = "(//input[@placeholder='Search for items/categories'])[1]")
	private WebElement searchBtn;
	

	public WebElement getLogin() {
		return Login;
	}

	
	public WebElement getRegister() {
		return Register;
	}

	public void setRegister(WebElement register) {
		Register = register;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}



	

}
