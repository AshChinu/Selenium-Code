package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_ScreenShot {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://amazon.com");
          
        // Code To Capture ScreenShot.
		
        TakesScreenshot ts = (TakesScreenshot)driver;
     	File scShot = ts.getScreenshotAs(OutputType.FILE);
     		
     	// code to copy file from java memory to the specified location.
     		
     	File destFile = new File("C:\\Users\\DELL\\Desktop\\Screen Shots\\defect1.jpg");
     	FileUtils.copyFile(scShot, destFile);

	}

}
