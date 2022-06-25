package Activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.PrintStream;

public class Activity10_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/input-events");

        String text1 = driver.getTitle();
        System.out.println(text1);

        //Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);
        //cube
        WebElement cube = driver.findElement(By.id("D3Cube"));

        builder.click(cube);
        WebElement cubeValue = driver.findElement(By.className("dice"));
        System.out.println("Value on left click: "+cubeValue.getText());

        builder.doubleClick(cube).perform();
        cubeValue = driver.findElement(By.className("dice"));
        System.out.println("Value on double click: "+cubeValue.getText());

        builder.contextClick(cube).perform();
        cubeValue = driver.findElement(By.className("dice"));
        System.out.println("Value on right click: "+cubeValue.getText());




        driver.close();
    }
}
