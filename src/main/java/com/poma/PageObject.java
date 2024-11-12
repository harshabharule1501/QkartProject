package com.poma;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pom.ClassPage1;
import com.pom.ClassPage2;
import com.pom.ClassPage3;
import com.pom.ClassPage4;
import com.pom.ClassPage5;


public class PageObject extends BaseClass {
	
	private ClassPage1 c1;
	private ClassPage2 c2;
	private ClassPage3 c3;
	private ClassPage4 c4;
	private ClassPage5 c5;
	
	

	public ClassPage1 getClassPage1() {
		if (c1 == null) {
			c1 = new ClassPage1(driver);
			
		}
		return c1;
	}
	

	public ClassPage2 getClassPage2() {
		if (c2 == null) {
			c2 = new ClassPage2(driver);
			
		}
		return c2;
	}
	
	public ClassPage3 getClassPage3() {
		if (c3 == null) {
			c3 = new ClassPage3(driver);
			
		}
		return c3;
	}

	public ClassPage4 getClassPage4() {
		if (c4 == null) {
			c4 = new ClassPage4(driver);
			
		}
		return c4;
	}
	
	
	public ClassPage5 getClassPage5() {
		if (c5 == null) {
			c5 = new ClassPage5(driver);
			
		}
		return c5;
	}
	
}
