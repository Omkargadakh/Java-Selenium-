package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("omkar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("omkargadakh14@gmail.com");
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		Select sc = new Select(dropdown);
		sc.selectByVisibleText("Laptop");
		driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("thank You");
        driver.findElement(By.xpath("//button[text()='Cancel']")).click();
	}
}
