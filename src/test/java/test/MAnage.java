package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MAnage {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver() ;
//		driver.manage().window().maximize();
//		
//		Dimension size = driver.manage().window().getSize() ;
//		
//		System.out.println(size);
//		
//		driver.manage().window().setSize(size);
//		
//		
//		Point point = driver.manage().window().getPosition() ;
//		
//		System.out.println(point);
//		
//		driver.manage().window().setPosition(point);
		
		
		
		Dimension set = new Dimension(650, 20) ;
		
		driver.manage().window().setSize(set);
		
		Point pt = new Point(60, 90) ;
	}
}
