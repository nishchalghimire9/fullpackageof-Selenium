package Automation_withTestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonClass.CommonMethod;

public class listeners extends CommonMethod implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		this.driver = ((CommonMethod)result.getInstance()).driver;// this is mandatory line must be included 
		Date dt = new Date();
		System.out.println(dt); 
		String it = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(it);
		String local = System.getProperty("user.dir");
		
		File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File( local + "\\src\\ScreenShots\\Pass\\" + it + "picture.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((CommonMethod)result.getInstance()).driver;	// this is mandatory line must be included 
		Date dt = new Date();
		System.out.println(dt); 
		String it = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(it);
		String local = System.getProperty("user.dir");
		
		File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File( local + "\\src\\ScreenShots\\Failed\\" + it + "picture.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
