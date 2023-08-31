package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;

public class Selectt {

	
		// TODO Auto-generated constructor stub
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
		//sel.selectByVisibleText("Norway");
		//sel.selectByIndex(3);
		sel.selectByValue("2");
		
		
		
		
		
		
	
	}
}
