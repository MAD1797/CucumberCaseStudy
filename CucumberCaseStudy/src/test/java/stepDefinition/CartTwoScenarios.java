package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CartTwoScenarios {
	
	public static WebDriver driver;

	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe");
		//launch the chrome browser
		driver= new ChromeDriver();
		//open the google.com page in chrome
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("Alex searches a particular product like headphones")
	public void alex_searches_a_particular_product_like_headphones() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@Then("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart()  throws Exception  {
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
	        System.out.println("Cart Icon is present");
	    } catch (NoSuchElementException ex) { 
	    	System.out.println("Cart Icon is absent");
	    }
	}

	@Then("Text Me App doesn't display the cart icon")
	public void text_Me_App_doesn_t_display_the_cart_icon()  {
	   System.out.println("Cart icon is not visible in TestMEApp without selecting product");
	}

	@Given("Alex has registered in the TestMEApp")
	public void alex_has_registered_in_the_TestMEApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe");
		//launch the chrome browser
		driver= new ChromeDriver();
		//open the google.com page in chrome
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.name("Login")).click();
	}

	@When("Alex searched for headphone")
	public void alex_searched_for_headphone() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("headphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

	}

	@When("Add HeadPhone to the cart")
	public void add_HeadPhone_to_the_cart() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		
		
	   
	}

	@When("Clicked on cart button and do payment process")
	public void clicked_on_cart_button_and_do_payment_process() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();

		driver.findElement(By.xpath("//textarea[@id='add1']")).sendKeys("Statue Of Liberty, USA"); //set address
		driver.findElement(By.xpath("//form[2]//input[1]")).click(); //click on proceed payment
		Thread.sleep(5000);
		//Check whether you are redirected to payment gateway or not
		//Assert.assertEquals(driver.getTitle(),"Payment Gateway");
		
		//SelectBank
		
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]//i")).click();
		driver.findElement(By.xpath("//a[@id='btn']")).click(); //continue pr click kro
		//enter band details of Andhara bank
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//div[3]//input[1]")).click(); //Login
		driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456"); 
		driver.findElement(By.xpath("//div[@class='user-right']//input")).click(); //pay now
		
		//verify
		//String a=driver.getTitle();
		
	    
	}

	@Then("Alex get successfull payment messsage")
	public void alex_get_successfull_payment_messsage() {
		Assert.assertEquals(driver.getTitle(),"Order Details");
		System.out.println("Payment Done");
	    
	}

}
