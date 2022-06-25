package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String text1 = driver.getTitle();
        System.out.println(text1);

        driver.switchTo().frame(0);
        for (int i=0;i<2;i++){
            //System.out.println(i);
            driver.switchTo().frame(i);
            String heading1= driver.findElement(By.xpath("//div[@class=\"content\"]")).getText();
            System.out.println("Heading of Frame "+i+": "+heading1);
            driver.switchTo().parentFrame();
        }
        driver.close();
    }
}
