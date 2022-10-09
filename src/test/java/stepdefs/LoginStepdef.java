package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
	WebDriver  driver=HooksClass.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
			
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	}

	@When("I enter the correct username and passowrd")
	public void i_enter_the_correct_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("behera.arpita@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Rishu@10072017");

	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I enter the incorrect username and passowrd")
	public void i_enter_the_incorrect_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
		
	   
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		/*try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	}
	
	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		loginlink.click();
	   
	}
	
	@And("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
	
	@When("I enter the username as {string} and passowrd as {string}")
	public void i_enter_the_username_as_and_password_as(String username, String passowrd) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(username);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(passowrd);
	   
	}
	
	@When("I enter the username as {string} and passoword as {string}")
	public void i_enter_the_username_as_and_passoword_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(username);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);
	   
	  
	}


}