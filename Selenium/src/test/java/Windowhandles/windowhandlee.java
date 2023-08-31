package Windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String window1=driver.getWindowHandle();
		//System.out.println(window1);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			//System.out.println(handle+ " "+driver.getTitle());
			System.out.println(handle);
			if(!window1.equals(handle))
			{
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("keerthi");
				Thread.sleep(3000);
				
			}
		}
		
		driver.switchTo().window(window1);
		driver.findElement(By.id("name")).sendKeys("Welcome");
		Thread.sleep(3000);
		driver.close();

	}
	

}
