package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();

		String parentSessionId = driver.getWindowHandle();
		System.out.println(parentSessionId);

		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		for (String id : allId) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals("Apple iPhone 15 (Black, 128 GB)")) {
				break;
			}
		}

		try {
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		} catch (Exception e) {
			// TODO: handle exception
			driver.findElement(By.xpath("//button[text()='Pay with EMI']")).click();
		}

	}

}
