package Automation_Learning;
// drag and drop in iframe windows. iframe means windows inside windows.
// we need switch to frame command.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class DragandDropo {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.switchTo().frame(0);// iframe index is finding by counting begining from html.
		WebElement dragged = driver.findElement(By.id("draggable"));  // from where we drag
		WebElement dropable = driver.findElement(By.id("droppable"));// to drop
		Actions obj = new Actions(driver);
		obj.dragAndDrop(dragged, dropable).build().perform();
		Thread.sleep(2000);
		// to come out from iframe
		driver.switchTo().parentFrame();
		WebElement ressize = driver.findElement(By.linkText("Resizable"));
		ressize.click();
	}

}
