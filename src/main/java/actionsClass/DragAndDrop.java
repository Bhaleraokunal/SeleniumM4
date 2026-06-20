package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement dragMe = driver.findElement(By.id("dragItem")) ;
		WebElement dragZone = driver.findElement(By.id("dropZone")) ;
		
		Actions act = new Actions(driver) ;
		
		act.clickAndHold(dragMe).release(dragZone).perform() ;
		
//		act.dragAndDrop(dragMe, dragZone).perform();
		
//		act.dragAndDropBy(dragZone, 430, 649).perform() ;
		
		Thread.sleep(2000) ;
		
		driver.quit();
	}
}
