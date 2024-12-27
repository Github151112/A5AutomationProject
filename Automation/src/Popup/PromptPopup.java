package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		/*
		 * switch the control from main page to alert popup
		 */
		Alert a = driver.switchTo().alert();
		
		//getText
		System.out.println(a.getText());
		
		//pass the value
		a.sendKeys("yes");
		
		// if you want to click on ok button
		a.accept();
		

	}

}
