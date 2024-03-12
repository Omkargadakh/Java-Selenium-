package SearchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		
		List<WebElement> ipadName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> ipadPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i =0;i<ipadName.size();i++) {
			
			System.out.println(ipadName.get(i).getText()+"__________"+ipadPrice.get(i).getText());
			System.out.println("==================================================================");
		}
		
	}

}
