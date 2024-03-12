package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("omkargadakh14@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Omkarg");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
