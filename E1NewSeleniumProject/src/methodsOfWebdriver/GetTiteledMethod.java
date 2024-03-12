package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiteledMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.equalsIgnoreCase("Facebook – log in or sign up"))
		{
			System.out.println("matched the Title");
		}
		else {
			System.out.println("unmatched the Title");
		}
	}

}
