package com.stm.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriipttExecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
        //getting the titile of webpage 
        JavascriptExecutor javasex = (JavascriptExecutor) driver;
        String script= "return document.title";
        String title= (String) javasex.executeScript(script);
        System.out.println(title);
        
        driver.switchTo().frame("iframeResult");
       
        //Clicking on button
        javasex.executeScript("myFunction()");
	}

}
