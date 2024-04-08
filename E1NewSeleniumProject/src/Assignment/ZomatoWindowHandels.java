package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoWindowHandels {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.Zomato.com/");
		driver.findElement(
				By.xpath("//div[@class='sc-elhb8j-15 RAjVl']/descendant::a[@class='sc-elhb8j-17 iDzUMo'][2]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='sc-elhb8j-15 RAjVl']/descendant::a[@class='sc-elhb8j-17 iDzUMo'][3]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='sc-elhb8j-15 RAjVl']/descendant::a[@class='sc-elhb8j-17 iDzUMo'][4]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='sc-elhb8j-15 RAjVl']/descendant::a[@class='sc-elhb8j-17 iDzUMo'][1]")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String id : allWindowId) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("zomato (@zomato) / X") || driver.getTitle().contains("Zomato - YouTube")
					|| driver.getTitle().contains("Zomato (@zomato) • Instagram photos and videos")
					|| driver.getTitle().contains("Zomato | Facebook")) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
	}
}
