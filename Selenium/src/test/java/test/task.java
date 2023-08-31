package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("name")).sendKeys("keerthi");
		driver.findElement(By.id("phone")).sendKeys("8239865746");
		driver.findElement(By.id("email")).sendKeys("keerthi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    driver.findElement(By.id("female")).click();
        driver.findElement(By.id("friday")).click();
	    WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Norway");
		driver.findElement(By.xpath("//label[text()='2 years']")).click();
		driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
//		WebElement ele=driver.findElement(By.xpath("//label[text()='Choose file']"));
//		ele.click();
//		Robot rb=new Robot();
//        rb.delay(2000);
//        StringSelection ss=new StringSelection("C:\\Users\\Dell\\Downloads\\Java interview qsns.docx");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//        rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
