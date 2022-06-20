package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity3Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        String footerText = driver.findElement(By.id("admin_options")).getText();
        System.out.println("FIRST FOOTER TEXT: "+footerText);


        driver.close();
    }
}
