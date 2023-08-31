package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("[onclick='alertbox()']")).click();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
////		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
//		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
//		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();		
//		
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		//al.accept();
		//al.dismiss();
				//al.sendKeys("Hello");
		
		
		
		//   //a[@href='#CancelTab']
	}

}
