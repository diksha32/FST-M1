package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username","password"})
    public void login(String user, String pass){

        WebElement userName = driver.findElement(By.id("username"));
        WebElement PassWord = driver.findElement(By.id("password"));
        WebElement loginBttn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        userName.sendKeys(user);
        PassWord.sendKeys(pass);
        loginBttn.click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }


    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
