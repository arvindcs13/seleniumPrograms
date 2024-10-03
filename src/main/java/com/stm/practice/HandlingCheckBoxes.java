package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxes {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
	if(element.isDisplayed()==true) {
		if(element.isEnabled()==true) {
			if(element.isSelected()==false) {
				element.click();
			}
			else {
				System.out.println("Already Selected");
			}
		}
		else {
			System.out.println("Element not enabled");
		}
	}
	else {
		System.out.println("Element not Displayed");
	}
}
}
