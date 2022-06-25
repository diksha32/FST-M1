package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement checkbox = driver.findElement(By.xpath("//label[@class=\"willDisappear\"]/preceding-sibling::*"));
        Boolean cpresent = checkbox.isSelected();

        System.out.println("Checkbox is selected? "+cpresent);

        checkbox.click();

        System.out.println("Checkbox is selected? "+checkbox.isSelected());
    }
}
