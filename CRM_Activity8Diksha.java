package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CRM_Activity8Diksha {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://alchemy.hguy.co/crm/");

        //username
        driver.findElement(By.id("user_name")).sendKeys("admin");
        //password
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        //login
        driver.findElement(By.id("bigbutton")).click();
        //Sales
        driver.findElement(By.id("grouptab_0")).click();
        //Accounts
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        System.out.println("On Accounts Page");

        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//tr[@class=\"oddListRowS1\"]")));
        //Table
        List<WebElement> oddRows = driver.findElements
                (By.xpath("//tr[@class=\"oddListRowS1\"]//td[@field=\"name\"]"));
        for(int i=1;i<=5;i++){

            System.out.println("Odd row number "+i+": "+oddRows.get(i).getText());
        }


        driver.close();
    }
}
