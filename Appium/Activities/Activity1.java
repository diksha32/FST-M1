package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    //Driver Declaration
    AndroidDriver driver;

    //set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("realme X2");
        options.setAppPackage("com.coloros.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Instantiation
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void calculator(){

        driver.findElement(AppiumBy.id("digit_4")).click();
        driver.findElement(AppiumBy.accessibilityId("Add")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();
        String result= driver.findElement(AppiumBy.id
                ("com.coloros.calculator:id/calculator_frame")).getText();

        System.out.println(result);
    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
