package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUsercreation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-55dik7u/login.do");
        driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");

		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();

		driver.findElement(By.xpath("//a[@class='content users']")).click();

		driver.findElement(By.xpath("//input[@value='Create New User']")).click();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manager33");

		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Omkar123");

		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Omkar123");

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("shyam");

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sundar");

		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}

}
