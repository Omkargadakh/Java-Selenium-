package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthentiationPopup {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Robot r = new Robot();
		//to Enter username
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		//to press tab and Enter password
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		//to press enter
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
