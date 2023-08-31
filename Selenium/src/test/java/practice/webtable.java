package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
		@Test
		public void test1() {
			    WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://cosmocode.io/automation-practice-webtable/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)", "");										
				int rowscount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
				System.out.println(rowscount);
				int columncount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
				System.out.println(columncount);				
				/*for(int i=2;i<=rowscount;i++) {
					System.out.println(i+"");					
				for(int j=2;j<=columncount;j++) {*/				
				String value = driver.findElement(By.xpath("//table[@id='countries']//tr[\"+1+\"]//td[\"+j+\"]")).getText();				
					System.out.println(value);
					//}
				//}				
				CellValue(driver,"4","4");
				CellValue(driver,"5","2");	
				
				checkboxclick(driver,"3");
				checkboxclick(driver,"6");				
				}
			public static void CellValue(WebDriver driver,String rownumber,String columnnumber) {
		 String CellValue = driver.findElement(By.xpath("//table[@id='countries']//tr[\"+rowNumber+\"]//td[\"+coloumnNumber+\"]")).getText();
		 System.out.println(CellValue);
			}
			public static void checkboxclick(WebDriver driver,String rownumber) {
				driver.findElement(By.xpath("//table[@id='countries']//tr[\"+rowNumber+\"]//td[1]//input")).click();
			}						
}

