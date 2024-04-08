package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopupActitime {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-55dik7u/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("one Bank");
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select sc = new Select(Dropdown);
		sc.selectByVisibleText("one Bank");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("web Application");
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='All']")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.xpath("//input[@id='deleteButton']")).click();
	}

}
