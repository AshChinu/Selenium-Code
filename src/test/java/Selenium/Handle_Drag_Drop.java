package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Drag_Drop {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Navigate to a webpage
		 driver.get("https:example.com");
		// Find the source and target elements for drag and drop
		 WebElement sourceElement = driver.findElement(By.id("source-element"));
		 WebElement targetElement = driver.findElement(By.id("target-element"));
		// Perform drag and drop action
		 Actions actions = new Actions(driver);
		 actions.dragAndDrop(sourceElement, targetElement).build().perform();
		// Perform further actions after drag and drop

		// ...
		// Close the browser
		 driver.quit();


	}

}
