package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class IsMultiple {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://omayo.blogspot.com/");
		
		WebElement month = driver.findElement(By.className("dropdown") ) ;
		try {
		Select sel = new Select(month) ;
		
		sel.selectByIndex(0) ;
		
		driver.quit();
		}
		catch (UnexpectedTagNameException e) {
			
		}
	}
}
