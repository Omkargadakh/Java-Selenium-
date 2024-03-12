package methodsOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.get("https://www.google.com.mx/");

		Thread.sleep(3000);
		
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	}

}
