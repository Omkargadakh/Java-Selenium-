package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Swaglabs {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		WebElement productPrice = driver.findElement(By.xpath("//div[text()='29.99']"));
		String name = productName.getText();
		System.out.println(name);
		String expectedprice = productPrice.getText();
		String actualPrice = "$29.99";
		if (actualPrice.equalsIgnoreCase(expectedprice)) {
			System.out.println("price is right" + expectedprice);
		} else {
			System.out.println("price is Wrong");
		}

		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Omkar");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Gadakh");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("423601");
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		Thread.sleep(2000);
		WebElement thankYou = driver.findElement(By.xpath("//div[@id='page_wrapper']"));
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/thankyou.png");
		Files.copy(source, dest);

	}

}
