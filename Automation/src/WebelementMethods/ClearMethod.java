package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchTextField = driver.findElement(By.id("small-searchterms"));
		Thread.sleep(2000);
		searchTextField.sendKeys("books");
		Thread.sleep(2000);
		searchTextField.clear();
		Thread.sleep(2000);
		searchTextField.sendKeys("computer");
	}

}
