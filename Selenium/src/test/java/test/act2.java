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

import io.github.bonigarcia.wdm.WebDriverManager;

public class act2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover=driver.findElement(By.xpath("//span[text()='Select WORD files']"));
		hover.click();
        Robot rb=new Robot();
        rb.delay(2000);
        StringSelection ss=new StringSelection("\"C:\\Users\\Dell\\Desktop\\Automation Interview Qsns.docx\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        
	}

}
