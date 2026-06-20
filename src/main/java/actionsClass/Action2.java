package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://demowebshop.tricentis.com/");
		
		
		Actions act = new Actions(driver) ;
		
		act.click(driver.findElement(By.linkText("Register"))).perform() ;
		
		Thread.sleep(2000) ;
		driver.quit();
	}
}
