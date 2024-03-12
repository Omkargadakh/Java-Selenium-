package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// to launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize();// to maximize the browser window
		Thread.sleep(1000);
		
		Dimension targetSize = new Dimension(600, 300);// to pass width and height to dimention class
		Thread.sleep(1000);                            //pixcels
		driver.manage().window().setSize(targetSize);// to pass the dimention to setsize method
		

	}
}
