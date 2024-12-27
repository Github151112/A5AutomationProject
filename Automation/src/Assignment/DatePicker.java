package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static String dayMonth = "June 2025";

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");

		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		System.out.println(text);
		while(true)
		{
			if(text.equals(dayMonth))
				break;
			else	
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
		
		driver.findElement(By.xpath("//div[text()='30']")).click();

	
	}

}
