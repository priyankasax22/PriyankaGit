package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumTest {

	
	@Test
	public void myseleniumtest()
	{
		System.setProperty("webdriver.chrome.driver", "C://selenium2019//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}
}
