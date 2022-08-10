package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchSteps {

    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Google Home Page$")
    public void user_is_on_google_home_page() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
        driver.get("www.google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void enterCheese() {

       WebElement search= driver.findElement
               (By.xpath("//input[@class=\"gLFyf gsfi\"]"));
       search.click();
       search.sendKeys("cheese", Keys.RETURN);
    }

    @Then("^Show how many search results were shown$")
    public void searchResults() {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
    }

    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
