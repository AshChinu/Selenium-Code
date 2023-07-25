package For_Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Multiple_Window {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// First open an website like Gmail then click Help which opens a new window.
        driver.get("http://gmail.com");
        driver.findElement(By.linkText("Help")).click();
        
        // Then store all window id's in a variable which return type is Set.
        Set<String> allwindows = driver.getWindowHandles();
        
        // Then Separate the Window ID's return type is Object
        Object[] windows = allwindows.toArray();
        String window1 = windows[0].toString();
        String window2 = windows[1].toString();
        
        // Then switch driver to required window
        driver.switchTo().window(window2);
        driver.findElement(By.linkText("Community")).click();
        
        Thread.sleep(3000);
        
        // Then if we want to switch to anathor window
        driver.switchTo().window(window1);
        driver.findElement(By.id("identifierId")).sendKeys("AshChinu");

	}

}
