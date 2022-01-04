package Automation_Learning;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsultePath_relativepath {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishchal\\eclipse-workspace\\Automation_PNT_Learning\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		WebElement userfield = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")); // absulute xapath starts from root /
		userfield.sendKeys("nischalghimire");
		WebElement passwd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));// relative xpath starts -> //tagname[@attribtename = 'vaue'
		passwd.sendKeys("ghimire");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));// relative xpath  also if we use text //*[contains(text(), 'Forgot password?')]
		login.click();
		
		
		 
	}

}
