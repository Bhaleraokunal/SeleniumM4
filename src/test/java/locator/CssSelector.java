package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	 WebElement button = driver.findElement(By.cssSelector("[type='submit']")) ;
	 

		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 //System.out.println(driver.findElement(By.xpath("//h3[text()='Follow us']")).getText());
		
	//	driver.findElement(By.xpath("//input[contains(@class,'search')]")).sendKeys("Hello") ;
		
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		driver.findElement(By.id("small-searchterms")).clear(); 
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile"); 
		driver.findElement(By.id("small-searchterms")).submit();
		
//		button.click() ;
	
		
	}
}
