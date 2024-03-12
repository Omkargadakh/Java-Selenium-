package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCom {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='What is your name?']")).sendKeys("Omkar Sanjay Gadakh");
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Tell us your Email ID']")).sendKeys("sgfkgf@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("909625524");
		
		driver.findElement(By.xpath("//div[@data-val='fresher']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Pune']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("currentCity")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.className("ico resman-icon resman-icon-check-box")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
