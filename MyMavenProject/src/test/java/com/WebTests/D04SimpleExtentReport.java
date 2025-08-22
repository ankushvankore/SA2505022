package com.WebTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class D04SimpleExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MySimpleReport.html");
		//The file that will store the report
		ExtentReports report = new ExtentReports();
		//This object represents the report
		report.attachReporter(htmlReport);
		//Store the report in the html file
	}

}
