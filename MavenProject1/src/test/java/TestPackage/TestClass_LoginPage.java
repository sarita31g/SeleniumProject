package TestPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Package_pomclasses.LoginPage1;

public class TestClass_LoginPage {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}

@BeforeMethod
public void beforeMethod() throws InterruptedException
{	
	driver.get("https://groww.in/dashboard");
	driver.manage().window().maximize();
	LoginPage1 login = new LoginPage1(driver);
	login.sendUsername();
	Thread.sleep(1000);
	login.clickOnContinueButton();
	Thread.sleep(1000);
	login.sendPassword();
	Thread.sleep(1000);
	login.clickOnSubmitButton();
	Thread.sleep(1000);
	login.SendPINKey();
}
@Test
public void test1()
{
 String title= driver.getTitle();	
 title.equals("xyz");
 boolean result;
 //result = ssert.assertEquals("xyz", "title", "fail");
 
}

}
