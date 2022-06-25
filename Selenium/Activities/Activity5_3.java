package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement textbox = driver.findElement(By.id("input-text"));
        Boolean cpresent = textbox.isEnabled();


        System.out.println("Textbox is enabled? "+cpresent);

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Checkbox is selected? "+textbox.isEnabled());
    }
}
