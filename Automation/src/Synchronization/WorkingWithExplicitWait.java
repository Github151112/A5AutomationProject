package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/");

		driver.findElement(By.xpath("//span[text()='PONDs Bright Beauty Serum Cream Anti S...']")).click();

		driver.findElement(By.id("Check Delivery")).sendKeys("132103");

		// use explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click();

	}

}
