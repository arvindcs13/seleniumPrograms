package com.stm.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_popup {

    public static String username="admin";
    public static String password="admin";
    
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
	
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
        driver.close();
	}

}
