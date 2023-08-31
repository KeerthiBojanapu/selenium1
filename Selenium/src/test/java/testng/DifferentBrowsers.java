package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DifferentBrowsers {
	
	WebDriver driver;
	@Test
	@Parameters("browsername")
	public void browsertest(String browsername) throws Throwable
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		driver.findElement(By.xpath("// div[@class='col-md-6']/button")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
		
		
	}	
}
