package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	
        driver.findElement(By.xpath("//span[@class='_1Oyg-']")).click();
      
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
        driver.findElement(By.xpath("//span[text()='BOM']")).click();
        
        driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
    
        driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
       
        driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
       
   /*     WebElement ticketPrice = driver.findElement(By.xpath("//button[text()='Book Flight']/ancestor::div[@class='_3VUCr']/descendant::div[@class='_2MkSl'][1]"));
        String price = ticketPrice.getText();
        System.out.println(price);
        driver.quit();*/
        List<WebElement> filghtDetails = driver.findElements(By.className("_1O_uQ"));
        for (int i=0;i< filghtDetails.size();i++) {
			System.out.println(filghtDetails.get(i).getText());
			System.out.println("=============================");
		}
       
	}  
}