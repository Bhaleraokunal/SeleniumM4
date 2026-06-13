package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://demowebshop.tricentis.com/");
		
//		String url = driver.getCurrentUrl() ;
//		
//		System.out.println(url);
//		
//		System.out.println(driver.getPageSource());
//		
//		System.out.println(driver.getTitle());
//		
//		driver.quit();
		//
//		driver.findElement(By.linkText("Facebook")).click();
		
		Thread.sleep(2000) ;
		driver.quit() ;
	}
}
