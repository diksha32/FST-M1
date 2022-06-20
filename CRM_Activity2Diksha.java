package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Activity2Diksha {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");

        String imageUrl = driver.findElement(By.xpath("//img[@alt=\"SuiteCRM\"]")).getAttribute("src");
        System.out.println("URL OF IMAGE: "+imageUrl);


        driver.close();
    }
}
