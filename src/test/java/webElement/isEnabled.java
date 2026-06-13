package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register")) ;
		
		
		System.out.println(register.isEnabled()); // link
		
		
		driver.navigate().to("https://omayo.blogspot.com/") ;
		
		WebElement button = driver.findElement(By.id("but1")) ;
		
		System.out.println(button.isEnabled());
		
		driver.quit();
	}
}
