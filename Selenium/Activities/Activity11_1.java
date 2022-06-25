package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        String text1 = driver.getTitle();
        System.out.println(text1);

        //Simple Alert button
        WebElement simpleAlertBttn= driver.findElement(By.id("simple"));
        simpleAlertBttn.click();

        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);
        simpleAlert.accept();

        driver.close();

    }
}
