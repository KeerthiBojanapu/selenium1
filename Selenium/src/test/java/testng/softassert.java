package testng;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softassert {
	@Test
	public void test2() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin.hospiol.com/site/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	SoftAssert sf=new SoftAssert();
	WebElement user=driver.findElement(By.name("username"));
	WebElement pass=driver.findElement(By.name("password"));
	sf.assertTrue(user.isEnabled());
	driver.findElement(By.name("username")).sendKeys("abhishek@marolix.co");
	//Thread.sleep(3000);
	sf.assertTrue(pass.isEnabled());
	driver.findElement(By.name("password")).sendKeys("Reset@123");
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	sf.assertAll();

}
}
