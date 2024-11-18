 package com.base;



import java.awt.Desktop;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.properties.FileReaderManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static File file;
	

//	@BeforeClass
//	
//	public static WebDriver launchBrowser() throws IOException {	
//		String browsername = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getBrowserName();
//		driver.get(browsername);
//		
//	
//		if (browsername.equalsIgnoreCase("chrome")) {
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if (browsername.equalsIgnoreCase("firefox")) {
//					
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}	
//		else if (browsername.equalsIgnoreCase("edge")) {
//			
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}	
//		driver.manage().window().maximize();
//		String url = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getUrl();
//		driver.get(url);
//		implicitwait(50);
//		return driver;
//	}

	// 1 Launch Browser
	@BeforeClass
	public static WebDriver launchBrowser() throws IOException {	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getUrl();
		driver.get(url);
		implicitwait(50);
	
	return driver;
	}
	
	// 2 get
	public static WebDriver launchUrl(String url) {
		driver.get(url);
	return driver;
	}
//
	@AfterClass
	// 3 close
	public static void closeBrowser() {
		driver.close();
	}
	

//	@AfterTest
//	private void tearDown() {
//	terminateBrowser();
//	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}
//	public static void extentReportStart(String location) { 
//		extentReports = new ExtentReports(); 
//		file = new File(location);
//		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file); 
//		extentReports.attachReporter(sparkReporter); 
//		extentReports.setSystemInfo("OS", System.getProperty("os.name")); 
//		extentReports.setSystemInfo("Java Version", System.getProperty("java.version")); 
//		}
//	public void extentReportTearDown(String location) throws IOException {
//		extentReports.flush();
//		file = new File(location);
//		Desktop.getDesktop().browse((file).toURI());
//		}
	public String takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"\\ScreenShots\\qkart.png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();
		}
	
	//4 quit
	
			public static void terminateBrowser() {
				driver.quit();
			}
	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

}	
