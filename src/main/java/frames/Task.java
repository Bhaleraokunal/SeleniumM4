package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		 driver.get("https://demo.automationtesting.in/Frames.html");
		 
		//  driver.switchTo().frame(0);
		 
		 
		// 	driver.switchTo().frame("SingleFrame");
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']"))) ;
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Selenium") ;
		 
		 Thread.sleep(3000) ;
		 
		 driver.quit();
	}
}
