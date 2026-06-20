package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor ts = (JavascriptExecutor)driver ;
		
		WebElement box = driver.findElement(By.id("small-searchterms")) ;
		
		ts.executeScript("arguments[0].value='Laptop'", box) ;
		
		
		
//		ts.executeScript("window.scrollBy(300,900)") ;
//		
//		Thread.sleep(4000) ;
//		
//		ts.executeScript("window.scrollBy(-300,-500)") ;
		
	}
}
