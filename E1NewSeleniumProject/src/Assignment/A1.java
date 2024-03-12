package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
			
        driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("laptop",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class=\"_2gmUFU _3V8rao\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"_24_Dny\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"_2gmUFU _3V8rao\"]")).click();
	
		driver.findElement(By.xpath("//div[@class=\"_24_Dny\"]")).click();


	}

}
