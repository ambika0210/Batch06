package com.BasicCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Select obj = new Select(driver.findElement(By.id("month")));
		obj.selectByIndex(0);
		List<WebElement> allProduct = driver.findElements(By.xpath("//select[@id=\"month\"]//option")); 

		for (WebElement product : allProduct) {
		String sample = product.getText();
		System.out.println(sample);
		String month = "Feb";
		if(sample.equals(month)) {
			System.out.println("step");
		obj.selectByVisibleText("Feb");
		}
		}
		}
		

	}


