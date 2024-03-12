package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//to Launch the Chrome Browser
		
		Thread.sleep(5000); // To Stop the Execution for 5 Sec.
		
     	driver.close(); // TO close the Browser window
		
		
	}

}
