package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/cart");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("omkargadakh63@gmail.com");
		driver.findElement(By.className("password")).sendKeys("omkar777@");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[@href='/computing-and-internet']/ancestor::div[@class='product-grid']/descendant::input[@value='Add to cart']")).click();
	
		WebElement content = driver.findElement(By.className("content"));
	    String text = content.getText();   
	    System.out.println(text);
	    Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		WebElement country = driver.findElement(By.id("CountryId"));
		country.sendKeys("India");
		driver.findElement(By.name("estimateshipping")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		WebElement address = driver.findElement(By.id("billing-address-select"));
		Select s = new Select(address);
		s.selectByVisibleText("Omkar Gadakh, Siddhivinayk colony, KOPARGAON 423601, India");
	
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.findElement(By.id("PickUpInStore")).click();
		
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();

		driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']"));
		
		driver.findElement(By.xpath("//div[@id='checkout-step-payment-method']/descendant::input[@value='Continue']")).click();
		
		driver.findElement(By.xpath("//div[@class='step a-item']/descendant::input[@class='button-1 payment-info-next-step-button']")).click();
		
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		
		driver.findElement(By.xpath("//div[@class='section order-completed']/descendant::a")).click();
		driver.findElement(By.linkText("PDF Invoice")).click();
	//	driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
		
	}

}
