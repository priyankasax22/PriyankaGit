package pom_pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yahoo {
WebDriver driver;
	
	@Test
	public void rediffLoginByPageObjectModel()
	{
	
		System.setProperty("webdriver.chrome.driver", "C://selenium2019//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("rediff.com");
		
		
		rediffloginPage rd=new rediffloginPage(driver);
		rd.sign_in().click();
		rd.user_name().sendKeys("priysnka");
		rd.pass_word().sendKeys("hcjg");
		rd.go_in().click();
}
}
