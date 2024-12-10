package Praticesession;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import dev.failsafe.Timeout;
import io.netty.handler.timeout.TimeoutException;

public class WorkingWithDeselectMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("select-multiple-native"))));

		Select s = new Select(driver.findElement(By.id("select-multiple-native")));
		System.out.println(s.getWrappedElement().getText());

	}

}
