package stepdefinition;

/*import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src//test//resources//features",
glue= {"stepdefinition"})
public class cucumber3 extends AbstractTestNGCucumberTests{

}
/*@RunWith(Cucumber.class)
@CucumberOptions (features="src//test//resources//features",
glue= {"stepdefinition"})

public class cucumber3{
	
	
	
}*/