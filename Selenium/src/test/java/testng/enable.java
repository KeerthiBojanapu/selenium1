package testng;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enable {
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor)driver;		
		js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last name']")).sendKeys("keerthi");
		
	}

}
