package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		if(checkBox.isSelected())
			System.out.println("checkbox is already selected ");
		else 
			checkBox.click();
		
		
		
	}

}
