package com.HandleCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByChoice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement>CheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'check')]"));
		System.out.println("total number of checkbox:" +CheckBoxes.size());
		
			//Select multiple checkbox by choice
		// checkbox1 and checkbox3
		
		for(WebElement chek:CheckBoxes)
		{
		String checkboxname=chek.getAttribute("id");
		
		if(checkboxname.equals("vfb-6-0")||checkboxname.equals("vfb-6-2"))
		{
			chek.click();
		}
		}
		
	
	
	
	
	
	
	
	
	
	}
	

}
