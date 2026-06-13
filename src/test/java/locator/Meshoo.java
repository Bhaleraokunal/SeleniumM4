package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meshoo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://www.meesho.com");
		
		driver.findElement(By.xpath("//p[text()='Chiffon Sarees']")).click();
	}
}
