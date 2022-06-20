package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity5Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

       //username
        driver.findElement(By.id("user_name")).sendKeys("admin");
        //password
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        //login
        driver.findElement(By.id("bigbutton")).click();

        String headerColor= driver.findElement(By.id("toolbar")).getCssValue("color");

        System.out.println("Homepage navigation menu colour: "+headerColor);



        driver.close();
    }
}
