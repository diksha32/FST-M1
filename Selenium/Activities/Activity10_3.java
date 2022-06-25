package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class Activity10_3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/drag-drop");

        String text1 = driver.getTitle();
        System.out.println(text1);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest1 = driver.findElement(By.id("droppable"));
        WebElement dest2 = driver.findElement(By.id("dropzone2"));

        //Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);

      //Building a drag and drop action
        Action dragAndDrop = builder.clickAndHold(source)
                .moveToElement(dest1)
                .release(dest1)
                .build();

     //Performing the drag and drop action
        dragAndDrop.perform();

        String color = dest1.getCssValue("colour");
        Assert.assertEquals("green",color);

    }
}
