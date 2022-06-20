package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CRM_Activity9Diksha {


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
        //Leads
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        System.out.println("On Leads Page");

        wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//tr[@class=\"oddListRowS1\"]")));
        //Table
        List<WebElement> oddRowsName = driver.findElements
                (By.xpath("//tr[@class=\"oddListRowS1\"]//td[@field=\"name\"]"));
        List<WebElement> evenRowsName =driver.findElements
                (By.xpath("//tr[@class=\"evenListRowS1\"]//td[@field=\"name\"]"));
        List<WebElement> oddRowsUser = driver.findElements
                (By.xpath("//tr[@class=\"oddListRowS1\"]//td[@field=\"assigned_user_name\"]"));
        List<WebElement> evenRowsUser=driver.findElements
                (By.xpath("//tr[@class=\"evenListRowS1\"]//td[@field=\"assigned_user_name\"]"));

        for(int i=1;i<=5;i++){

            System.out.println("Odd row name "+i+": "+oddRowsName.get(i).getText());
            System.out.println("Odd row user "+i+": "+oddRowsUser.get(i).getText());
            System.out.println("Even row name "+i+": "+evenRowsName.get(i).getText());
            System.out.println("Even row user "+i+": "+evenRowsUser.get(i).getText());
        }




        driver.close();
    }
}
