package For_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_vs_FindElements {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com");
		
		// findElement() --> Returns Single WebElement
		WebElement searchBox =  driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("Ashwini Mohanty");
        
        WebElement footerElement = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(footerElement.getText());
        
        // findElements() --> Returns List of WebElement
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	    System.out.println("Number of Elements Captured : "+allLinks.size());
	    
	    // Print all elements
	    for(WebElement element:allLinks)
	    {
	    	System.out.println(element.getText());
	    }
	}
	

}
