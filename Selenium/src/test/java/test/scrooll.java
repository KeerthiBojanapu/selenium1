package test;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.debugger.model.Location;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrooll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=14664198503555616580&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299135&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebElement element=driver.findElement(By.xpath("//a[@href=\'https://www.amazon.sg/ref=footer_sg\']"));
		//org.openqa.selenium.Point loc=element.getLocation();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300");
		//js.executeScript("window.scrollBy"+loc);
		

		
		
		
	}

}
