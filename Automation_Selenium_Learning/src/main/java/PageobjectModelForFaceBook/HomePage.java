package PageobjectModelForFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public WebDriver driver;
	@FindBy (name = "email") WebElement emailinput;
	@FindBy (id = "pass") WebElement passwdinput;
	@FindBy (name = "login") WebElement login;
	
	public  HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmail (String nishcal) {
		emailinput.sendKeys(nishcal);
	}

	public void enterpasswd (String ghimire) {
		passwdinput.sendKeys(ghimire);
	
}
	public void clicklogin () {
		login.click();
}
}