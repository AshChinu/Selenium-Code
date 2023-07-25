package For_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Broken_Links {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigate to the webpage containing links
		driver.get("https:www.google.com"); 

		// Collect all the links on the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Iterate through each link and check if it's broken
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url != null && !url.isEmpty()) {
				try {
					// Create a URL object to represent the link
					URL linkUrl = new URL(url);

					// Open a connection to the link
					HttpURLConnection httpConn = (HttpURLConnection) linkUrl.openConnection();
					httpConn.setRequestMethod("HEAD");
					httpConn.connect();

					// Get the HTTP response code
					int responseCode = httpConn.getResponseCode();

					// Check if the link is broken (response code other than 200)
					if (responseCode != 200) {
						System.out.println("Broken link: " + url + " (Response code: " + responseCode + ")");
					}

					// Close the connection
					httpConn.disconnect();
				} catch (IOException e) {
					System.out.println("Error checking link: " + url);
					e.printStackTrace();
				}
			}
		}

		// Close the browser
		driver.quit();
	}
}

