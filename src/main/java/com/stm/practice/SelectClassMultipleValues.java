package com.stm.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMultipleValues {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
//		/Dropdown Selecting a multiple value
		WebElement element = driver.findElement(By.xpath("//select[@id='cars']"));
		Select select = new Select(element);
		
		//to Check the dropdown allows you to select the mulitple value or not
		if(select.isMultiple()==true){
			System.out.println("DropDwn allows you to select mutiple values ");
			Thread.sleep(3000);
			List<WebElement> dpdwn_items=select.getOptions();
			System.out.println("All the items present in the dpdwn");
			for(WebElement cars :dpdwn_items) {
				System.out.println(cars.getText());
			}
			select.selectByIndex(0);
			Thread.sleep(3000);
			select.selectByValue("audi");
			Thread.sleep(3000);
			select.selectByVisibleText("Opel");
			System.out.println("Printing all the selected options...");
			
			List<WebElement> selected_options=select.getAllSelectedOptions();
			for(WebElement selected_cars :dpdwn_items) {
				System.out.println(selected_cars.getText());
			}
			
			System.out.println("Printing  the First selected option");
			System.out.println(select.getFirstSelectedOption().getText());
////			Thread.sleep(3000);
////			select.deselectByValue("saab");
//			Thread.sleep(3000);
//			select.deselectByIndex(0);
//			Thread.sleep(3000);
		select.deselectAll();
			
			
		}
		else {
			System.out.println("Sorry");
		}
		
       driver.close();
	}

}
