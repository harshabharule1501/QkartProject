package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassPage5 {
	public WebDriver driver;

	public ClassPage5(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement Register;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Login;
	
	@FindBy(id = "username")
	private WebElement regUnm;
	
	@FindBy(id = "password")
	private WebElement regPwd;
	
	@FindBy(id = "confirmPassword")
	private WebElement regConfirmPwd;
	

	@FindBy(xpath = "//button[text()='Register Now']")
	private WebElement regNowBtn;	
	
	@FindBy(xpath = "(//input[@placeholder='Search for items/categories'])[1]")
	private WebElement searchForItem;	
	

	@FindBy(xpath = "//button[@type='primary']")
	private WebElement QkartLogo;	
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement addToCartBtn;	
	
	@FindBy(xpath = "//div[@id='notistack-snackbar']")
	private WebElement popupAfterAddToCart;	
	

	@FindBy(xpath = "//select[@id='uncontrolled-native']")
	private WebElement productSizeDropdowm;	
	
	@FindBy(xpath = "//button[text()='Login to QKart']")
	private WebElement loginToQkart;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement checkout;
	
	@FindBy(xpath = "//button[@id='add-new-btn']")
	private WebElement addNewAdd;
	
	
	@FindBy(xpath = "//textarea[@placeholder='Enter your complete address']")
	private WebElement textAreaForNewAdd;
	
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addButtonForAddress;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioButtonForAddress;
	

	@FindBy(xpath = "(//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div/div[1]/p/text())[2]")
	private WebElement textOnAddress;
	
	@FindBy(xpath = "//p[text()=' Delete ']")
	private WebElement deleteAdd;
	
	public WebElement getDeleteAdd() {
		return deleteAdd;
	}
	public WebElement getTextOnAddress() {
		return textOnAddress;
	}
	public WebElement getRadioButtonForAddress() {
		return radioButtonForAddress;
	}
	public WebElement getAddButtonForAddress() {
		return addButtonForAddress;
	}
	public WebElement getTextAreaForNewAdd() {
		return textAreaForNewAdd;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getProductSizeDropdowm() {
		return productSizeDropdowm;
	}
	public WebElement getPopupAfterAddToCart() {
		return popupAfterAddToCart;
	}

	
	public WebElement getSearchForItem() {
		return searchForItem;
	}

	public WebElement getQkartLogo() {
		return QkartLogo;
	}
	
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	


	
	public WebElement getLoginToQkart() {
		return loginToQkart;
	}
	
	public WebElement getRegNowBtn() {
		return regNowBtn;
	}

	public WebElement getRegUnm() {
		return regUnm;
	}

	

	public WebElement getRegPwd() {
		return regPwd;
	}


	public WebElement getRegConfirmPwd() {
		return regConfirmPwd;
	}



	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister() {
		return Register;
	}
	
	public WebElement getLogin() {
		return Login;
	}

	public WebElement getAddNewAdd() {
		// TODO Auto-generated method stub
		return addNewAdd;
	}
	


}
