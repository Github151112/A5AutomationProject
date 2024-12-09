package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//identify the username and pass the value
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.sendKeys("AmanSingh");
		
		//identify the password and pass the value
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		passwordTextField.sendKeys("hgxuhxbgsucg");
		
		//identify the login button and click on it
		WebElement loginButton = driver.findElement(By.className("_6lth"));
		loginButton.click();
		
		
		
		
	}

}
