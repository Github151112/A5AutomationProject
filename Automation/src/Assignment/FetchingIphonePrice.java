package Assignment;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingIphonePrice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		//search the iphone
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		ArrayList<String> iphoneList = new ArrayList<>();
		iphoneList.add("Apple iPhone 16 (Ultramarine, 128 GB)");
		iphoneList.add("Apple iPhone 15 Plus (Blue, 128 GB)");
		iphoneList.add("Apple iPhone 15 Plus (Pink, 128 GB)");
		iphoneList.add("Apple iPhone 15 Plus (Black, 128 GB)");
		iphoneList.add("Apple iPhone 16 (Black, 256 GB)");
		
		for(String list:iphoneList)
		{
			String path = "//div[text()='"+list+"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']";
			String price = driver.findElement(By.xpath(path)).getText();
			System.out.println(list +" "+price);
		}
		
		
	}

}
