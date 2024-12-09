package ToTakeScreenshot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotOfFullWebPage {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		
		//explicit typecasting
		TakesScreenshot t = (TakesScreenshot) driver;
		//use the method
		File src = t.getScreenshotAs(OutputType.FILE);
		//create the new file
		File dest = new File("./Screenshot/swiggy.png");
		//copy
		Files.copy(src, dest);
		
		
	}

}
