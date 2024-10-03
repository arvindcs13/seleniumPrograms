package com.stm.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("standard_user");
		
//		XPath Contains Function 
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		Thread.sleep(1000);
		
		//Using Find Elements Xpath for all the items in inventory
		List<WebElement> inventry_items = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
//		inventry_items.get(0).getText();
		 
		//Accessing the inventry_items one by one 
		System.out.println("Items present ion inventory");
		for (WebElement items:inventry_items) {
			System.out.println(items.getText());
		}
		

	}

}
