package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement checkbox = driver.findElement(By.xpath("//label[@class=\"willDisappear\"]/preceding-sibling::*"));

        Boolean cpresent = checkbox.isDisplayed();
        System.out.println("Checkbox is displayed? "+cpresent);

        WebElement remCheckbox = driver.findElement(By.id("toggleCheckbox"));
        remCheckbox.click();

        System.out.println("Checkbox is displayed? "+checkbox.isDisplayed());

        remCheckbox.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class=\"willDisappear\"]/preceding-sibling::*")));

        System.out.println("Checkbox is displayed? "+checkbox.isDisplayed());

    }

}
