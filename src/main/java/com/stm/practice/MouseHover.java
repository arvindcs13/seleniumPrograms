package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		driver.get("https://www.ebay.com/");

	WebElement element=	driver.findElement(By.xpath("//div[@id=\"vl-flyout-nav\"]/ul/li[2]"));
	
	Actions action= new Actions(driver);
	
	action.moveToElement(element).perform();
	
	driver.navigate().to("https://www.naukri.com/");
	
	WebElement element_naukri=	driver.findElement(By.xpath("//div[@class='nI-gNb-log-reg']//following-sibling::li"));

	action.moveToElement(element_naukri).perform();
	
	driver.close();

	

	}

}
