package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class ZomatoScrollOperation {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.zomato.com/pune");
	     WebElement privacy = driver.findElement(By.xpath("//p[text()='Privacy']"));
	     //by using firstWay
	//	 Rectangle cordinates = privacy.getRect();
	//	int x = cordinates.x;
	//	int y = cordinates.y;
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy("+x+","+y+");");
		//By using 2 nd way for scrolling
		js.executeScript("arguments[0].scrollIntoView(true)",privacy);
	}

}
