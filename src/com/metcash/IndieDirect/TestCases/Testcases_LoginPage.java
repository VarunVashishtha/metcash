package com.metcash.IndieDirect.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.metcash.IndieDirect.Genericfunctions.GenericFunctions;
import com.metcash.IndieDirect.PageObjects.LoginPage;

public class Testcases_LoginPage  {
	String browserType = "firefox";
	WebDriver driver;
	GenericFunctions generic;

	@BeforeMethod
	public void Before(){
		generic = new GenericFunctions(driver);
		driver = generic.StartDriver(browserType);
		driver.manage().window().maximize();
	}
//	@AfterTest()
//	public void aftertest()
//	{
//		driver.quit();
//	}
	@Test
	//To verify that Login functionality
	public void TC01()
	{
		driver.get("https://localhost:9002/retailers/login");
		driver.findElement(By.xpath(LoginPage.username_txt)).sendKeys("customer1@test.com");
		driver.findElement(By.xpath(LoginPage.password_txt)).sendKeys("12341234");
		driver.findElement(By.xpath(LoginPage.login_btn)).click();
	}
	@Test
	//To verify that drag and drop functionality
	public void TC02()
	{
		driver.get("https://localhost:9002/suppliers/login");
		driver.findElement(By.xpath(LoginPage.username_txt)).sendKeys("soulfresh@gmail.com");
		driver.findElement(By.xpath(LoginPage.password_txt)).sendKeys("12341234");
		driver.findElement(By.xpath(LoginPage.login_btn)).click();
		driver.findElement(By.xpath(LoginPage.Products_tab)).click();
		driver.findElement(By.xpath(LoginPage.bulkupload_Lnk)).click();
		 WebElement uploadElement = driver.findElement(By.xpath(LoginPage.upload_Lnk));
		  uploadElement.sendKeys("C:\\Users\\puneetamishra\\Downloads\\Product_Upload_Template v1.04 - 16.04.2018.xlsx");
//		  untime.getRuntime().exec("AutoIt .exe filepath");

		 
	}
}


