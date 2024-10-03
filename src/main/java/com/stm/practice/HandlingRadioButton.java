package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButton {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
	WebElement impressive = driver.findElement(By.xpath("//*[@id='impressiveRadio']"));
	WebElement noRadio = driver.findElement(By.xpath("//label[@for='noRadio']//preceding-sibling::input"));
	
	System.out.println(impressive.isDisplayed());
	System.out.println(impressive.isEnabled());
	Thread.sleep(3000);
	impressive.click();
	
	
	
}
}
