package Automation_withTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonClass.CommonMethod;
import PageobjectModelForFaceBook.HomePage;

public class FindingTotalElements extends CommonMethod {
	
  @Test
  public void findingElements() throws InterruptedException {
	  Thread.sleep(4000);
	List<WebElement> totalElements=  driver.findElements(By.tagName("a"));
	System.out.println(totalElements.size());
	 Thread.sleep(4000);
//	for (int i = 0; i>totalElements.size(); i++) {
//		System.out.println(totalElements.get(i).getText());	
//	}
	
	// this is another way to use for loop to get list webelements.
	for (WebElement Elements:totalElements) {
		System.out.println(Elements.getText());
	}
  }
  // below value is provided from properties file.
  @Test
  public void propertiseofmethod() throws IOException {
	  String local = System.getProperty("user.dir");
	  Properties pro = new Properties();
	  FileInputStream sd = new FileInputStream(local+ "\\target\\Regression.propertises");
	  pro.load(sd);// it will load the file from the properties file.
	  String email=  pro.getProperty("Email");
	  String passwd=  pro.getProperty("Password");
	  HomePage home= new HomePage(driver);
	  home.enterEmail(email);
	  home.enterpasswd(passwd);
	  home.clicklogin();
	  
  }
  // Y TO
 
  @Test
  
  public void ExcelSheet() throws IOException {
	  XSSFWorkbook ExcelWBook;
	  XSSFSheet ExcelWSheet;
	  XSSFCell Cell;
	  
	  // Locaton of excel file 
	  String path = "C:\\Users\\Nishchal\\Desktop\\Test.xlsx";
	  String sheetName = "Sheet1";
	  
	  try {
		FileInputStream ExcelFile = new FileInputStream(path);
		
			ExcelWBook = new XSSFWorkbook(ExcelFile);
	  ExcelWSheet =ExcelWBook.getSheet(sheetName);
	  Cell = ExcelWSheet.getRow(0).getCell(0);
		  
		  String Celldata = Cell.getStringCellValue();
		  System.out.print("CellData" + Celldata);
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 
  }
  
}
