package JavaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 WebElement optional = driver.findElement(By.name("custom_gender"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value='male'",optional);
	}

}
