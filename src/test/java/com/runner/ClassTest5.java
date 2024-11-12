package com.runner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.ClassPage5;
import com.poma.PageObject;

import Utils.CommonMethods;

public class ClassTest5 extends BaseClass{
	public static PageObject pom = new PageObject();
	//ClassPage1 cp1= PageFactory.initElements(driver, ClassPage1.class);
	CommonMethods cm =new CommonMethods();
	
	public ClassPage5 c5=new ClassPage5(driver);
	
	@Ignore
	@Test
	public void registerToQkart() throws InterruptedException{
	scroll(pom.getClassPage4().getLogin());
	cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
	CommonMethods.clickButton(pom.getClassPage5().getRegister());
	CommonMethods.clickButton(pom.getClassPage5().getRegUnm());

	CommonMethods.passInput(pom.getClassPage5().getRegUnm(), "harsh");
	CommonMethods.clickButton(pom.getClassPage5().getRegPwd());

	CommonMethods.passInput(pom.getClassPage5().getRegPwd(), "harsh");
	CommonMethods.clickButton(pom.getClassPage5().getRegConfirmPwd());

	CommonMethods.passInput(pom.getClassPage5().getRegConfirmPwd(), "harsh");
	CommonMethods.clickButton(pom.getClassPage5().getRegNowBtn());


	}

	@Ignore
	@Test
	public void loginToQkart()
	{
		scroll(pom.getClassPage4().getLogin());
		cm.elementToBeVisibleWait(pom.getClassPage4().getLogin());
		CommonMethods.clickButton(pom.getClassPage5().getLogin());

		CommonMethods.passInput(pom.getClassPage5().getRegUnm(), "harsha");
		CommonMethods.clickButton(pom.getClassPage5().getRegPwd());

		CommonMethods.passInput(pom.getClassPage5().getRegPwd(), "harsha");
		CommonMethods.clickButton(pom.getClassPage5().getLoginToQkart());

	}
	@Test
	public void operationsOnProduct() throws InterruptedException {
		
		loginToQkart();
	
		CommonMethods.clickButton(pom.getClassPage5().getSearchForItem());
		CommonMethods.passInput(pom.getClassPage5().getSearchForItem(), "YONEX Smash Badminton Racquet");
		CommonMethods.passInput(pom.getClassPage5().getSearchForItem(), ""+Keys.ENTER);

		scroll(pom.getClassPage5().getAddToCartBtn());
	
		cm.elementToBeVisibleWait(pom.getClassPage5().getAddToCartBtn());
		CommonMethods.clickButton(pom.getClassPage5().getAddToCartBtn());
		cm.elementToBeVisibleWait(pom.getClassPage5().getAddToCartBtn());

		CommonMethods.clickButton(pom.getClassPage5().getAddToCartBtn());
	
//		CommonMethods.assertMethod(pom.getClassPage5().getPopupAfterAddToCart().getText().toString(), "Item already in cart. Use the cart sidebar to update quantity or remove item.");
	
		scroll(pom.getClassPage5().getSearchForItem());
		cm.elementToBeVisibleWait(pom.getClassPage5().getSearchForItem());

		CommonMethods.clickButton(pom.getClassPage5().getSearchForItem());
		CommonMethods.deleteInpt(pom.getClassPage5().getSearchForItem());
		CommonMethods.passInput(pom.getClassPage5().getSearchForItem(), "Roadster Mens Running Shoes");
		CommonMethods.passInput(pom.getClassPage5().getSearchForItem(), ""+Keys.ENTER);
		scroll(pom.getClassPage5().getAddToCartBtn());
			
//		CommonMethods.clickButton(pom.getClassPage5().getAddToCartBtn());
//		
		cm.elementToBeVisibleWait(pom.getClassPage5().getProductSizeDropdowm());

		CommonMethods.selectbyVisibletext(pom.getClassPage5().getProductSizeDropdowm(), "7");
		

		
		cm.elementToBeVisibleWait(pom.getClassPage5().getCheckout());

		CommonMethods.clickButton(pom.getClassPage5().getCheckout());
		
		String checkoutPageURL= pom.getClassPage3().getcurrenturl();
		//CommonMethods.assertMethod(checkoutPageURL, "https://crio-qkart-frontend-qa.vercel.app/checkout");
		
		cm.elementToBeVisibleWait(pom.getClassPage5().getAddNewAdd());

		CommonMethods.clickButton(pom.getClassPage5().getAddNewAdd());

		CommonMethods.clickButton(pom.getClassPage5().getTextAreaForNewAdd());
		cm.elementToBeVisibleWait(pom.getClassPage5().getTextAreaForNewAdd());

		CommonMethods.passInput(pom.getClassPage5().getTextAreaForNewAdd(),"Location of dummy, address of dummy, location map");
		
		cm.elementToBeVisibleWait(pom.getClassPage5().getAddButtonForAddress());

		CommonMethods.clickButton(pom.getClassPage5().getAddButtonForAddress());
		

		CommonMethods.clickButton(pom.getClassPage5().getRadioButtonForAddress());

//		CommonMethods.isdisplayed(pom.getClassPage5().getTextOnAddress());

		CommonMethods.clickButton(pom.getClassPage5().getDeleteAdd());
	}
	
}
