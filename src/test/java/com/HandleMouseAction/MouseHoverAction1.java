package com.HandleMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("(//button[contains(text(),'Products')])[1]"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//span[@class=\"nav_item_name\"]"));
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.linkText("Live for Teams"));
		action.moveToElement(element2).click().perform();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		

	

	}

}









