package liveProject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity6Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        //username
        driver.findElement(By.id("user_name")).sendKeys("admin");
        //password
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        //login
        driver.findElement(By.id("bigbutton")).click();

        Boolean activitiesTab= driver.findElement(By.id("grouptab_3")).isDisplayed();
        Boolean expected=true;
        System.out.println(activitiesTab);

        Assert.assertEquals(expected,activitiesTab);


        driver.close();
    }
}
