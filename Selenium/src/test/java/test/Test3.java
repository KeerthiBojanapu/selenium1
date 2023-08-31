package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/primeday?ref_=PD23_FT_ACQ_H1_PC&pf_rd_r=AJEZ2Z2GC07XDJFD9VHQ&pf_rd_p=2da44a63-2c85-4656-b59d-e888718de86a&pd_rd_r=6b8cab7c-1b82-433e-8b96-516ed02a46f3&pd_rd_w=vhjqa&pd_rd_wg=1wssB&tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQjwqs6lBhCxARIsAG8YcDjAqOGx3uuGvDdUuuCrOXtFU6Frzz4LGXPxraVWCmhUpinekV1yV7waAgP-EALw_wcB_k_&gclid=Cj0KCQjwqs6lBhCxARIsAG8YcDjAqOGx3uuGvDdUuuCrOXtFU6Frzz4LGXPxraVWCmhUpinekV1yV7waAgP-EALw_wcB");
		//driver.get("https://www.nseindia.com/get-quotes/equity?symbol=TCS");
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		
	}

}
//a[text()='Amazon miniTV']"
