package com.BasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		 driver.get("https://demoqa.com/select-menu");
		 //Thread.sleep(3000);
		 driver.findElement(By.xpath("//(div[@class=\" css-tlfecz-indicatorContainer\"])[1])")).click();
		driver.findElement(By.xpath("//div[contains(text(),\"Group 1, option 2\")]")).click();
		 Thread.sleep(3000);
		 driver.close();

		
		

	}

}
