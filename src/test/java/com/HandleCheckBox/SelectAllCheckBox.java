package com.HandleCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement>CheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'check')]"));
		System.out.println("total number of checkbox:" +CheckBoxes.size());
		
		//using for loop
	/*	for(int i=0; i<CheckBoxes.size();i++)
		{
			CheckBoxes.get(i).click();
		}*/

		//using foreach loop
		for(WebElement chek:CheckBoxes)
		{
			chek.click();
		}

	}

}






