package practice;

import java.time.Duration;
import java.time.Year;
import java.time.YearMonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abhibus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String date="12";
		String month="Sepetember";
		String year="2024";
		driver.findElement(By.id("source")).sendKeys("Rayachoti");
		driver.findElement(By.id("destination")).sendKeys("Hyderabad");
		driver.findElement(By.id("datepicker1")).click();
		while(true)
		{
			
		
			String MONTHandYEAR=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).getText();
			String []Month_Year=MONTHandYEAR.split(" ");
			String Mon=Month_Year[0];
			String Yr=Month_Year[1];
			if(Mon.equals(month)&&(Yr.equals(year)))
			{
				break;
			}
			else
			{
				
			}
		
		
	}

	}
}
