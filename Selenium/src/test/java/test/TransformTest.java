package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TransformTest {
WebDriver driver;
	
	@BeforeMethod
	public void setbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	 @Test
		
		public void Homepage()
		{
			
			//driver.get("http://poojastore.marolix.com/Authenticate/Login");
			String url=driver.getCurrentUrl();
			org.testng.Assert.assertEquals("http://poojastore.marolix.com/Authenticate/Login",url);
		}
	@Test(alwaysRun=true)
	public void login()
	{
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
    	driver.findElement(By.name("pword")).sendKeys("1234");
    	driver.findElement(By.xpath("// div[@class='col-md-6']/button")).click();
    	String urlhomepage=driver.getCurrentUrl();
    	org.testng.Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", urlhomepage);
	}
	@AfterMethod
	public void teardown() throws Throwable
	{
    	//Thread.sleep(50000);
    	driver.quit();
	}
}
