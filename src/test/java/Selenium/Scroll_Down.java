package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Down {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://amazon.com");
		
		// Script to Scroll a Page for specified no. of pixels.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)");
		
		//Script to scroll page upto specified element. 
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js1.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("Careers")));
		driver.findElement(By.linkText("Amazon Devices")).click();
		

	}

}
