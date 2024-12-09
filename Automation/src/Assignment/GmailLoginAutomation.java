package Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmailLoginAutomation {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	 // Set the path to your custom Chrome profile
        String profilePath = "C:\\Users\\AMAN SINGH\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + profilePath);
       
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Gmail login page
            driver.get("https://accounts.google.com/");

            // Set implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Enter email or phone
            WebElement emailField = driver.findElement(By.id("identifierId"));
            emailField.sendKeys("ak6838883@gmail.com");

            // Click "Next"
            driver.findElement(By.id("identifierNext")).click();

            // Wait for password field to load
            Thread.sleep(2000); // Use WebDriverWait for better synchronization

            // Enter password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("your_password");

            // Click "Next"
            driver.findElement(By.id("passwordNext")).click();

            // Wait for Gmail to load
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
