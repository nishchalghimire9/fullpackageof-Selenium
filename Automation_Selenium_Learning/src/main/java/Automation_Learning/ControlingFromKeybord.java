package Automation_Learning;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ControlingFromKeybord {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("computer");
		
		Actions obj = new Actions(driver);  //creating an object foe action class
		Thread.sleep(2000);
		obj.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();    // this line press control key and press a to highlight.
		obj.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();  // this line will copy the keywords
		
		searchfield.clear(); // this line will clear the keywords
		Thread.sleep(2000);
		searchfield.click();
		obj.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();// this line will paste the keywords
		//WebDriverWait wt = new WebDriverWait(driver,10);  // this is explicit wait 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS ); // this is implicit wait.
		WebElement clicksearchicon = driver.findElement(By.id("nav-search-submit-button"));
		clicksearchicon.click();
		
		
		
		
	}

}
