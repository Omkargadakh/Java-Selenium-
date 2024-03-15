package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;

public class WorkingWithMoveToElement {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist");
		WebElement menLink = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));	
		Actions act = new Actions(driver);
		act.moveToElement(menLink).perform();
	}

}
