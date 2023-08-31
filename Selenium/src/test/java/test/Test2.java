package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=15153041950931618438&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062137&hvtargid=kwd-10573980&hydadcr=14453_2154373");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		//System.out.println(driver.getPageSource());
//	    System.out.println(driver.getWindowHandle());
//		
//		driver.close();
//      driver.findElement(By.linkText("Home")).click();
//	    driver.findElement(By.id("name")).sendKeys("keerthi");
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("welcome to india");
		driver.findElement(By.id("female")).click();
//		WebElement check=driver.findElement(By.id("monday"));
//		check.click();
//		System.out.println(check.isSelected());
//
		System.out.println(driver.getWindowHandles());
//	    System.out.println(driver.manage());
//	    System.out.println(driver.navigate());
//	    System.out.println(driver.switchTo());
//	    driver.quit();
		
	}

}
