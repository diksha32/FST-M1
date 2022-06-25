package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement signIn = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
        Actions action = new Actions(driver);
        action.moveToElement(signIn).pause(Duration.ofSeconds(2)).perform();
        String tooltip = signIn.getAttribute("data-tooltip");
        System.out.println("Tooltip text: "+tooltip);

        signIn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        //Find username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String signInText= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Sign In text: "+signInText);

        driver.close();
    }
}
