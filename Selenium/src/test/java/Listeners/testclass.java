package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(MyTestListener.class)

public class testclass {
	@Test
	public void demo()
 	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://demoqa.com/droppabl/",url);
	}

}
