package com.HandleCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLast2CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement>CheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'check')]"));
		System.out.println("total number of checkbox:" +CheckBoxes.size());
		
		// select last 2 checkboxs
		// total no of checkboxes - no of checkboxes want to select = starting index
		//3-2=1
		
		int totalcheckboxes=CheckBoxes.size();
		for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			CheckBoxes.get(i).click();
		}
		

	}

}








