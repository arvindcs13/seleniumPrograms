package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        Actions action= new Actions(driver);
//        action.contextClick().perform(); //right click anywhere on webpage
		WebElement element= driver.findElement(By.xpath("//input[@id='userName']"));
		action.contextClick(element).perform();
		
	}

}
