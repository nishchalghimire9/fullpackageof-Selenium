package Automation_withTestNG;

import org.testng.annotations.Test;

import CommonClass.CommonMethod;
import PageobjectModelForFaceBook.HomePage;

import org.testng.annotations.DataProvider;

public class Dataprovider extends CommonMethod {
  @Test(dataProvider = "provider")
  public void f(String n, String s) {
	  HomePage home= new HomePage(driver);
	  home.enterEmail(n);
	  home.enterpasswd(s);
	  home.clicklogin();
	  
  }

  
 
  // this mehod will execute 2 time because we have given two set of data sets.
  @DataProvider
  public Object[][] provider() {
    return new Object[][] {
      new Object[] { "nishchal", "nishcla" },       // if we need more value we just put comma and value .
      new Object[] { "sham", "bgte" },
     
    };
  }
}
