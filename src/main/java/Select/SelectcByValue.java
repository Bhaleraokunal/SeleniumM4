package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectcByValue {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement country = driver.findElement(By.name("country") ) ;
		List<WebElement> ct = driver.findElements(By.xpath("//select[@name='country']/option")) ;
		Select sel = new Select(country) ;
		
		for (WebElement webElement : ct) {
			sel.selectByValue(webElement.getAttribute("value")) ;
		
		}
		
	}
}
