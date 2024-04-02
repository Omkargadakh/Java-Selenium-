package Assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Bluestone1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement goldcoins = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(goldcoins).perform();
		
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
		WebElement title = driver.findElement(By.xpath("//h1[@class='page-title title-14']"));
		File Source = title.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/single1K.png");
		Files.copy(Source, dest);
		Thread.sleep(2000);
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source1 = tc.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshot/full1K.png");
		Files.copy(Source1, dest1);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("newsletter_subscriber"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",email);
		Thread.sleep(2000);
		email.sendKeys("omkargadakh@gmail.com");
			
	}
}
