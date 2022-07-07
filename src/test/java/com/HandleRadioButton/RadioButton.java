package com.HandleRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.id("u_0_4_xt")).click();
		WebElement r= driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Female']]"));
		System.out.println("Before:"+r.isSelected());
	if(!(r.isSelected()))
	{
		r.click();
	}
	Thread.sleep(3000);
	System.out.println("After:"+r.isSelected());

}

}
