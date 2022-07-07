package com.BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlOpen {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\selenium setup\\chromedriver.exe");
		
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 System.out.println("Title of the web page:"+driver.getTitle());
		 System.out.println("Current web page Url :"+driver.getCurrentUrl());
		 System.out.println("Page Source of web page : "+driver.getPageSource());
		 
		 driver.findElement(By.id("email")).sendKeys("Ambika");
		 
		 driver.findElement(By.id("pass")).sendKeys("123456");
		 
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(9000);
		 driver.close();
		

	}

}
