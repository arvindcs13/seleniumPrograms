package com.stm.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframes {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/nestedframes");
	driver.manage().window().maximize();
	//Count of the available iframes
//	List<WebElement> element= driver.findElements(By.tagName("iframe"));
//	System.out.println("The count of iframes in the webpage are :"+element.size());
	
	WebElement parentFrame= driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(parentFrame);

	
//	WebElement chileFrame= driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(0);
	 WebElement textframe=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	System.out.println(textframe.getText());
	
	driver.switchTo().parentFrame(); // switch the control to parent frame
	System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
	driver.switchTo().defaultContent(); // switch the control to main window
	System.out.println(driver.getTitle());
	
}
}
