package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 1)
    public void exampleTestCase() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals(title, "Target Practice");
    }
    @Test
    public void blackButton(){
        //Find the clickable link on the page and click it
        WebElement blackBttn= driver.findElement(By.xpath("//button[contains(text(),'Black')]"));

        Assert.assertEquals(blackBttn.getText(), "Green");
    }

    @Test(enabled = false)
    public void blackButtonSkip(){
        //Find the clickable link on the page and click it
        WebElement blackBttn= driver.findElement(By.xpath("//button[contains(text(),'Black')]"));

        Assert.assertEquals(blackBttn.getText(), "Green");
    }

    @Test(enabled = false)
    public void Test4Skip(){
        //Find the clickable link on the page and click it
        throw new SkipException("Skipping test case");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
