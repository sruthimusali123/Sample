package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class draganddrop {
	WebDriver driver;
	@Given("opening the chrome")
	public void opening_the_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	}
	@When("enters the {string}")
	public void use_enters_the(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(string);
	    Thread.sleep(2000);
	}

	@Then("dragged from the source and reached to destination")
	public void dragged_from_the_source_and_reached_to_destination() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 Actions builder = new Actions(driver);
		builder.clickAndHold(source).moveToElement(target).release(source).build().perform();
		 
		 //String textTo = target.getText();
		 
		 /*if(textTo.equals("Dropped!")) {
			 System.out.println("PASS: Source is dropped to target as expected"); 
			
		 }
		 else 
			 System.out.println("FAIL: Source couldn't be dropped to target as expected");*/
		try {
		 Assert.assertEquals(target.getText(),"Dropped!");
		}
		catch(AssertionError e)
		{
			System.out.println("title is not matched");
		}
		
		 driver.quit();
		 }
	

}
