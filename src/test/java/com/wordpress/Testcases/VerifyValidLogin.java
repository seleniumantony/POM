package com.wordpress.Testcases;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPageNew;
 //Code for Page Object Model Using Selenium Webdriver using Page Factory
//TestCase using Page Factory
 
public class VerifyValidLogin 
{
 
 
@Test
public void checkValidUser()
{
 
// This will launch browser and specific url 
	 System.setProperty("webdriver.chrome.driver", "D:\\Antony\\eclipse for Appium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();				 
				 
driver.manage().window().maximize();

driver.get("http://demosite.center/wordpress/wp-login.php");
 
// Created Page Object using Page Factory
LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
 
// Call the method
login_page.login_wordpress("admin", "demo123");
 
}
 
 
 
}