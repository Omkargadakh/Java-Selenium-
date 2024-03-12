package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.linkText("Multi Select")).click();
		
		WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(multiSelectDropdown);
		for(int i=0;i<5;i++)
		{
		    s.selectByIndex(i);
			Thread.sleep(200);
		}
		WebElement firstSelectedOpt = s.getFirstSelectedOption();
		System.out.println(firstSelectedOpt.getText());

	}

}
