package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");

        String text1 = driver.getTitle();
        System.out.println(text1);

        String thirdTitle = driver.findElement(By.id("third-header")).getText();
        System.out.println(thirdTitle);

        WebElement fifTitle= driver.findElement(By.xpath("//h5[@class=\"ui green header\"]"));
        String fifthTitle = fifTitle.getText();
        System.out.println(fifthTitle);
        String colour = fifTitle.getCssValue("colour");
        System.out.println(colour);

        String violetBttnClass=  driver.findElement(By.xpath
                ("//button[contains(text(),'Violet')]")).getAttribute("Class");
        System.out.println(violetBttnClass);

    }

}
