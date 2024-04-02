package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class DemoBlaze {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("omkargadakh14@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("omkar333@");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		driver.findElement(By.xpath("//a[text()='Home ']")).click();
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt1.accept();
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		
		WebElement TotalPrice = driver.findElement(By.xpath("//h3[@id='totalp']"));
		Thread.sleep(3000);
		String ActualPrice = TotalPrice.getText();
		System.out.println(ActualPrice);
		String ExpectedPrice="1180";
		
		Thread.sleep(2000);
		if(ActualPrice.equalsIgnoreCase(ExpectedPrice))
		{
			System.out.println("correct price");
		}
		else {
			System.out.println("wrong prce");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("omkar");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("pune");
		driver.findElement(By.id("card")).sendKeys("123445");
		driver.findElement(By.id("month")).sendKeys("April");
		driver.findElement(By.id("year")).sendKeys("2024");
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
  }
}