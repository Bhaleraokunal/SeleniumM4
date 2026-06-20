package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement google = driver.findElement(By.linkText("Google+")) ;
		
		Actions act = new Actions(driver) ;

		
//		act.scrollToElement(google).perform() ;
		
		act.scrollByAmount(300, 500).perform() ;
		Thread.sleep(2000) ;
		
		driver.quit();
	}
}
