package CommonClass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class CommonMethod {
	public WebDriver driver;
	@Parameters({"browser", "website"})  // this is creating parameter for browser and website. while passing parameter sequence  should be corect.
	
	@BeforeMethod
  public void browsers(String browser , String website) { // calling  parameter
	  String local = System.getProperty("user.dir");
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver",local +"\\src\\Drivers\\chromedriver.exe" ); 
		  driver = new ChromeDriver();  
		  driver.navigate().to(website);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", local + "\\src\\Drivers\\msedgedriver.exe" );
		  driver = new EdgeDriver();   
		  driver.navigate().to(website);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.navigate().refresh();
	  }
	  else {
		  System.out.println("Enter correct browser");  
	  }
  }
  

  @AfterMethod
  
  public void shots() throws IOException {  // taking screenshots  this method is mandatory.
		 
		Date dt = new Date();
		System.out.println(dt); 
		String it = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(it);
		String local = System.getProperty("user.dir");
		
		File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(stored, new File( local + "\\src\\ScreenShots\\" + it + "picture.jpg"));
			
	  
}  
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
	  
  }

}
