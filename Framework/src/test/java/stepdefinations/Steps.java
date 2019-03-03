package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{

@Given("^I open a browser$")
public void i_open_a_browser()  {
   
	System.out.println("I open a browser");
}

@When("^I navigate to google page$")
public void i_navigate_to_google_page()  {
    System.out.println("I navigate to google page");
}

@Then("^I validate the search text field$")
public void i_validate_the_search_text_field()  {
    System.out.println("I validate the search text field");
}

}
