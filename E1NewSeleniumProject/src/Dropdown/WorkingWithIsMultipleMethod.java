package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithIsMultipleMethod {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
		driver.findElement(By.linkText("Multi Select")).click();
		
		WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(multiSelectDropdown);
		System.out.println(s.isMultiple());
		
	}

}
