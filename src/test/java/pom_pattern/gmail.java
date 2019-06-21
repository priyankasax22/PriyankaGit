package pom_pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmail {

WebDriver driver;
	
	public gmail(WebDriver driver) {
		this.driver=driver;
					}
	
	
	
	By signin=By.xpath("//a[text()='Sign in']");
	By username=By.id("login1");
	By password=By.id("password");
	By go=By.xpath("//input[@value='Go']");

	
	
	public WebElement sign_in()
	{
		return driver.findElement(signin);
	}
	
	
	public WebElement user_name()
	{
		return driver.findElement(username);
	}
	
	
	public WebElement pass_word()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement go_in()
	{
		return driver.findElement(go);
	}
	
	
}
