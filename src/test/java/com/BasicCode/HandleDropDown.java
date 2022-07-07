package com.BasicCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/r.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 Select obj = new Select(driver.findElement(By.id("day")));
		 obj.selectByIndex(0);
		 Thread.sleep(3000);
		 obj.selectByValue("10");	
		 
		 Select obj1 = new Select(driver.findElement(By.name("birthday_month")));
		 Thread.sleep(3000);
		 obj1.selectByValue("10");
		 Thread.sleep(3000);
		 Select obj2 = new Select(driver.findElement(By.id("year")));
		 Thread.sleep(3000);

		 obj2.selectByVisibleText("2020");
		 Thread.sleep(3000);
List<WebElement> ListOfWebElements = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));

System.out.println("total no.of elements: " +ListOfWebElements.size());

List<WebElement> ListOfWebElements1 = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));

System.out.println("total no.of elements: " +ListOfWebElements1.size());

		 
		 driver.close();
		



	}

}
