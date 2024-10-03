package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
         
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		

	

	}

}
