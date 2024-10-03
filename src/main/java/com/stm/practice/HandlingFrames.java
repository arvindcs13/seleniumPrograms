package com.stm.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//Count of the available iframes
		List<WebElement> element= driver.findElements(By.tagName("iframe"));
		System.out.println("The count of iframes in the webpage are :"+element.size());
		
		WebElement nframe1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(nframe1);
		 WebElement textframe=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println(textframe.getText());
		
    	driver.switchTo().parentFrame();
		
//		WebElement nframe2= driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");
		 WebElement textframe2=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println(textframe2.getText());
		
		
		

	}

}
