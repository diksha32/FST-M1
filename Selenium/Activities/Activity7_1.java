package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        String text1 = driver.getTitle();
        System.out.println(text1);

        Thread.sleep(5000);
        WebElement username = driver.findElement
                (By.xpath("//input[starts-with(@class,'username')]"));

        username.sendKeys("admin");

        WebElement password = driver.findElement
                (By.xpath("//input[starts-with(@class,'password')]"));

        password.sendKeys("password");

        WebElement logIn = driver.findElement
                (By.xpath("//button[contains(text(),\"Log in\")]"));

        logIn.click();


        WebElement message= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("action-confirmation")));

        String logInmessage = message.getText();
        System.out.println("Message on screen: "+logInmessage);


        driver.close();
    }
}
