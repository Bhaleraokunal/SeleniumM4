package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaRole {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register")) ;
		
		
		System.out.println(register.getAriaRole()); // link
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Search']"))
				.getAriaRole()); //button
		
		System.out.println(driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"))
				.getAriaRole());
		
		
		
		
		driver.quit();
	}
}
