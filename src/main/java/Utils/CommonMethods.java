package Utils;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class CommonMethods extends BaseClass{
	//here i am writing all common methods that will be reusable in different test classes 
	

		public static void forwardPage() {
			driver.navigate().forward();
		}

	
		public static void passInput(WebElement element, String input) {
			element.sendKeys(input);
		}
	

		public static void clickButton(WebElement element) {
			element.click();
		}

	
		public static void deleteInpt(WebElement element) {
			element.clear();
		}

		private static Select dropDownsObject(WebElement element) {
			Select s = new Select(element);
			return s;
		}

		public static void selectbyValue(WebElement element, String ind) {
			dropDownsObject(element).selectByValue(ind);
		}

		public static void selectbyIndex(WebElement element, int input) {
			dropDownsObject(element).selectByIndex(input);
		}

		public static void selectbyVisibletext(WebElement element, String sec) {
			dropDownsObject(element).selectByVisibleText(sec);
		}

		public static void screenShot(String loc) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File as = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(loc);
			FileUtils.copyFile(as, des);
		}

		public static void scroll(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);

		}


		public static void navigateto(String url) {
			driver.navigate().to(url);
		}

		public static void backPage(WebElement element) {
			driver.navigate().back();
		}


		public static void reFresh(WebElement element) {
			driver.navigate().refresh();
		}

	
		public static void RadioButton(WebElement element) {
			element.click();
		}

	
		public static void alertaccept() {
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		

	
		public static void alertdismiss() {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}

	
		public static void alertinput(WebElement element, String input) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(input);
		}

	
		public static void getalerttext() {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
		}

	
		public static void getcurrenturl() {
			System.out.println(driver.getCurrentUrl());
		}


		public static void gettitle() {
			System.out.println(driver.getTitle());
		}

		public static void getTex(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}

		private static Actions actionsObj() {
			Actions as = new Actions(driver);
			return as;
		}

	
		public static void draganddrop(WebElement element, WebElement element1) {
			actionsObj().dragAndDrop(element, element1).click().build().perform();
		}

	
		public static void actionclick(WebElement element) {
			actionsObj().click(element).perform();
		}

		public static void movetoelement(WebElement element) {
			actionsObj().moveToElement(element).perform();
		}

	
		public static void contextclick(WebElement element) {
			actionsObj().contextClick(element).perform();
		}

	
		public static void doubleclick(WebElement element) {
			actionsObj().doubleClick(element).perform();
		}

		private static Robot robotObj() throws AWTException {
			Robot rt = new Robot();
			return rt;
		}

	
		public static void downkey() throws AWTException {
			robotObj().keyPress(KeyEvent.VK_DOWN);
			robotObj().keyRelease(KeyEvent.VK_DOWN);
		}

	
		public static void upkey() throws AWTException {
			robotObj().keyPress(KeyEvent.VK_UP);
			robotObj().keyRelease(KeyEvent.VK_UP);
		}

		public static void enterkey() throws AWTException {
			robotObj().keyPress(KeyEvent.VK_ENTER);
			robotObj().keyRelease(KeyEvent.VK_ENTER);
		}


		public static void windowhandles() {
			Set<String> allid = driver.getWindowHandles();
			System.out.println(allid);
			for (String id : allid) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
		}
		}

		public static void windowhandle() {
			String id = driver.getWindowHandle();
			System.out.println(id);
		}

	
		public static void isenable(WebElement element) {
			System.out.println(element.isEnabled());
		}

	
		public static void isdisplayed(WebElement element) {
			System.out.println(element.isDisplayed());
		}


		public static void isselected(WebElement element) {
			System.out.println(element.isSelected());
		}

	
		public static void deselectbyVisibletext(WebElement element, String des) {
			dropDownsObject(element).deselectByVisibleText(des);
		}

	
		public static void ismultiple(WebElement element) {
			Select s = new Select(element);
			System.out.println(s.isMultiple());
		}

	
		public static void deselectbyValue(WebElement element, String ind) {
			dropDownsObject(element).deselectByValue(ind);
		}

	
		public static void deselectbyIndex(WebElement element, int input) {
			dropDownsObject(element).deselectByIndex(input);
		}

		public static void getoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement set : options) {
				System.out.println(set.getText());
			}
		}


		public static void getfirstselectedoptions(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}

	
		public static void getallslectedoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selectedOptions : allSelectedOptions) {
				System.out.println(selectedOptions.getText());
			}
		}

		public static void implicitwait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}



		public static void webtableAllDatas(List<WebElement> elements) {
			List<WebElement> datas = elements;
			for (WebElement allDatas : datas) {
				System.out.println(allDatas.getText());
			}
		}
	

		public static void webtableRowDatas(List<WebElement> elements) {
			List<WebElement> rDatas = elements;
			for (WebElement rowDatas : rDatas) {
				System.out.println(rowDatas.getText());
			}
		}
	
		public static void webtableCoulmnDatas(List<WebElement> elements) {
			List<WebElement> cDatas = elements;
			for (WebElement columnDatas : cDatas) {
				System.out.println(columnDatas.getText());
			}
		}
	
	public static void webtableSingleData(WebElement element) {
	System.out.println(element.getText());
	}

	public static void frameId(String id) {
	driver.switchTo().frame(id);	
	}
	
	public static void frameIndex(int index) {
	driver.switchTo().frame(index);
	}

	public static void frameWebelemet(WebElement element) {
	driver.switchTo().frame(element);
	}
	
	public static void frameExit() {
	driver.switchTo().defaultContent();
	}
	
	public static void outerFrame() {
	driver.switchTo().parentFrame();
	}
	public static void goWindow(int num) {
		ArrayList<String>allwin = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(allwin.get(num));
	}

	public static void  assertMethod(String actual, String expected)
	{
		Assert.assertEquals(actual, expected);
		
	}

	
	public static void elementToBeClickableWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void elementToBeVisibleWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	}


