package com.stm.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivberInterface_Vedio11 {

	public static String browser = "firefox";
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.2");
		Thread.sleep(3000);
		driver.close();
	}

}
