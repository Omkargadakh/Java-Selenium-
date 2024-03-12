package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra2 {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jeans",Keys.ENTER);
		
	//	driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']")).click();
	
		driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']")).click();
	    
		driver.findElement(By.xpath("//label[text()='Black']")).click();
		
		driver.findElement(By.xpath("//label[text()='Rs. 16121 to Rs. 24062']")).click();
	}

}
