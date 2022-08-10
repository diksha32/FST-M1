package StepDefinitions;

import io.cucumber.java.en.Then;

public class CloseBrowser extends BaseClass{

    @Then("^Close the browser$")
    public void quitBrowser(){

        driver.quit();
    }
}
