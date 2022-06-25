package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String text1 = driver.getTitle();
        System.out.println(text1);

        //Frame 1
        driver.switchTo().frame(0);
        String heading1= driver.findElement(By.xpath("//div[@class=\"content\"]")).getText();
        WebElement button1 = driver.findElement(By.id("actionButton"));
        String bttn1Text= button1.getText();
        String bttn1Color= button1.getCssValue("color");

        System.out.println("Heading of Frame 1: "+heading1);
        System.out.println("Text of Button 1: "+bttn1Text);
        System.out.println("Colour of Button 1: "+bttn1Color);

        button1.click();

        button1 = driver.findElement(By.id("actionButton"));
        String bttn1TextAfterClick= button1.getText();
        String bttn1ColorAfterClick= button1.getCssValue("color");
        System.out.println("Text of Button 1: "+bttn1TextAfterClick);
        System.out.println("Colour of Button 1: "+bttn1ColorAfterClick);

        driver.switchTo().parentFrame();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        //Frame 2
        driver.switchTo().frame(1);
        String heading2= driver.findElement(By.xpath("//div[@class=\"content\"]")).getText();
        WebElement button2 = driver.findElement(By.id("actionButton"));
        String bttn2Text= button2.getText();
        String bttn2Color= button2.getCssValue("color");

        System.out.println("Heading of Frame 2: "+heading2);
        System.out.println("Text of Button 2: "+bttn2Text);
        System.out.println("Colour of Button 2: "+bttn2Color);

        button2.click();

        button2 = driver.findElement(By.id("actionButton"));
        String bttn2TextAfterClick= button2.getText();
        String bttn2ColorAfterClick= button2.getCssValue("color");
        System.out.println("Text of Button 2: "+bttn2TextAfterClick);
        System.out.println("Colour of Button 2: "+bttn2ColorAfterClick);

        driver.close();
    }
}
