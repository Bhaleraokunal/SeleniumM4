package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviget {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to(new URL("https://www.instagram.com")) ;
		
		
		driver.switchTo() ;
	}
}
