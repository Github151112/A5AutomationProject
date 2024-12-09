package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(575, 350));
		driver.manage().window().setPosition(new Point(0, 0));

	}

}
