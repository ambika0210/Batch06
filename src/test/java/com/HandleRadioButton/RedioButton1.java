package com.HandleRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedioButton1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.id("u_0_4_xt")).click();
		selectrediobutton(driver,"Custom");
		Thread.sleep(2000);
		selectrediobutton(driver,"Female");
		Thread.sleep(2000);
		selectrediobutton(driver,"Male");
		Thread.sleep(2000);

}
	public static void selectrediobutton(WebDriver driver, String value) throws InterruptedException
	{
		System.out.println("value: "+value);
		WebElement r= driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='"+value+"']]"));
		System.out.println("Before:"+r.isSelected());
	if(!(r.isSelected()))
	{
		r.click();
	}
	Thread.sleep(3000);
	System.out.println("After:"+r.isSelected());
		
	}

		

	}









