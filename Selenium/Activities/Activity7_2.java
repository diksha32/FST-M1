package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        String text1 = driver.getTitle();
        System.out.println(text1);

        Thread.sleep(5000);

        //Sign-up form
        WebElement username = driver.findElement
                (By.xpath("//input[contains(@class,\"-username\")]"));

        username.sendKeys("admin");

        WebElement password = driver.findElement
                (By.xpath("//input[contains(@class,\"-password\")]"));

        password.sendKeys("password");

        WebElement ConfirmPass = driver.findElement
                (By.xpath("//label[contains(text(),\"Confirm Password\")]/following-sibling::*"));

        ConfirmPass.sendKeys("password");

        WebElement email = driver.findElement
                (By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("dikshamittal3295@gmail.com");

        WebElement signUp = driver.findElement
                (By.xpath("//button[contains(text(),'Sign Up')]"));

        signUp.click();


        WebElement message= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("action-confirmation")));

        String signUpMessage = message.getText();
        System.out.println("Message on screen: "+signUpMessage);


        driver.close();
    }
}
