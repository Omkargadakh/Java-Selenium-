package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillAllDisableComponents {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='omkar';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='omkargadakh@gmail.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='12345';");
	}

}
