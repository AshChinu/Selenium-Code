package For_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drpCountry = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select drpCnt = new Select(drpCountry);
		
		/*
		drpCnt.selectByIndex(12);// By Index
		Thread.sleep(2000);
		drpCnt.selectByVisibleText("Maldives");// By Visible Text
		Thread.sleep(2000);
		drpCnt.selectByValue("IDN");// By Value
		*/
		
		// Selecting options from dropdown without using methods
		List<WebElement> allOptions = drpCnt.getOptions();
		for(WebElement element:allOptions)
		{
			if(element.getText().equals("India"))
			{
				element.click();
				break;
			}
		}
	}

}
