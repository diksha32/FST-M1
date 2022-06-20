package liveProject;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CRM_Activity7Diksha {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));


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

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title=\"Additional Details\"]")));
         WebElement addDetails= driver.findElement(
                 By.xpath("//span[@title=\"Additional Details\"]"));
       addDetails.click();
         System.out.println("Clicked Additional details");


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"phone\"])[1]")));
        String numberText= driver.findElement(By.xpath("(//span[@class=\"phone\"])[1]")).getText();
        System.out.println("Mobile number on leads table: "+numberText);



        driver.close();
    }
}
