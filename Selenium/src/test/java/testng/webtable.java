package testng;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {

	
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
	    int rowscount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
	    System.out.println(rowscount);
	    int columnscount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
	    System.out.println(columnscount);
//	    for(int i=2;i<=rowscount;i++) {
//	    	System.out.println(i+":");
//	    	for(int j=2;j<=columnscount;j++) {
//	    		String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
//	    		System.out.println(value);
//	    	}
//	    	
//	    	
//	    }
	    cellValue(driver,"4","4");
	       cellValue(driver,"5","2");
	       
	       checkboxClick(driver,"3");
	       checkboxClick(driver,"6");
		    
	}
	public static void cellValue(WebDriver driver, String rowNumber,String columnNumber) {
		String cellValue=driver.findElement(By.xpath("//table[@id='countries']//tr["+rowNumber+"]//td["+columnNumber+"]")).getText();
				 System.out.println(cellValue);
		

	
}
	public static void checkboxClick(WebDriver driver, String rowNumber) {
		driver.findElement(By.xpath("//table[@id='countries']//tr["+rowNumber+"]//td[1]//input")).click();
				 

	}
}

