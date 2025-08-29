package com.WebTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class OHRM_Listner implements ITestListener
{
	public void onStart(ITestContext result)
	{
		System.out.println("Test stated!!!");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Ends!!!");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + ": Fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() + ": Skipped!!!");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started!!!");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + ": Passed!!!");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
