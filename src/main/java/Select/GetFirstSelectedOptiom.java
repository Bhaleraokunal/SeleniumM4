package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptiom {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement month = driver.findElement(By.name("Month") ) ;
		
		Select sel = new Select(month) ;
		
		for (int i = 0; i <= 12; i++) {
			sel.selectByIndex(i);
			System.out.println(sel.getFirstSelectedOption().getText());
		}
		
		
	}
}
