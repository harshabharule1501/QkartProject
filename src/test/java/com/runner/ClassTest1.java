package com.runner;

import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.ClassPage1;

import com.poma.PageObject;

import Utils.CommonMethods;
public class ClassTest1 extends BaseClass {

	public static PageObject pom = new PageObject();
	//ClassPage1 cp1= PageFactory.initElements(driver, ClassPage1.class);
	CommonMethods cm =new CommonMethods();
	
	public ClassPage1 c1=new ClassPage1(driver);

	
	@Test
	private void isDisplay() throws IOException, InterruptedException {
		scroll(pom.getClassPage4().getLogin());
		cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
		CommonMethods.isdisplayed(pom.getClassPage1().getLogin());
		CommonMethods.isdisplayed(pom.getClassPage1().getRegister());
		CommonMethods.isdisplayed(pom.getClassPage1().getSearchBtn());
		
		
//		cm.elementToBeVisibleWait(c1.getLogin());
//		cm.elementToBeVisibleWait(c1.getRegister());
//		cm.elementToBeVisibleWait(c1.getSearchBtn());
//		


	}
	@Ignore
	@Test
	private void isClickable() throws IOException, InterruptedException {
		scroll(pom.getClassPage4().getLogin());
		cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
		CommonMethods.elementToBeClickableWait(pom.getClassPage1().getLogin());

		CommonMethods.elementToBeClickableWait(pom.getClassPage1().getRegister());
		CommonMethods.elementToBeClickableWait(pom.getClassPage1().getSearchBtn());


	}

}
