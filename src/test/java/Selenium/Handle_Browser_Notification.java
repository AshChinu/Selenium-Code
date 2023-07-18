package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Browser_Notification {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions(); 
		// Disable browser notifications
		options.addArguments("--disable-notifications");
		// Launch Chrome browser with options
		WebDriver driver = new ChromeDriver(options);
		// Perform actions after disabling notifications

		// ...
		// Close the browser
		driver.quit();


	}

}
