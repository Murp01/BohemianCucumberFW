package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pmurp\\eclipse-workspace\\Cucumber_Framework\\src\\test\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("^user navigates to stackoverflow website(\\d+)$")
	public void user_navigates_to_stackoverflow_website(int arg1) throws Throwable {
		driver.get("https://stackoverflow.com/");
	}

	@Given("^user clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Log In')]")).click();
	}

	@Given("^user enters a valid username(\\d+)$")
	public void user_enters_a_valid_username(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("FakeEmailAddress@fake.com");
	}

	@Given("^user enters a valid password(\\d+)$")
	public void user_enters_a_valid_password(int arg1) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("FakePassword");
	}

	@When("^the user clicks on the login button on the homepage(\\d+)$")
	public void the_user_clicks_on_the_login_button_on_the_homepage(int arg1) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='submit-button']")).click();
	}

	@Then("^user should be taken to the successful login page(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page(int arg1) throws Throwable {
		System.out.println("user_should_be_taken_to_the_successful_login_page");
	}

	@Given("^user navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		System.out.println("user_navigates_to_stackoverflow_websit");
	}

	@Given("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("user_clicks_on_the_login_button");
	}

	@Given("^user enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		System.out.println("user_enters_a_valid_username");

	}

	@Given("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		System.out.println("user_enters_a_valid_password");

	}

	@When("^the user clicks on the login button on the homepage$")
	public void the_user_clicks_on_the_login_button_on_the_homepage() throws Throwable {
		System.out.println("the_user_clicks_on_the_login_button_on_the_homepage");

	}

	@Then("^user should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		System.out.println("user_should_be_taken_to_the_successful_login_page");

	}

}
