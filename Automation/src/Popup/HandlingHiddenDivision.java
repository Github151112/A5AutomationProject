package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivision {
	public static void main(String[] args) throws InterruptedException {

		String monthYear = "June 2025";
		int date = 26;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for (;;) {
			try {

				driver.findElement(By.xpath("//div[text()='" + monthYear
						+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + date + "']")).click();
				break;

			} catch (Exception e) {
				
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
