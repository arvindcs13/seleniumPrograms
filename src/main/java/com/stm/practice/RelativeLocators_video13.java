package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators_video13 {
	public  static String browser = "firefox";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.saucedemo.com/v1/");
		WebElement password=driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(RelativeLocator.with(By.className("btn_action")).below(password)).click();
		
	}


}
