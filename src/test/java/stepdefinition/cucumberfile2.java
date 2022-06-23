package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberfile2 {
	WebDriver driver;
	@Given("user is on the search page {string}")
	public void user_is_on_the_search_page(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get(string);
	     Thread.sleep(2000);
	}

	@When("user enters {string} data")
	public void user_enters_data(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(string);
	    
	}

	@And("click on the search")
	public void click_on_the_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	}

	@Then("user is navigate to the search page")
	public void user_is_navigate_to_the_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    boolean result=driver.getTitle().matches("[A-Za-z]*[ ][-][ ]Google Search");
	    Assert.assertEquals(true, result);
	    System.out.println("pass");
	    	
	    	
	    	
	}

}
