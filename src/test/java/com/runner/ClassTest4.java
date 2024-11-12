package com.runner;

import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BaseClass;
import com.poma.PageObject;

import Utils.CommonMethods;
import Utils.Xls_Reader;



public class ClassTest4 extends BaseClass {

	public static PageObject pom = new PageObject();
	//creating object of CommonMethods class so that can access common methods and pass input from here
	CommonMethods cm =new CommonMethods();
	//create object of Xls_Reader class and passing excel file path to it
	Xls_Reader reader = new Xls_Reader("E:\\AutomationProject\\QKart_Project\\src\\main\\java\\Utils\\exceldata.xlsx");
	int rowCount=reader.getRowCount("LoginTestData");//getting count of total row in excel sheet using function inside Xls_Reader class


	//this login method covering  scenarios with both invalid username /password and valid username /password
	//data driven testing scenario



	@Test
	public void loginScenario() throws InterruptedException{


		
		scroll(pom.getClassPage4().getLogin());
		cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
		WebElement username =pom.getClassPage4().getUsernm();	//getting locator by calling method inside loginpage using pom object
		WebElement password=pom.getClassPage4().getPwd();
		cm.elementToBeVisibleWait(pom.getClassPage4().getUsernm());

		username.click();

		username.sendKeys(reader.getCellData("LoginTestData", "username", 2));
		Thread.sleep(3000);
		cm.elementToBeVisibleWait(pom.getClassPage4().getPwd());

		password.click();
		password.sendKeys(reader.getCellData("LoginTestData", "password", 2));//using getcelldata function in Xls_Reader class and passing sheetname,field name and rowno 
		Thread.sleep(3000);


	}


	@AfterTest
	private void tearDown() {
		terminateBrowser();
	}

}
