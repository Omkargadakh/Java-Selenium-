package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("omkargadakh@gmai.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar64164");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
