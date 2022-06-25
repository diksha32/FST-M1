package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/tables");

        String text1 = driver.getTitle();
        System.out.println(text1);

        List<WebElement> tableCol = driver.findElements
                (By.xpath("//table[@class=\"ui celled striped table\"]//tbody//tr[1]//td"));

        System.out.println("Columns in Table 1: "+tableCol.size());

        List<WebElement> tableRow = driver.findElements
                (By.xpath("//table[@class=\"ui celled striped table\"]//tbody//tr"));

        System.out.println("Rows in Table 1: "+tableRow.size());

        List<WebElement> thirdRow = driver.findElements
                (By.xpath("//table[@class=\"ui celled striped table\"]//tbody//tr[3]//td"));

        System.out.println("Elements of third row");
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }


        WebElement oneValue = driver.findElement(
                By.xpath("//table[@class=\"ui celled striped table\"]//tbody//tr[2]//td[2]"));

        System.out.println("Element of Second row Second column: "+oneValue.getText());


        driver.close();
    }
}
