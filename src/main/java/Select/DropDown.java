package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		 driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		 
		List<WebElement> country = driver.findElements(By.xpath("//select[@name='country']/option")) ;
		
		for (WebElement webElement : country) {
			webElement.click();
		}
		
		for (WebElement webElement : country) {
			
			if (webElement.getText().equals("India")) {
				webElement.click() ;
			}
		}
	}
}
