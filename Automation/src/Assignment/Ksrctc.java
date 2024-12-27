package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrctc {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ksrtc.in/");

		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();

		driver.findElement(By.xpath("//li[text()='Adoni']")).click();

		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();

		driver.findElement(By.xpath("//li[@data-option-array-index='673']")).click();

	}

}
