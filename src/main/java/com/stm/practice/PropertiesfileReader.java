package com.stm.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesfileReader {
	
public static void main(String[] args) throws Throwable {
	
	Properties prp= new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\naya-workspace\\Selenium.switch\\target\\My.properties");
	 prp.load(fis);
	 System.out.println(prp.getProperty("browser"));
	 System.out.println(prp.getProperty("env"));
	 System.out.println(prp.getProperty("url"));
	 
	 FileOutputStream fiso = new FileOutputStream("C:\\Users\\Vijay\\naya-workspace\\Selenium.switch\\target\\My.properties");
	 prp.setProperty("First_Name", "Arvind");
	 prp.setProperty("Last_Name", "Yadav");
	 prp.store(fiso, "Storing the full name ");
}
}
