package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement changeContent = driver.findElement
                (By.xpath("//button[contains(text(),\"Change Content\")]"));

        changeContent.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(text(),\"HELLO!\")]")));

        String hello = driver.findElement(By.xpath("//h1[contains(text(),\"HELLO!\")]")).getText();
        System.out.println("Message on screen: "+hello);


        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[contains(text(),\"I'm late!\")]")));

        String late = driver.findElement
                (By.xpath("//h3[contains(text(),\"I'm late!\")]")).getText();
        System.out.println("Message on screen now: "+late);

        driver.close();
    }
}
