package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_SSL_Certificate_Errors {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		// Create ChromeOptions instance
		 ChromeOptions options = new ChromeOptions();
		// Accept SSL certificates
		 options.setAcceptInsecureCerts(true);
		// Launch Chrome browser with options
		 WebDriver driver = new ChromeDriver(options);
		// Perform actions after accepting SSL certificates

		// ...
		// Close the browser
		 driver.quit();
	}

}
