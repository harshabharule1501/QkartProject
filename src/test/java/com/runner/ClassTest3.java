package com.runner;

import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.poma.PageObject;






import com.base.BaseClass;


import Utils.CommonMethods;



public class ClassTest3 extends BaseClass {


	public static PageObject pom = new PageObject();
	CommonMethods cm =new CommonMethods();
	
	

	
	@Test
	private void verify() throws IOException, InterruptedException {
		scroll(pom.getClassPage4().getLogin());
		//cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
		CommonMethods.assertMethod("Search for items/categories", pom.getClassPage3().getSearchTextBox().getText());
		


	}

}
