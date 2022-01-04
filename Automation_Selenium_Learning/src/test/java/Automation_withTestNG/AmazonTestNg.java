package Automation_withTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonClass.CommonMethod;
import pageobjectModelForAmazon.home_page_Amazon;
import pageobjectModelForAmazon.signinPage;
import java.io.IOException;





public class AmazonTestNg extends CommonMethod{  // making test method dependent in an another method.
	
  @Test(priority =2, dependsOnMethods = "VerificationofText" )  /* this is just for executing as priority and this method is depend on VerificationofText method if that pass it will
  																		execute other wise not .*/
  public void f() throws IOException, InterruptedException {
	  home_page_Amazon obj = new home_page_Amazon(driver);
	  obj.signinButton();
	  Thread.sleep(2000);
	  shots();
	  signinPage ob = new signinPage(driver);
	  ob.enteremail();
	  ob.clickContinueButton();  
  }
  
  
  @Test (priority =1 )
  public void VerificationofText() throws IOException, InterruptedException {
	  home_page_Amazon obj = new home_page_Amazon(driver);
	  obj.signinButton();
	  signinPage ob = new signinPage(driver);
	  ob.enteremail();
	  ob.clickContinueButton(); 
	  shots();
	  String errrorob = ob.text();
	  System.out.println(errrorob);
	  SoftAssert soft = new SoftAssert();
	  Thread.sleep(2000);
	  
	 //Assert.assertEquals(errrorob, "We cannot find an account with that email address.");// comparing between two text actual text and expected test.
	  // if apply Hard asset. in any point test execution will stop so we must use soft assertion.
	  soft.assertEquals(errrorob, "We cannot find an account with that email address"); // also in soft assert we need to create variable.
	  
	  soft.assertAll(); // it is use to differentiate between pass and fail.
  }
  
}

