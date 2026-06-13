package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register")) ;
		
		
		System.out.println(register.getRect());
		System.out.println(register.getRect().getX());
		System.out.println(register.getRect().getY());
		System.out.println(register.getRect().getWidth());
		System.out.println(register.getRect().getHeight());
		System.out.println(register.getRect().getPoint());
		System.out.println(register.getRect().getDimension());

		
		driver.quit();
	}
}
