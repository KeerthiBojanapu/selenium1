package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover=driver.findElement(By.xpath("//span[text()='Convert PDF']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).build().perform();
		ac.doubleClick(hover).build().perform();
		ac.contextClick(hover).build().perform();

	}

}
