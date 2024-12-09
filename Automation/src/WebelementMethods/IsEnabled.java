package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed())
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		
	
		WebElement usernameTextField = driver.findElement(By.id("email"));
		if (usernameTextField.isEnabled()) {
			usernameTextField.sendKeys("546548411561");
		} else {
			System.out.println("text field is disabled");
		}
	}

}
