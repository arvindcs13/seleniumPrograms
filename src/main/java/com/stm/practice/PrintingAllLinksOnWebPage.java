package com.stm.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingAllLinksOnWebPage {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/links");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement> all_links= driver.findElements(By.tagName("a"));
	
	for(WebElement items:all_links) {
		System.out.println(items.getText()+" :"+items.getAttribute("href"));
	}
}
}
