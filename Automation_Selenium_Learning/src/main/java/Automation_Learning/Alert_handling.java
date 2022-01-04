package Automation_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
				
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		WebElement clickfirstalert = driver.findElement(By.id("alertButton"));
		
		clickfirstalert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement clicksecondtalert = driver.findElement(By.id("confirmButton"));
		clicksecondtalert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement clickonPromptbutton = driver.findElement(By.id("promtButton"));
		clickonPromptbutton.click();
		driver.switchTo().alert().sendKeys("nishchal");
		
		
		
		
	}

}
