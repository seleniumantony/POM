package com.wordpress.Pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import com.wordpress.Pages.LoginPage;
 
/**
* @author Mukesh_50
*Page Object model without PageFactory ,Test case using without PageFactory
*/
public class VerifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin()
{
 
	 System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();				 
				 
driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
LoginPage login=new LoginPage(driver);



login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}