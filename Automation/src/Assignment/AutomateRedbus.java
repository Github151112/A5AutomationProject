package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateRedbus {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gmail.com");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ak6838883@gmail.com");
		email.sendKeys(Keys.RETURN);
		
		
	
	
		
	
		
		
		
		
		
	}

}
