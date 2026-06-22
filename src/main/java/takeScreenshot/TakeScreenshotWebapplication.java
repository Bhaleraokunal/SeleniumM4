package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotWebapplication {

	public static void main(String[] args) throws Throwable {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the file name");
		String fileName = sc.next() ;
		Thread.sleep(2000) ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		
		
		//step 1: find the webElement
		 WebElement logo = driver.findElement(By.className("br-main-logo")) ;
		
		//Step 2: take screnshot
		 File temp = logo.getScreenshotAs(OutputType.FILE);
		 
		 //step 3 : create a permenet location:
		 File perm = new File("C:\\Users\\hp\\Desktop\\Selenium Screenshot\\"+fileName+".jpg") ;
		 
		 //Step 4 : copy
		 FileHandler.copy(temp, perm) ;
		 
		 
		 //close the browser
		 driver.quit();
		 
		 
		 
		 
//		//step 1: type casting
//			TakesScreenshot ts  =  (TakesScreenshot)driver ;
//			
//			//Step 2: take screnshot
//			 File temp = ts.getScreenshotAs(OutputType.FILE);
//			 
//			 //step 3 : create a permenet location:
//			 File perm = new File("C:\\Users\\hp\\Desktop\\Selenium Screenshot\\BR.png") ;
//			 
//			 //Step 4 : copy
//			 FileHandler.copy(temp, perm) ;
//			 
//			 
//			 //close the browser
//			 driver.quit();
	}
}
