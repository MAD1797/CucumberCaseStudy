package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	
	public PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(partialLinkText="SignUp")
	public static WebElement SignUp;
	
	@FindBy(name="userName")
	public static WebElement username;
	
	@FindBy(name="firstName")
	public static WebElement firstName;
	
	@FindBy(name="lastName")
	public static WebElement lastName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id="pass_confirmation")
	public static WebElement pass_confirmation;
	
	@FindBy(xpath="//input[@value='Male']")
	public static WebElement male;
	
	@FindBy(name="emailAddress")
	public static WebElement emailAddress;
	
	@FindBy(name="mobileNumber")
	public static WebElement mobileNumber;
	
	@FindBy(name="dob")
	public static WebElement dob;
	
	@FindBy(name="address")
	public static WebElement address;
	
	@FindBy(name="answer")
	public static WebElement answer;
	
	@FindBy(xpath="//input[@value='Register']")
	public static WebElement register;
	
	
	public void Sign_Up()
	{
		SignUp.click();
	}
	
	public void user_name(String name)
	{
		username.sendKeys(name);
	}
	
	public void firstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void pass_confirmation(String passc)
	{
		pass_confirmation.sendKeys(passc);
	}
	
	public void male()
	{
		male.click();
	}
	
	public void emailAddress(String email)
	{
		emailAddress.sendKeys(email);
	}
	
	public void mobileNumber(String number)
	{
		mobileNumber.sendKeys(number);
	}
	
	public void dob(String db)
	{
		dob.sendKeys(db);
	}
	
	public void address(String add)
	{
		address.sendKeys(add);
	}
	
	public void answer(String ans)
	{
		answer.sendKeys(ans);
	}
	
	public void register()
	{
		register.click();
	}

}
