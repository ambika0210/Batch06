package com.HandleCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectFirst2Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement>CheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'check')]"));
		System.out.println("total number of checkbox:" +CheckBoxes.size());
		
		// select first 2 checkboxs
		int totalcheckboxes=CheckBoxes.size();
		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<2)
			{
			CheckBoxes.get(i).click();
		}
		
		}
		
		

	}

}
