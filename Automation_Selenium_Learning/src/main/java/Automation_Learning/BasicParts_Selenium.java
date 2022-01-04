package Automation_Learning;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicParts_Selenium {
	public static WebDriver driver;
	
	
	// these are prerequsite to open and run browser.
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		String windowhandle = driver.getWindowHandle(); // it is use to switch one window to another window.
		System.out.println(windowhandle); // this print out window handle number.
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
		
		
	}

}
