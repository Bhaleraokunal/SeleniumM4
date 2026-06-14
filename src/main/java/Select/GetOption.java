package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement month = driver.findElement(By.name("country") ) ;
		
		Select sel = new Select(month) ;
		
		List<WebElement> allOptions = sel.getOptions() ;
		
		System.out.println(allOptions.size());
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}
}
