package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class poojaloginfun extends exceldataget {
	@Test(dataProvider = "getdata",dataProviderClass = exceldataget.class)
	public void logintest(String Username,String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("emailid")).sendKeys(Username);
		driver.findElement(By.name("pword")).sendKeys(Password);
		driver.findElement(By.xpath("// div[@class='col-md-6']/button")).click();
		String url=driver.getCurrentUrl();
		org.testng.Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
	}
	

}
