package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartActionsMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions act =new Actions(driver);
		act.moveToElement(fashion).perform();
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		WebElement productName = driver.findElement(By.xpath("//div[@data-id='SHOGZH39SU6GWPHW']/descendant::a[@class='IRpwTa']"));
		WebElement productPrice = driver.findElement(By.xpath("//div[@data-id='SHOGZH39SU6GWPHW']/descendant::div[@class='_30jeq3']"));
		System.out.println(productName.getText());
		System.out.println(productPrice.getText());
		driver.findElement(By.xpath("//a[@href='https://www.flipkartcareers.com/?otracker=undefined_footer_navlinks']")).click();
		WebElement jobs = driver.findElement(By.xpath("//div[@id='navbar']/descendant::b[@class='caret'][1]"));
		Actions act1 =new Actions(driver);
		act1.moveToElement(jobs).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu custom-menu custom-menu-1']/descendant::a[@href='#!/joblist']")).click();
		driver.findElement(By.id("candidate-login-before")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("omkargadakh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		//Captcha is not Working
	//	driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']/ancestor::div[@id='rc-anchor-container']/descendant::div[@class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.xpath("//button[@id='loginbtn']")).click();
	}

}
