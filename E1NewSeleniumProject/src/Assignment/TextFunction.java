package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-55dik7u/login.do");
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	//	driver.findElement(By.xpath("//a[.='Login']")).click();

	}
}
