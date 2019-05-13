package pom_pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffPageObjectFactory {
	
	WebDriver driver;
	
public rediffPageObjectFactory(WebDriver driver)	
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signin;
	
	

	@FindBy(id="login1")
	WebElement username;
	

	@FindBy(id="password")
	WebElement password;
	

	@FindBy(xpath="//input[@value='Go']")
	WebElement go;
	


	

public WebElement sign_in()
{
	return signin;
}


public WebElement user_name()
{
	return username;
}


public WebElement pass_word()
{
	return password;
}

public WebElement go_in()
{
	return go;
}

}
