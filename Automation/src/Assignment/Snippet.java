package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Snippet {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-blink-features=AutomationControlled");
		option.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		option.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("ak6838883@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Aman@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
