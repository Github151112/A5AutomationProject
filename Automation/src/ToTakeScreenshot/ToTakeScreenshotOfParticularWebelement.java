package ToTakeScreenshot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotOfParticularWebelement {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement element = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		//use the method
		File src = element.getScreenshotAs(OutputType.FILE);
		//create the new file
		File dest = new File("./Screenshot/logo.png");
		//copy
		Files.copy(src, dest);
		
	}

}
