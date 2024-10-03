package com.stm.practice;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@label='Watch demo']")).click();
		Thread.sleep(3000);
		
		java.util.Set<String> windowHandles=driver.getWindowHandles();
		
//		java.util.Iterator<String> it=windowHandles.iterator();
		java.util.Iterator<String> it= windowHandles.iterator();
		String parent_window= it.next();
		System.out.println(parent_window);
		String child_window=it.next();
		System.out.println(child_window);
		
		driver.switchTo().window(child_window);
		Thread.sleep(2000);
		driver.findElement(By.name("UserFirstName")).sendKeys("Big");
		driver.findElement(By.name("UserLastName")).sendKeys("Brother");
		Thread.sleep(2000);
		driver.switchTo().window(parent_window);
		driver.quit();
		
		
		

	}

}
