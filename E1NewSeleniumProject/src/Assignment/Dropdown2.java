package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));

		driver.get("file:///C:/Users/Sunny/OneDrive/Documents/signup.html");

		WebElement multiSelectDropdown = driver.findElement(By.id("dropdown"));

		Select s = new Select(multiSelectDropdown);

		Thread.sleep(2000);

		for (int i = 0; 0 <= 4; i++) {
			System.out.println(s);
		}

	}

}
