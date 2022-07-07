package com.HandleMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@id=\"free-trial-link-anchor\"]"));
		action.doubleClick(element).perform();

		

	}

}
