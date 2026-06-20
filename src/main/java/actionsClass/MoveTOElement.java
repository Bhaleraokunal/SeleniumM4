package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTOElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.myntra.com/");
		
		WebElement button = driver.findElement(By.xpath("//div[@class='desktop-navLinks']/div")) ;
		
		Actions act = new Actions(driver) ;
//		
//		for (WebElement webElement : button) {
//			
//			Thread.sleep(500) ;
//			
//			act.moveToElement(webElement).perform();
//		}
		
		act.moveToElement(button).perform();
		
		Thread.sleep(2000) ;
		
		driver.quit();
	}
}
