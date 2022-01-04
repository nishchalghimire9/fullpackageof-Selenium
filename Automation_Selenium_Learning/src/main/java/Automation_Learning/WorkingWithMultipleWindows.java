package Automation_Learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMultipleWindows {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		WebElement books = driver.findElement(By.linkText("Kindle Books"));
		Actions obj = new Actions(driver);
		obj.keyDown(Keys.SHIFT).build().perform();
		books.click();
		Thread.sleep(2000);
		obj.keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		String currentWindow = driver.getWindowHandle();
		System.out.println("This is parrent window: " +  currentWindow);
		
		Thread.sleep(2000);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator <String> iterators = windowhandles.iterator();
		String Parrentwindowhandlesrs = iterators.next();	
		String Childwindowhandlesrs = iterators.next();
		System.out.println("This is parrent window: " +  Parrentwindowhandlesrs);
		System.out.println("This is child window: " +  Childwindowhandlesrs);
		Thread.sleep(3000);
		driver.switchTo().window(Childwindowhandlesrs);
		Thread.sleep(3000);
		WebElement exclusive = driver.findElement(By.linkText("Kindle Exclusives"));
		exclusive.click();
		
	}

}
