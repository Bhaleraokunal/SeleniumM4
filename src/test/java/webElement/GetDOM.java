package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOM {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.id("small-searchterms")) ;
		
		System.out.println("------------Before Sending the Values-------------");
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		
		
		System.out.println("-------------After Sending the Value----------------");
		
		System.out.println(search.getDomAttribute("value"));
		search.sendKeys("Computer") ;
		System.out.println(search.getDomProperty("value"));
		
		driver.close() ;
	}
}
