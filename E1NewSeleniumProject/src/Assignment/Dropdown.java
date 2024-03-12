package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.id("phone")).sendKeys("3536663337");
		WebElement gender = driver.findElement(By.id("select2"));
		Select s=new Select(gender);
		s.selectByValue("male");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("select3"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("select5"));
		state.sendKeys("Maharashtra");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.id("optionCity"));
    	city.sendKeys("Pune");
		Thread.sleep(2000);
		WebElement quantity = driver.findElement(By.id("select7"));
		Select s5=new Select(quantity);
		s5.selectByIndex(2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
     }
}
