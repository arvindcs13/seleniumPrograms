package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommandsandXpathSyntax {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		starts -with function xpath
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		Thread.sleep(3000);
//		XPath Contains Function 
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
//		XPath text() Method 
	
			WebElement bagpack=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			if(bagpack.isDisplayed()) {
//				XPath AND Operator 
				driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory' and text()='ADD TO CART']")).click();
			}
			else {
				System.out.println("Item is not available !");
			}
	
//			| XPath OR Operator
			driver.findElement(By.xpath("//div[@id='shopping_cart_container' or @class='shopping_cart_container']//a")).click();
			
			driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
			Thread.sleep(3000);
//			XPath Axes Methods
//			pARENT |Child | self
			driver.findElement(By.xpath("//input[@name='Password']//parent::"
					+ "div[@class='userform']//child::input[@name='email']//self::input")).sendKeys("peepeeppepe");
			

	}

}
