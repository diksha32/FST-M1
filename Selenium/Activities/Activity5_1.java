package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement checkbox = driver.findElement(By.xpath("//label[@class=\"willDisappear\"]"));
        Boolean cpresent = checkbox.isDisplayed();

        System.out.println("Checkbox is present? "+cpresent);

        WebElement remCheckbox = driver.findElement(By.id("toggleCheckbox"));
        remCheckbox.click();

        System.out.println("Checkbox is present? "+checkbox.isDisplayed());




    }
}
