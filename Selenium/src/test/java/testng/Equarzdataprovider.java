package testng;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Equarzdataprovider {
	@Test(dataProvider = "logintest")	
		
	public void dataset(String Username,String Password) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://hr.marolix.com/login");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);		
		driver.findElement(By.xpath("//button[@id='c-p-bn']")).click();
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals("http://hr.marolix.com/hrm-dashboard",url);
	}

	@DataProvider(name="logintest")		
	public Object[][] dataset()	
	{
	Object [][] data=new Object [4][2];
	data[0][0]="admin123@gmail.com";
	data[0][1]="123456789";
	data[1][0]="pooja132@gmail.com";
	data[1][1]="1234";
	data[2][0]="keerthi.marolix@gmail.com";
	data[2][1]="123456789";
	data[3][0]="keerthi.marolix@gmail.com";
	data[3][1]=" ";
	return data;

}
}



