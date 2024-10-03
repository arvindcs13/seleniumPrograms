package com.stm.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
//		DesiredCapabilities dc= new DesiredCapabilities();
//		dc.setAcceptInsecureCerts(true);
//		
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
//		driver.get("https://expired.badssl.com/");
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
	}

}
