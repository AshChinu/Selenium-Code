package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Checkbox_RadioButtons {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Go to a website where Radio Button & Checkboxes available
		driver.get("https://example.com");
		
		// Find a checkbox element
		 WebElement checkbox = driver.findElement(By.id("checkbox-id"));
		// Check the checkbox if it is not selected
		 if (!checkbox.isSelected()) {
		 checkbox.click();
		 }
		// Find a radio button element
		 WebElement radioButton = driver.findElement(By.id("radio-button-id"));
		// Select the radio button if it is not selected
		 if (!radioButton.isSelected()) {
		 radioButton.click();
		 }
		// Perform further actions after checkbox and radio button handling

		// ...
		// Close the browser
		 driver.quit();


	}

}
