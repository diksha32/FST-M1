package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {


        public static void main(String[] args) throws InterruptedException {

            WebDriver driver= new FirefoxDriver();

            driver.get("https://www.training-support.net");

            String text1 = driver.findElement(By.id("about-link")).getText();
            System.out.println("text using id: "+text1);

            String text2 = driver.findElement(By.className("green")).getText();
            System.out.println("text using classname: "+text2);

            String text3 = driver.findElement(By.linkText("About Us")).getText();
            System.out.println("text using linktext: "+text3);

//        String text4 = driver.findElement(By.).getText();
//        System.out.println("text using id: "+text4);


            Thread.sleep(1000);
            driver.quit();
        }
    }


