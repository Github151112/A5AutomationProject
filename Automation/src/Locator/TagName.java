package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// application
		driver.get("https://demowebshop.tricentis.com/");
		// identify the web element by using tagName locator
		WebElement searchTextField = driver.findElement(By.tagName("input"));
		searchTextField.sendKeys("books");

	}

}
