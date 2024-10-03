package com.stm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html#google_vignette");
		driver.manage().window().maximize();
		WebElement compare1= driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[11]/pre"));
		WebElement compare2= driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
		Actions action = new Actions(driver);
        action.keyDown(compare1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(3000);
        action.keyDown(compare2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
      
        action.keyUp(compare1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(3000);
        action.keyUp(compare2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
