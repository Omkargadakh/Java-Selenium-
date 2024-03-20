package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/");
		
		//we are using Explicite Type Casting for Take ScreenShot
		TakesScreenshot tS=(TakesScreenshot)driver;
		File src = tS.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image.png");
		Files.copy(src, dest);	
		
	}

}
