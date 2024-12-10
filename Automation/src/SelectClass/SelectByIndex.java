package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	static WebDriver driver;
	static int seconds = 20;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		driver.get("https://www.facebook.com/r.php");

		// identify the dropdown
		WebElement dropdown = driver.findElement(By.id("day"));
		// create the object select class
		Select s = new Select(dropdown);
		// use methods
		/*
		 * for(int i=0;i<31;i++) { s.selectByIndex(i); }
		 * 
		 */
		
		s.selectByValue("23");
		
		s.selectByVisibleText("20");

	}

}
