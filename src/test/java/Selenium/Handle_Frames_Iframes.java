package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Frames_Iframes {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open a Web Browser where we can perform iframe operation.
		driver.get("https://example.com");
		// Switch to a frame by index
		driver.switchTo().frame(0);
		// Switch to a frame by name or ID
		driver.switchTo().frame("frame-name");
		// Switch to a frame by WebElement
		WebElement frameElement = driver.findElement(By.id("frame-id"));
		driver.switchTo().frame(frameElement);
		// Switch back to the default content
		driver.switchTo().defaultContent();
		// Perform further actions within the frame
		// ...
		// Close the browser
		driver.quit();
	}

}
