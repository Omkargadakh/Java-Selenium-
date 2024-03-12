package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airvistara {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/");
		
		driver.findElement(By.id("acceptAllBtn")).click();
		
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
	
		driver.findElement(By.xpath("//span[text()='PNQ']")).click();
		
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DEL");

		driver.findElement(By.xpath("//span[text()='DEL']")).click();
		
		driver.findElement(By.id("calender_icon")).click();
		
		driver.findElement(By.xpath("//a[text()='2']")).click();

		driver.findElement(By.xpath("//a[text()='10']")).click();
	
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();

		
	}
}
