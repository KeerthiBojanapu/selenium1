package Windowhandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framess {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void test1() throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement fram=driver.findElement(By.xpath("//iframe[@src='https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html']"));
		driver.switchTo().frame(fram);
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.id("selectnav1"));
		Select sel=new Select(dropdown);
		sel.selectByValue("https://www.hyrtutorials.com/search/label/AutomationTesting");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Keerthi");
		Thread.sleep(3000);
		driver.close();

	}

}
