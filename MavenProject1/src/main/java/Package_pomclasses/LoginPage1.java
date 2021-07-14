package Package_pomclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy (id= "login_email1")
	private WebElement email;
	
	@FindBy (xpath= "(//span[@class='absolute-center'])[1]")
	private WebElement continueButton;
	
	@FindBy (id="login_password1")
	private WebElement password;
	
	@FindBy (xpath="(//div[@class='absolute-center btn51ParentDimension'])[1]")
	private WebElement submitbutton;
	
	@FindBy (xpath="//input[@type='number']")
	private List <WebElement> PINInput;

	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		email.sendKeys("saritagarje31@gmail.com");
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	public void sendPassword()
	{
		password.sendKeys("Sari@8856");
	}
	public void clickOnSubmitButton()
	{
		submitbutton.click();
	}
	public void SendPINKey()
	{
		PINInput.get(0).sendKeys("3");
		PINInput.get(1).sendKeys("1");
		PINInput.get(2).sendKeys("1");
		PINInput.get(3).sendKeys("0");
	}
}
