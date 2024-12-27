package ActionsClasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		Actions a = new Actions(driver);

		a.dragAndDropBy(driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']")), -100, 0).perform();

	}

}
