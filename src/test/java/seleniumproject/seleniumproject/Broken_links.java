package seleniumproject.seleniumproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + links.size());

		int noofBrokenlinks = 0;
		for (WebElement linkelement : links) {
			String hrefattvalue = linkelement.getAttribute("href");
			if (hrefattvalue == null || hrefattvalue.isEmpty()) {
				System.out.println("href attribute value is null or empty.so not possible to check");
				continue;
			}

			try {
				URL linkURL = new URL(hrefattvalue);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattvalue + "=====> Broken link");
					noofBrokenlinks++;

				} else {
					System.out.println(hrefattvalue + "======> Not a broken link");
				}
			}

			catch (Exception e) {
			}
			System.out.println("Number of broken links:" + noofBrokenlinks);

		}

	}
}
