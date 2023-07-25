package For_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// First Open Facebook
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		// Then Open Amazon
		driver.get("https://www.amazon.com");
		Thread.sleep(1000);
		
		// Then Navigate Back to Facebook
		driver.navigate().back();
		Thread.sleep(1000);
		
		// Then Navigate Forward to Amazon
		driver.navigate().forward();
		
		// Then Refresh
		driver.navigate().refresh();
		
		driver.quit();
		

	}

}
