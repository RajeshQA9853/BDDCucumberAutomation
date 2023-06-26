package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("I am on Gmail login page")
	public void i_am_on_gmail_login_page() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F8494%3Fhl%3Den%26co%3DGENIE.Platform%253DDesktop&ec=GAZAdQ&hl=en&passive=true&sjid=7793725606894367651-AP&ifkv=AQMjQ7RNvGuSamn8updMf791KZaZweqoDinZrMPGgKwv6uCvPF65w4XW9kcAwzU8AeJSUiQivLS1Pw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  
	}

	@When("I enter the username click on next")
	public void i_enter_the_username_click_on_next() {
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("rajeshjena907@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
	    
	}

	@When("I enter the password click on next")
	public void i_enter_the_password_click_on_next() {
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Ostar@rajesh@jena1");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
	   
	}

	@Then("I should see my gmail inbox page")
	public void i_should_see_my_gmail_inbox_page() {
		String actual = driver.getTitle();
		String expected = "Inbox";
		if(actual.contains(expected)) {
			System.out.println("Gmail Login Success");
		}
		else {
			System.out.println("Gmail Loging failed");
	    }
	    
	}

}
