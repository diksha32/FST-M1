package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        String title = driver.getTitle();
        System.out.println("text using id: "+title);

        //firstname
        driver.findElement(By.id("firstName")).sendKeys("Diksha");
        driver.findElement(By.id("lastName")).sendKeys("Mittal");
        driver.findElement(By.id("email")).sendKeys("dikshamittal@gmail.com");
        driver.findElement(By.id("number")).sendKeys("78476298");
        driver.findElement(By.xpath("//input[@value=\"submit\"]")).click();
    }
}
