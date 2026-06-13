package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement radioButton = driver.findElement(By.id("pollanswers-1")) ;
		
		System.out.println(radioButton.isSelected());  // false ;
		
		radioButton.click() ;
		
		System.out.println(driver.findElement(By.id("pollanswers-2")).isSelected()); // FALSE ;
		
		driver.quit();
	}
}
