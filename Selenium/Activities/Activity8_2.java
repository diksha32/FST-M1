package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/tables");

        String text1 = driver.getTitle();
        System.out.println(text1);

        List<WebElement> tableCol = driver.findElements
                (By.xpath("//table[@id=\"sortableTable\"]//tbody//tr[1]//td"));

        System.out.println("Columns in Table 2: "+tableCol.size());

        List<WebElement> tableRow = driver.findElements
                (By.xpath("//table[@id='sortableTable']/tbody/tr"));

        System.out.println("Rows in Table 2: "+tableRow.size());

        WebElement oneValue = driver.findElement(
                By.xpath("//table[@id='sortableTable']/tbody/tr[2]//td[2]"));

        System.out.println("Element of Second row Second column: "+oneValue.getText());

        WebElement firstHeading = driver.findElement(
                By.xpath("//table[@id='sortableTable']//thead//tr//th[1]"));
        firstHeading.click();

        WebElement oneValueAgain = driver.findElement(
                By.xpath("//table[@id='sortableTable']/tbody/tr[2]//td[2]"));

        System.out.println("Element of Second row Second column: "+oneValueAgain.getText());

        System.out.println("Elements of footer");
        List<WebElement> footer = driver.findElements
                (By.xpath("//table[@id='sortableTable']//tfoot//tr//th"));

        for(WebElement cellValue : footer) {
            System.out.println("Cell Value: " + cellValue.getText());
        }


        driver.close();
    }
}
