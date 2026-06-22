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
		
		WebElement searchStore = driver.findElement(By.id("small-searchterms")) ;
		
		ts.executeScript("arguments[0].style='Computers';",searchStore ) ;
		
		//ts.executeScript("window.close();") ;
		
		
		Thread.sleep(2000) ;
		
		System.out.println(searchStore.getAttribute("role"));
		
	driver.quit() ;
		
		
//		Thread.sleep(4000) ;
//		driver.quit() ;
//		ts.executeScript("window.scrollBy(300,900)") ;
//		
//		Thread.sleep(4000) ;
//		
//		ts.executeScript("window.scrollBy(-300,-500)") ;
		
	}
}
