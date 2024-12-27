package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_KSRTC {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		driver.findElement(By.xpath("//span[text()='Select Departure City']/ancestor::a/following-sibling::div/descendant::input")).sendKeys("adoni",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();
		driver.findElement(By.xpath("//span[text()='Select Destination City']/ancestor::a/following-sibling::div/descendant::input")).sendKeys("Bangalore",Keys.ENTER);
		
	}

}
