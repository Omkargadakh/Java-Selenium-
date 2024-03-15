package KeyBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeysTaBMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-55dik7u/login.do");
		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager",Keys.TAB);
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).sendKeys(Keys.ENTER);
		
		
	}

}
