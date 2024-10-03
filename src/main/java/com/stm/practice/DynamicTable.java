package com.stm.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.umaryland.edu/cpa/website-manual/content-types/dynamic-table/#page-1");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement move = driver.findElement(By.xpath("//table[@class='super-table']"));

		Actions action = new Actions(driver);
		action.moveToElement(move).perform();

		// Heading of the tables
		List<WebElement> heading = driver.findElements(By.xpath("//table[@class='super-table']//th"));
		int headsize = heading.size();
		for (WebElement items : heading) {
			System.out.print(items.getText() + "         ");
		}

		// data of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='super-table']//tbody//tr"));
		int rows_size = rows.size();

		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='super-table']//tbody//tr"));
		int cols_size = cols.size();
        System.out.println();
		for (int i = 1; i <= rows_size; i++) {
			for (int j = 1; j <= 3; j++) {  
				System.out.print(driver
						.findElement(By.xpath("//table[@class='super-table']//tbody//tr[" + i + "]//td[" + j + "]"))
						.getText()+" ");
			}
			System.out.println();
		}
	}

}
