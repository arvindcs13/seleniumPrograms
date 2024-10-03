package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassBySeleniumHAndleDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
//		/Dropdown Selecting a single value
		WebElement element = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select select = new Select(element);
		select.selectByIndex(2); //It will select by index which starts from 0
		Thread.sleep(3000);
		select.selectByValue("red");
		Thread.sleep(3000);
		select.selectByVisibleText("Indigo");
		select.deselectAll();
		
		
		

	}

}
