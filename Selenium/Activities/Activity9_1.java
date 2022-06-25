package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_1{

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/selects");

        WebElement dropdown= driver.findElement(By.id("single-select"));

        Select select = new Select(driver.findElement(By.id("single-select")));
        select.selectByVisibleText("Option 2");
        System.out.println(dropdown.getText());
        select.selectByIndex(3);
        System.out.println(dropdown.getText());
        select.selectByValue("4");
        System.out.println(dropdown.getText());

        List<WebElement> options = driver.findElements(By.id("single-select"));
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }

        //Close browser
        driver.close();
    }

}
