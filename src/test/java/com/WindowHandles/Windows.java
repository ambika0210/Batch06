package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String parentHandle= driver.getWindowHandle();
		 System.out.println(parentHandle);
		 
		 driver.findElement(By.id("newWindowBtn")).click();
		 
		 Set<String> handles = driver.getWindowHandles();
		 for(String handle:handles)
		 {
			 System.out.println(handle);
			 if(!handle.equals(parentHandle))
			 {
				 driver.switchTo().window(handle);
				 driver.findElement(By.id("firstName")).sendKeys("Ambika");
				 Thread.sleep(3000);
				 driver.close();
			 }
		 }
		 driver.switchTo().window(parentHandle);
		 driver.findElement(By.id("name")).sendKeys("Dagade");
		 Thread.sleep(3000);
		 driver.close();
		


		

	}

}
