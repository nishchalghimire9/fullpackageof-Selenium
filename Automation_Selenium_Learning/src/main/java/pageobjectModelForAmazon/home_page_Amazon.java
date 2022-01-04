package pageobjectModelForAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page_Amazon {
		public WebDriver driver;
	@FindBy (id = "nav-link-accountList-nav-line-1") WebElement clicksignInbutton;
		public home_page_Amazon(WebDriver driver) { 			// while creating page factory constructor for name of constructructor and class name must be same.
			this.driver = driver;
		PageFactory.initElements( driver, this);	
		
		}
	
	public void signinButton(){            // calling the webelement 
		clicksignInbutton.click();
		
		
	}
	
}
