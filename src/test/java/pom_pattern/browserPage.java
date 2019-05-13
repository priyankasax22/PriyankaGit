package pom_pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserPage {

	
	WebDriver driver;
	
	public browserPage(WebDriver driver) {
	
		this.driver = driver;
	}

public void browser(String browsername)
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://selenium2019//chromedriver_win32//chromedriver.exe");
		new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C://selenium2019//geckodriver-v0.23.0-win64//geckodriver.exe");
		new FirefoxDriver();
	}
	
	else if(browsername.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C://selenium2019//MicrosoftWebDriver.exe");
		new InternetExplorerDriver();
	}
	else
	{
		System.out.println("wrong browser name");
	}
}





	public void myurl(String url)
	{
		driver.get(url);
	}
	
}
