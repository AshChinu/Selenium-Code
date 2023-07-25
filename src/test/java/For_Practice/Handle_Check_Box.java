package For_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Check_Box {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		//1) Select Specific Check Box
		/* driver.findElement(By.xpath("//input[@id='monday']")).click(); */

		// 2) Select all the Check Boxes
		/*
		List<WebElement> allCheckBox =  driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	    System.out.println("Total no of Check Boxes is : "+allCheckBox.size());
	    //- Using for loop
	    for (int i=0; i<allCheckBox.size();i++)
	    {
	    	allCheckBox.get(i).click();
	    }
	    // Using for each loop
	    for(WebElement chkBox:allCheckBox)
	    {
	    	chkBox.click();
	    }   */

		
		// 3) Select Multiple Check Boxes By Choice (Monday & Sunday)
            /*
		List<WebElement> allCheckBox =  driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of Check Boxes is : "+allCheckBox.size());
		for(WebElement chkBox:allCheckBox)
		{
			String chBoxName = chkBox.getAttribute("id");
			if(chBoxName.equals("monday") || chBoxName.equals("sunday"))
			{
				chkBox.click();
			}
		} */
		
		
		// 4) Select last 2 Check Boxes
		/*
		List<WebElement> allCheckBox =  driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of Check Boxes is : "+allCheckBox.size());
		
		int totalChkBox = allCheckBox.size();
		for (int i=totalChkBox-2;i<totalChkBox;i++ )
		{
			allCheckBox.get(i).click();
		} */
		
		
		
		// 5) Select First 2 Check Boxes
		
		List<WebElement> allCheckBox =  driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of Check Boxes is : "+allCheckBox.size());
		int totalChkBox = allCheckBox.size();
		for(int i=0;i<totalChkBox;i++)
		{
			if(i<2)
			{
				allCheckBox.get(i).click();
			}
		}		
	}

}
