package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * @author CHIRAG
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepdefinations"}
					,plugin = {"pretty", "html:target/cucumber"}
					
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
