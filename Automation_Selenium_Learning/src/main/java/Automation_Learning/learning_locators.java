package Automation_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_locators {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		 WebElement clickBestsellers = driver.findElement(By.linkText("Best Sellers"));
		 clickBestsellers.click();
		
		 WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		 searchfield.sendKeys("computer");
		 
		 WebElement clicksign = driver.findElement(By.id("nav-search-submit-button"));
		 clicksign.click();
		 
		 
	}

}
