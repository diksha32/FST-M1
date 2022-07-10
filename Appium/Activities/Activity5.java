package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity5 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("realme X2");
        options.setAppPackage("com.android.mms");
        options.setAppActivity(".ui.ConversationList");
        options.noReset();

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Instantiation
        driver = new AndroidDriver(serverURL,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void AddNewContact(){

        driver.findElement(AppiumBy.id("color_floating_button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated
                (AppiumBy.id("recipient_text_view")));
        driver.findElement(AppiumBy.id("recipient_text_view")).sendKeys("9665229614");
        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));

        driver.findElement(AppiumBy.id("compose_message_text")).
                sendKeys("Test program");

        driver.findElement(AppiumBy.accessibilityId("Send message")).click();



    }


    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
