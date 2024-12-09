package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		WebElement coronCasesNo = driver.findElement(By.xpath(
				"//h1[text()='Coronavirus Cases:']/ancestor::div[@id='maincounter-wrap']/descendant::span[@style='color:#aaa']"));
		System.out.println(coronCasesNo.getText());
	}
}
