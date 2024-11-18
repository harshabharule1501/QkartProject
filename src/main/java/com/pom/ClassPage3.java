package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClassPage3 extends BaseClass {



	public WebDriver driver;
	public ClassPage3(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "(//input[@placeholder='Search for items/categories'])[1]")
	private WebElement searchTextBox;
	
	public void setSearchTextBox(WebElement searchTextBox) {
		this.searchTextBox = searchTextBox;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	
	public  String getcurrenturl() {
		System.out.println(driver.getCurrentUrl());
		return null;
	}


	public  void gettitle() {
		System.out.println(driver.getTitle());
	}
	
}
