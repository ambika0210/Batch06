package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 
		 String parenthandle= driver.getWindowHandle();
		 System.out.println(parenthandle);
		 
		 driver.findElement(By.id("newTabBtn")).click();
		 Thread.sleep(3000);
		 
		// driver.findElement(By.id("alertBox")).click();
		 //Thread.sleep(3000);
		 
		  Set<String> handles= driver.getWindowHandles();
		  for(String handle:handles )
		  {
			System.out.println(handle);  
			
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(3000);
				Alert alert= driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				 //driver.close();
			}
		  }
		   driver.close();

		

	}

}
		  
		  
		  
		  
		  
		  
