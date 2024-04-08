package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
        Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Acer Aspire 3 Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) A315-59-36HE Thin and L...']")).click();
		Thread.sleep(2000);
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
	//	System.out.println(allWindowId);
		
		for(String id : allWindowId)
		{
			driver.switchTo().window(id);
			
			if (driver.getTitle().contains("Acer Aspire 3 Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) A315-59-36HE Thin and Light Laptop Rs.44100"))
			{
				break;
			}
	    }
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}
	}
