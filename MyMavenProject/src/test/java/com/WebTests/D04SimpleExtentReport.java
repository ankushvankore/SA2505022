package com.WebTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04SimpleExtentReport {

	public static void main(String[] args) throws InterruptedException {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("Reports/MySimpleReport.html");
		//The file that will store the report
		ExtentReports report = new ExtentReports();
		//This object represents the report
		report.attachReporter(htmlReport);
		//Store the report in the html file
		ExtentTest test;
		//Object to store the details about tests
		
		//Adding Environment details
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("User Name", "Neelima");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("RAM", "16 GB");
		
		//Configuration of look and feel
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		test = report.createTest("Google Title Test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title: " + driver.getTitle());
		driver.close();
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google Title: Pass", ExtentColor.GREEN));
		
		test = report.createTest("Google Search Test");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search: Fail", ExtentColor.RED));
		
		report.flush();	//This will generate the report file.
	}

}
