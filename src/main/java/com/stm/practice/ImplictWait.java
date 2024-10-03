package com.stm.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWait {

	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement Electronics= driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li[3]/a"));
//        
//        
//        Actions action = new Actions(driver);
//        action.moveToElement(Electronics).perform();
//        action.moveToElement(Samsung).click().perform();
//		WebElement element=	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(Electronics).perform();
//		Thread.sleep(2000);
//		
		WebElement samsung= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"));
		samsung.click();

	}

}
