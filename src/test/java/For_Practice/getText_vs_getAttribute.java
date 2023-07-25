package For_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText_vs_getAttribute {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement emailInput = driver.findElement(By.xpath("//input[@id='Email']"));
		//emailInput.clear();
		//emailInput.sendKeys("demo@gmail.com");
		
		// Capturing Text from Input Box by getAttribute
		System.out.println(emailInput.getAttribute("value"));
		
		// Capturing Text by getAttribute & getText
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Using getText method : "+login.getText());
		System.out.println("Using getAttribute method : "+login.getAttribute("class"));
		

	}

}
