package Windowhandles;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class quarz {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://e-quarz.com/customer/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		String str=JOptionPane.showInputDialog("Enter captcha");
		//Thread.sleep(10000);
		WebElement element=driver.findElement(By.xpath("//input[@name='default_captcha_value']"));
		element.sendKeys(str);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@class='close __close']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement hover=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).build().perform();
		
		
	}

}
