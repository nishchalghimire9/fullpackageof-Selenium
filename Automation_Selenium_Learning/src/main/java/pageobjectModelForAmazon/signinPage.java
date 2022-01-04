package pageobjectModelForAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinPage {
	public WebDriver driver;
	@FindBy (name = "email") WebElement mail;
	@FindBy (id = "continue" ) WebElement Continue;
	@FindBy (xpath = "//*[contains(text(), 'We cannot find an account with that email address')]") WebElement error; // we will take contains xpath if element contain test than any other element.
	
	public signinPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
		
	}
	
	public void enteremail() {
		mail.sendKeys("ghimirenishch@gmail.com");
		
	
	}
	
	public void clickContinueButton() {
		Continue.click();
		
	}
	
	
	public String text() {
		String errorof = error.getText();       // we need return method to get text from webpage and comparing in java class.
		return errorof;
		
	}


	 						
		
		
	
}

