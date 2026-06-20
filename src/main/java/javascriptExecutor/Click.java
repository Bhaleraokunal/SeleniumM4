package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor ts = (JavascriptExecutor)driver ;
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']")) ;
		
		ts.executeScript("arguments[0].click()", login) ;
		
		Thread.sleep(4000) ;
		driver.quit() ;
//		ts.executeScript("window.scrollBy(300,900)") ;
//		
//		Thread.sleep(4000) ;
//		
//		ts.executeScript("window.scrollBy(-300,-500)") ;
		
	}
}
