package HandleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectobjwithoutmetd {

	public static void main(String[] args) throws InterruptedException {
		// use Select Class Object but without use selectmethod
		// selecting option from dropdown without using methods
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
	WebElement drpMonthEle=	driver.findElement(By.id("month"));
	Select drpMonth=new Select(drpMonthEle);
	List<WebElement> alloptions= drpMonth.getOptions();
	for(WebElement option:alloptions)
		{
		if(option.getText().equals("May"))
		{
			option.click();
			break;
		}
		
	}

	
	
	
	
	
	}
}
