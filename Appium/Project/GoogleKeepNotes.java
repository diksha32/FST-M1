package LiveProjectAppium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class GoogleKeepNotes {

    //Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    //set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("realme X2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Instantiation
        driver = new AndroidDriver(serverURL,options);
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void addTask(){

        //Click on Add note
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();

        //Adding heading
            wait.until(ExpectedConditions.elementToBeClickable
                    (AppiumBy.id("editable_title")));
            driver.findElement(AppiumBy.id("editable_title")).click();
            driver.findElement(AppiumBy.id("editable_title")).
                    sendKeys("Project Keep Notes");

            //Adding Note Description
        wait.until(ExpectedConditions.elementToBeClickable
                (AppiumBy.id("edit_note_text")));
        driver.findElement(AppiumBy.id("edit_note_text")).click();
        driver.findElement(AppiumBy.id("edit_note_text")).
                sendKeys("Open the Google Keep app.\n" +
                        "Click the Create New Note button to add a new Note.\n" +
                        "Add a title for the note and add a small description.\n" +
                        "Press the back button and make an assertion to ensure that the note was added.\n");

        System.out.println("Note added");

        //Click Back Button
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();

        //Back on main page
        String titleText= wait.until(ExpectedConditions.elementToBeClickable
                (AppiumBy.id("index_note_title"))).getText();

        System.out.println("title text="+titleText);
        Assert.assertEquals("Project Keep Notes",titleText);

    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
