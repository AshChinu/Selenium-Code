package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Navigate to a webpage with a file upload input
		driver.get("https://example.com");
		// Find the file upload input element
		WebElement fileInput = driver.findElement(By.id("file-input-id"));
		// Provide the file path to upload
		String filePath = "path/to/file.txt";
		fileInput.sendKeys(filePath);
		// Perform further actions after file upload
		// ...
		// Close the browser
		driver.quit();

	}

}
