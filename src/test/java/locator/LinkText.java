package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	//	driver.findElement(By.linkText("Excellent")).click();
		
	//	driver.findElement(By.partialLinkText("L")).click() ;
		
//		driver.findElement(By.className("search-box-text ui-autocomplete-input"))
//		.sendKeys("Hello World") ;
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a")) ;
		
		System.out.println(allLinks.size());
		
		for (WebElement webElement : allLinks) {
			//System.out.println(webElement.getText());
			if (webElement.getText().equals("RSS")) {
				webElement.click();
				
				Thread.sleep(2000) ;
				
				driver.navigate().back();
			}
		}
	}
}
