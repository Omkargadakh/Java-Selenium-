package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//to find/locate username textbox and pass the inputs
		WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		usnTB.sendKeys("sunnygadakh007");
		Thread.sleep(2000);
		
		//To find/locate Password textbox and pass the inputs
		WebElement passTB = driver.findElement(By.cssSelector("input[aria-label='Password']"));
		passTB.sendKeys("Omkar542");
		Thread.sleep(2000);
		
		// To click on login Button
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();
		
		
		
	}

}
