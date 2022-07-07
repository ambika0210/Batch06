package HandleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// multiple Drop Down Using Generic method
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
WebElement birthday_day	= driver.findElement(By.name("birthday_day"));
selectoptionfromdropdown(birthday_day,"27");
WebElement birthday_month	= driver.findElement(By.name("birthday_month"));
selectoptionfromdropdown(birthday_month,"June");

WebElement birthday_year= driver.findElement(By.name("birthday_year"));
selectoptionfromdropdown(birthday_year,"2020");
}

public static void selectoptionfromdropdown(WebElement ele,String value)
{
	Select drp= new Select(ele);
	
	
	List<WebElement> alloptions= drp.getOptions();
	for(WebElement option:alloptions)
		{
		if(option.getText().equals(value))
		{
			option.click();
			break;
		}
		
	
}

	}

	

}









