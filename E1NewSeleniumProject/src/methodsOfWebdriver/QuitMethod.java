package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver(); // To launch the Browser
	Thread.sleep(1000);
	driver.manage().window().maximize();// to Maximize the window
	Thread.sleep(1000);
	
	driver.get("https://omayo.blogspot.com/");// To launch the Web application
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Open a popup window")).click();// to open a new child window and for click operation
	Thread.sleep(2000); 
	//driver.close();   // to close the Parent window only
	
	driver.quit();// to close both the Browser window child and parrent window
 }
}