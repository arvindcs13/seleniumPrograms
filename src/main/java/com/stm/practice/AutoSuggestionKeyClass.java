package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionKeyClass {
	
public static void main(String[] args) throws Throwable {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='From']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Gorakhpur");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	driver.quit();
	
}
}
