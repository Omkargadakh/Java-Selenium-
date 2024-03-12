package SearchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='SearchBar__Button-sc-16lps2d-4 fgHDQx']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar",Keys.ENTER);
	    Thread.sleep(2000);
	    //(1 Of 20)
	    driver.findElement(By.xpath("//div[text()='ADD' or @class='AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc'][1]")).click();
	    Thread.sleep(2000);
	    
	    for(int i=1; i<3; i++)
	    {
	    driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
	    Thread.sleep(2000);
	    }
	    driver.findElement(By.xpath("//div[@class='CartButton__CartIcon-sc-1fuy2nj-6 iyUoPU']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	
	}

}
