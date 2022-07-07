package HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BySelect {
	
	public static void main(String[] args) throws InterruptedException {

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
WebElement drpDayEle=	driver.findElement(By.id("day"));
Select drpDay=new Select(drpDayEle);
drpDay.selectByIndex(3);
//Thread.sleep(3000);

drpDay.selectByValue("4");
drpDay.selectByVisibleText("9");
	
	
	//driver.findElement(By)




}
}


