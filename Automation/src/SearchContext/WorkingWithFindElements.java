package SearchContext;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/pants?rawQuery=pants");

		List<WebElement> allProduct = driver.findElements(By.xpath("//div"
				+ "[@class='product-productMetaInfo']"));

		for (WebElement product : allProduct) {
			System.out.println(product.getText());
			System.out.println("----------------------------------------------------");
		}
	}

}
