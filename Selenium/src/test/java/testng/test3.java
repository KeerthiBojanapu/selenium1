package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
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
    @Test
    public void login()
    {
    	driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
    	driver.findElement(By.name("pword")).sendKeys("1234");
    	driver.findElement(By.xpath("// div[@class='col-md-6']/button")).click();
    	String urlhomepage=driver.getCurrentUrl();
    	org.testng.Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", urlhomepage);
    }
    @Test(enabled=false)
    public void logout()
    {
    	driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
    	//driver.quit();
    	driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
    	String logouturl=driver.getCurrentUrl();
    	org.testng.Assert.assertEquals("http://poojastore.marolix.com/", logouturl);
    		
    	}
    @AfterMethod
	public void teardown() throws Throwable
	{
    	//Thread.sleep(50000);
    	driver.quit();
	
    	
    }
}




	    
		
		