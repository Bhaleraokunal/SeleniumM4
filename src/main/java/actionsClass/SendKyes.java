package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKyes {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchStore = driver.findElement(By.id("small-searchterms")) ;
		
		Actions act = new Actions(driver) ;

		act.keyDown(Keys.LEFT_SHIFT).sendKeys(searchStore,"Computer")
		.keyUp(Keys.LEFT_SHIFT).sendKeys(searchStore,"BOOKS").
		keyDown(Keys.ENTER).keyUp(Keys.ENTER)
		.build().perform();

		Thread.sleep(6000) ;
		
		driver.quit();
	}
}
