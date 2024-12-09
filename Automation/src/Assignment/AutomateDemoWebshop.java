package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWebshop {

	static String pwd = "Aman@123";
	static Random r = new Random();

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// click on register
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		// click on male
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		maleRadioButton.click();
		// enter the first name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Aman");
		// enter the last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Singh");
		// enter the email

		int no = r.nextInt(1000000);
		String emailID = "aman" + no + "@gmail.com";
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(emailID);
		// enter the password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(pwd);
		// enter the confirm password
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys(pwd);
		// click on register button
		WebElement regButton = driver.findElement(By.id("register-button"));
		regButton.click();

		// close the browser
		// driver.quit();
	}

}
