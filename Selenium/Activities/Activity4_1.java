package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();

        String title = driver.getTitle();
        System.out.println(title);
    }
}
