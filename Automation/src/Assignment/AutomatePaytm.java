package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomatePaytm {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paytm.com");
		WebElement movies = driver.findElement(
				By.xpath("//img[contains(@src,'https://assetscdn1.paytm.com/images/catalog/view_item/733295')]"));
		movies.click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Noida");
		driver.findElement(By.xpath(
				"//div[@class='DesktopMovieCitySelector_cityListing__tz4Zf']/descendant::div[text()='Greater Noida']"))
				.click();
		driver.findElement(By.xpath("//img[@alt='Pushpa 2: The Rule']")).click();
		driver.findElement(By.id("Telugu-index-selection-dialog")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//div[text()='6']")).click();
		// full page
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/movie.png");
		Files.copy(src, dest);
		// particular webelement
		WebElement moviePoster = driver.findElement(By.xpath("//img[@alt='movie poster']"));
		File src1 = moviePoster.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/poster.png");
		Files.copy(src1, dest1);
		driver.quit();

	}

}
