package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement button = driver.findElement(By.id("rightBtn")) ;
		
		Actions act = new Actions(driver) ;
		
		act.contextClick(button).perform();
		
		Thread.sleep(2000) ;
		
		driver.quit();
	}
}
