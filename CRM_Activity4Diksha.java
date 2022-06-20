package liveProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity4Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        String homePage= driver.getTitle();
        System.out.println("Homepage title: "+homePage);

        Assert.assertEquals("SuiteCRM",homePage);


        driver.close();
    }
}
