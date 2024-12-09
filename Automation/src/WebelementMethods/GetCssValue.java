package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));

		// css property
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("font-size"));
		System.out.println(logo.getCssValue("font-family"));

		// attribute
		System.out.println(logo.getAttribute("src"));

		// tagname
		System.out.println(logo.getTagName());

		Dimension hw = logo.getSize();
		System.out.println(hw);

		Point xy = logo.getLocation();
		System.out.println(xy);
		
		
		Rectangle r = logo.getRect();
		
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());

	}

}
