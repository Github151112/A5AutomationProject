package Synchronization;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.netty.handler.timeout.TimeoutException;

/**
 * @author AMAN SINGH 9 dec
 */

public class WorkingWithExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='PONDs Bright Beauty Serum Cream Anti S...']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("132103");
		/*
		 * use explicit wait WebDriverWait w = new WebDriverWait(driver,
		 * Duration.ofSeconds(10));
		 * w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		 */

		FluentWait f = new FluentWait(driver);
		f.wait(20000);
		f.pollingEvery(Duration.ofSeconds(1));
		f.ignoring(TimeoutException.class);
		f.until(ExpectedConditions.elementToBeClickable(By.id("check")));

		driver.findElement(By.id("Check")).click();

	}

}
