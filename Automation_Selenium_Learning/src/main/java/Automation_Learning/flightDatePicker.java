package Automation_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightDatePicker {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
				
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
		WebElement flights = driver.findElement(By.linkText("Flights"));
		flights.click();
		
		WebElement departureDate= driver.findElement(By.id("d1-btn"));
		departureDate.click();
		
		WebElement selectdate= driver.findElement(By.xpath("//*[@aria-label='Jan 29, 2022']"));
		selectdate.click();
	}

}
