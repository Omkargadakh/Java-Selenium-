package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//div[@class='gb_k gb_w gb_J']")).click();
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.name("app"));
	    driver.switchTo().frame(frame1);
	 //   driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		driver.switchTo().defaultContent();
		
	}

}
