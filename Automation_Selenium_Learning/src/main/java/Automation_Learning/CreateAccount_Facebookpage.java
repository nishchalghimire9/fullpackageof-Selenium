
		
package Automation_Learning;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class CreateAccount_Facebookpage {
		static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
				
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
				
		WebElement createAccount = driver.findElement(By.xpath("//*[contains(text(), 'Create new account')]"));
		createAccount.click();	
		Thread.sleep(2000);
		WebElement enterfirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		enterfirstname.sendKeys("nishchal");
		Thread.sleep(2000);
		
		WebElement enterlasttname = driver.findElement(By.xpath("//input[@name='lastname']"));
			enterlasttname.sendKeys("ghimire");
		Thread.sleep(2000);
		WebElement MothofBirth = driver.findElement(By.name("birthday_month"));
		
			Select obj = new Select(MothofBirth);
			obj.selectByValue("2");
			Thread.sleep(2000);
		WebElement birthday = driver.findElement(By.name("birthday_day"));
			Select ob = new Select(birthday);
			ob.selectByIndex(3);
			Thread.sleep(2000);
		WebElement maletoggle = driver.findElement(By.xpath("(//*[@name='sex'][1])"));	
		
			
		maletoggle.click();	
					Thread.sleep(4000);
				driver.close();
				
			

		

		
			}
	}


