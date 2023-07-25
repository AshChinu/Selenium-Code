package For_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunch_Browser {

	public static void main(String[] args)
	{
		// For Chrome Browser Setup
		System.setProperty("webdriver.chrome.driver", "Location of Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	{
		// For Firefox Browser Setup
		System.setProperty("webdriver.gecko.driver", "Location of geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}
	
	{
		// For Edge Browser Setup
		System.setProperty("webdriver.edge.driver", "Location of edgedriver.exe");
		WebDriver driver = new EdgeDriver();
	}
	/*
		// Latest Version of Browser Setup.
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	
	*/
	
}
