package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	public static WebDriver driver;
	
	@Given("Alex has registered in to TesMeApp")
	public void alex_has_registered_in_to_TesMeApp() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe"); //Set the driver path
		driver=new ChromeDriver(); //Launch Chrome Browser
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#"); //Open the site in browser
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("SignIn")).click(); 
		Thread.sleep(3000);    
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	     driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
	     driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@When("try to procees to payment without adding any item in the cart")
	public void try_to_procees_to_payment_without_adding_any_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions	    
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
