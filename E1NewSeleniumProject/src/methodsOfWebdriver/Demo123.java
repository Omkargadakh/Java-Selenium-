package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo123 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com.mx/");
		
		driver.switchTo().activeElement().sendKeys("flipkart",Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Flipkart")).click();
		
		driver.switchTo().activeElement().sendKeys("Electronic",Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Mobiles")).click();
	}

}
