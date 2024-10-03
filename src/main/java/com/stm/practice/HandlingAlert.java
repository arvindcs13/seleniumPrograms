package com.stm.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
        Alert alert1=driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(2000);
        alert1.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(2000);
        alert1.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);
        alert1.sendKeys("Arvind Yadav");
        alert1.accept();
        driver.quit();
        
		

	}

}
