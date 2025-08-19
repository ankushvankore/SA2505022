package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")WebElement fullName;
	@FindBy(xpath = "//*[@placeholder=\"Enter Rediffmail ID\"]")WebElement rediffID;
	@FindBy(xpath = "/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input")WebElement gnMale;
	@FindBy(xpath = "/html/body/div[2]/div[2]/form/div/div[9]/div/label[2]/input")WebElement gnFemale;
	
	public RediffUtility(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFullName(String fn)
	{
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void enterRediffId(String rid)
	{
		//driver.findElement(By.xpath("//*[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
		rediffID.sendKeys(rid);
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(ps);;
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
	}
	public void selectBirthDate(String day, String month, String year)
	{
		//Select d = new Select(driver.findElement(By.xpath("//select[@class=\"day\"]")));
		//d.selectByContainsVisibleText(day);
		new Select(driver.findElement(By.xpath("//select[@class=\"day\"]"))).selectByContainsVisibleText(day);
		new Select(driver.findElement(By.xpath("//select[@class=\"middle month\"]"))).selectByContainsVisibleText(month);
		new Select(driver.findElement(By.xpath("//select[@class=\"year\"]"))).selectByContainsVisibleText(year);
	}
	public void selectGender(String gn)
	{
		if(gn.equals("Male"))
			gnMale.click();
		else
			gnFemale.click();
	}
	public void checkAvailablity()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText());
	}
}
