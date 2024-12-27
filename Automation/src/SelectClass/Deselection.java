package SelectClass;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");

		Set<Cookie> cookies = driver.manage().getCookies();

		for (Cookie c : cookies) {
			System.out.println(c.getName() + "==>" + c.getValue());
		}

	}

}
