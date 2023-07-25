package For_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_isEnabled_isSelected_isDisplayed {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchElement = driver.findElement(By.xpath("//input[@type='text']"));

		// isEnabled() &  isDisplayed()
		System.out.println("Enabled Status is : "+searchElement.isEnabled());
		System.out.println("Displayed Status is : "+searchElement.isDisplayed());

		// isSelected()
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleButton = driver.findElement(By.xpath("//input[@id='gender-female']"));

		maleButton.click();
		//femaleButton.click();
		Thread.sleep(1500);
		System.out.println("Selected Status is : "+maleButton.isSelected());
		System.out.println("Selected Status is : "+femaleButton.isSelected());


		driver.quit();
	}

}
