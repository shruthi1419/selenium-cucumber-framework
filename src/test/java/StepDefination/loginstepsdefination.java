package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepsdefination {
	static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver=new  ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/v1/");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	@Then ("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigate to Home page");
	}

	@And("close the broswer")
	public void close_the_broswer() {
	driver.close();
	}



}
