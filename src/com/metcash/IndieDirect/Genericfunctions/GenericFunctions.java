package com.metcash.IndieDirect.Genericfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericFunctions {
	public WebDriver driver;

	public GenericFunctions(WebDriver driver){
		this.driver=driver;
	}

	public WebDriver StartDriver(String browserType){

		if(browserType.trim().equalsIgnoreCase("")){
			System.out.println("Kindly set the 'browserType' variable before calling this function");
//			System.setProperty("webdriver.gecko.driver", "C:\\Common_Resources\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Common_Resources\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if(browserType.startsWith("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Common_Resources\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(browserType.startsWith("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Common_Resources\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();

		}	
		return driver;
		}

	
	


}




