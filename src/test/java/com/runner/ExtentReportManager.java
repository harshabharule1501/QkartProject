package com.runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter; //UI of the report 
	public ExtentReports extent;// populate common information
	public ExtentTest test; //creates test case entry in the reports  and update status of test methods 
	
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");//location of the report
		sparkReporter.config().setReportName("functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		extent= new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("computer name", "localhost");

		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("tester name", "harsha");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("browser name", "chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "test case passed is "+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test case failed is "+result.getName());
		test.log(Status.FAIL, "test case failed cause is "+result.getThrowable());

	}
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test case skipped is "+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
		//whatever things we have created so far it will update that in reports
	}
}
