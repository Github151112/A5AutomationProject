package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		// to launch the application
		driver.get("https://www.flipkart.com");
		// to print the title
		String actual_Title = driver.getTitle();
		String expected_Title= "Online Shoping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(actual_Title.equals(expected_Title))
			System.out.println("welcome page is displayed");
		else
			System.out.println("welcome page is not displayed");
		
		
		//to return the url
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals("https://www.flipkart.com/"))
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
		
		
		//use getPageSource
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		

	}

}
