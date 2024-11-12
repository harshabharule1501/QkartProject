package com.runner;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BaseClass;
import com.poma.PageObject;

import Utils.CommonMethods;


public class ClassTest2 extends BaseClass {


	public static PageObject pom = new PageObject();
	CommonMethods cm =new CommonMethods();
	
	


	@Test
	private void getCountOfLinks() throws IOException, InterruptedException {
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		Thread.sleep(5000);
		
	List<WebElement> linkCount=pom.getClassPage2().getLinks();
	System.out.println(linkCount.size());

	}
	
	@Test
	private void getCountOfImages() throws IOException, InterruptedException {
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");

		Thread.sleep(5000);


	List<WebElement> images=pom.getClassPage2().getImages();
	System.out.println(images.size());
	}

}
