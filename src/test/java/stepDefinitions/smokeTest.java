package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) {
	    driver.findElement(By.id("email")).sendKeys(arg1);
	    driver.findElement(By.id("pass")).sendKeys(arg2);
	    
	    
	}

	@Then("^user should be able to login succesfully$")
	public void user_should_be_able_to_login_succesfully() throws Throwable {
	   driver.findElement(By.id("u_0_2")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() {
	    driver.close();
	}



}
