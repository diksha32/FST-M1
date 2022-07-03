package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {

    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }

    @Test(dataProvider = "Authentication")
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
    public void afterClass() {
        //Close browser
        driver.close();
    }

}
