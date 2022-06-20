package liveProject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity1Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals("SuiteCRM",title);

        driver.close();
    }
}
