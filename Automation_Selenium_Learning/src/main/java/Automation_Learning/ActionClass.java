
// it is used to hover to element and click specifive link in the webpage
package Automation_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
				
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		// in action class we just need to create one object for whole class.
		Actions obj = new Actions(driver); // it accept driver as an argument. 
		
		WebElement viewsdropdownlist = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		obj.moveToElement(viewsdropdownlist).build().perform();
		Thread.sleep(1000);
		WebElement kindleUnlimited = driver.findElement(By.linkText("Kindle Unlimited"));
		obj.moveToElement(kindleUnlimited).click().perform();
		
		driver.navigate().back();
		
		WebElement viewslist = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		obj.moveToElement(viewslist).build().perform();
		
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.linkText("Orders"));
		obj.moveToElement(order).click().perform();
		
		
		
		
	}
}