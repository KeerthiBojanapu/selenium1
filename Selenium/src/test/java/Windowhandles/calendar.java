package Windowhandles;

import java.time.Duration;
import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String date="12";
		String month="August";
		String year="2024";
		WebElement ele=driver.findElement(By.id("first_date_picker"));
		ele.click();
		while(true)
		{
			String MONTHandYEAR=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String []Month_Year=MONTHandYEAR.split(" ");
			String Mon=Month_Year[0];
			String Yr=Month_Year[1];
			if(Mon.equals("september")&&(Yr.equals(2024)))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']]")).click();
				
			}
		}
		List<WebElement> dates=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for(WebElement datess:dates)
		{
			if(((WebElement) dates).getText().equals(date))
			{
				datess.click();
				break;
				
			}
		
			
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
