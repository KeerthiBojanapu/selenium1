package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hardassert {
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement user=driver.findElement(By.name("username"));
		WebElement pass=driver.findElement(By.name("password"));
		Assert.assertTrue(user.isEnabled());
		driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
		Assert.assertTrue(pass.isEnabled());
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard",url);
											
	}
	

}
