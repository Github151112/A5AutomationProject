package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBlinkit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		WebElement popup = driver.findElement(By.xpath("//button[text()='Detect my location']"));
		popup.click();
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//div[contains(@class,'SearchBar__AnimationWrap')]"));
		search.click();
		Thread.sleep(5000);
		WebElement searchTextField = driver
				.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
		searchTextField.sendKeys("vegetables");
		Thread.sleep(5000);
		WebElement bhindi = driver.findElement(By.xpath(
				"//div[text()='Lady Finger (Bhindi)']/ancestor::div[contains(@class,'Product__UpdatedC')]/descendant::div[text()='ADD']"));
		bhindi.click();

	}

}
