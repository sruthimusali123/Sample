package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberfile {
	WebDriver driver;
	@Given("opening the browser")
	public void opening_the_browser() {
	    // Write code here that turns the phrase above into concrete actions

	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	}

	@When("Enter the {string}")
	public void enter_the(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	    Thread.sleep(2000);
	}

	@Then("pages Displayed")
	public void pages_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getTitle(),"Google");
	}

}
