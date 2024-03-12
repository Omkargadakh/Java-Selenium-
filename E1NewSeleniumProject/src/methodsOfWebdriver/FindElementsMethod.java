package methodsOfWebdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		Thread.sleep(2000);

		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("bikes");
		Thread.sleep(2000);
         
		List<WebElement> bikesOpetions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
	     for (WebElement we:bikesOpetions) {
	    	String ops = we.getText();
	    	System.out.println(ops);
			
			
		}
	}

}
