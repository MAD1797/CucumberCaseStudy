package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	
	public static WebDriver driver;
	PageObject po;
	
	@Given("I Launched The TestMe App Website and clicked on SignUp Button")
	public void i_Launched_The_TestMe_App_Website_and_clicked_on_SignUp_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe"); //Set the driver path
		driver=new ChromeDriver(); //Launch Chrome Browser
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#"); //Open the site in browser
		driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText("SignUp")).click();
		Thread.sleep(3000);    
		
		po = new PageObject(driver);
		po.Sign_Up();
	}

	@When("I entered Username as {string} FirstName as {string} LastName as {string}")
	public void i_entered_Username_as_FirstName_as_LastName_as(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("userName")).sendKeys(string);
		//driver.findElement(By.id("firstName")).sendKeys(string2);
		//driver.findElement(By.id("lastName")).sendKeys(string3); 
		po.user_name("MarkDuarte1234");
		po.firstName("Mark");
		po.lastName("Duarte");
	}

	@When("I entered password as {string} and ConfirmPassword as {string}")
	public void i_entered_password_as_and_ConfirmPassword_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("password")).sendKeys(string);
		//driver.findElement(By.id("pass_confirmation")).sendKeys(string2);   
		po.password("pass1234");
		po.pass_confirmation("pass1234");
	}

	@When("I selected Gender as Male Email as {string} Mobile Number as {string} DOB as {string}")
	public void i_selected_Gender_as_Male_Email_as_Mobile_Number_as_DOB_as(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//input[@value='Male']")).click();
		//driver.findElement(By.id("emailAddress")).sendKeys(string);
		//driver.findElement(By.id("mobileNumber")).sendKeys(string2);
		//driver.findElement(By.id("dob")).sendKeys(string3);	 
		
		po.male();
		po.emailAddress("abc@gmail.com");
		po.mobileNumber("1234567890");
		po.dob("07/17/1997");
	}

	@When("I entered my Address as {string}")
	public void i_entered_my_Address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("address")).sendKeys(string);  
		po.address("Home");
	}

	@When("I selected Security Question and entered {string} as answer")
	public void i_selected_Security_Question_and_entered_as_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement security = driver.findElement(By.id("securityQuestion"));
		//Select secQuestion = new Select(security);
		//secQuestion.selectByVisibleText("What is your favour color?");
		//driver.findElement(By.id("answer")).sendKeys(string);
		po.answer("black");
	    
	}

	@Then("I clicked the Register Button")
	public void i_clicked_the_Register_Button() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//input[@value='Register']")).click();
		po.register();
	}

}
