package practice;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("fname")).sendKeys("keerthi");
		driver.findElement(By.id("idOfButton")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
//		WebElement hover=driver.findElement(By.id("dblClkBtn"));
//		Actions ac=new Actions(driver);
//		ac.doubleClick(hover).build().perform();		
		WebElement ele=driver.findElement(By.id("female"));
		ele.click();
		System.out.println(ele.isSelected());
		WebElement check=driver.findElement(By.xpath("//input[@class='Automation']"));
		check.click();
		System.out.println(check.isSelected());
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Performance Testing");
		//driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
//		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();		
//		Alert al=driver.switchTo().alert();
//		Thread.sleep(3000);
//		al.accept();
		//al.dismiss();
		Actions ac=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//img[@id='myImage']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='targetDiv']"));
		ac.dragAndDrop(source,target).perform();
		
		
		
		
		
		

	}

}
