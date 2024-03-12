package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
	}

}
