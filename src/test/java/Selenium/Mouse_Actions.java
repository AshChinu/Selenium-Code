package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Actions {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Move Mouse pointer over specified element and also perform right click action
		driver.get("http://amazon.in");
		Actions clk = new Actions(driver);
		clk.moveToElement(driver.findElement(By.id("nav-link-amazonprime")));
		clk.contextClick();
		clk.build().perform();
		
		// Double click on element.
		driver.get("URL of target website or webpage");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("XPath of the element")); 
		act.doubleClick(ele).perform();
	}

}
