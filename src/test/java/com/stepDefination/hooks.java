package com.stepDefination;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import core.testUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class hooks extends testUtility {

	 @Before
	 public void initiateBrowser() throws InterruptedException {
		 testUtility T = new testUtility();
		 T.initiateBrowser();
		Thread.sleep(3000);}
		 

	 @After
	 public void CloseBrowser(Scenario scenario) throws IOException {
	 	String filePath = null;
	 	
	 		System.out.println("nsvigsted to dscejjksdn");
	 		/*
	 		 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 		 * String fileName =
	 		 * System.getProperty("user.dir")+"\\target\\Screenshot\\test.png"; File
	 		 * CurrentDir = new File(fileName); System.out.println("CurrentDir"+CurrentDir);
	 		 * FileUtils.copyFile(file,CurrentDir);
	 		 */
	 		byte[] x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 		
	 		scenario.attach(x, "image/png", scenario.getName());
	 		
	 		//scenario.attach(data, "image/png", "My screenshot");
	 		 
	 	
	 	//Reporter.addScreenCaptureFromPath(fileName);
	 	
	 	
	 }	
}


