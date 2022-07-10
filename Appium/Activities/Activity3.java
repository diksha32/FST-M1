package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {

    AndroidDriver driver;

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
    public void sum(){

        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Add")).click();
        driver.findElement(AppiumBy.id("digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();
        String result= driver.findElement(AppiumBy.id
                ("com.coloros.calculator:id/calculator_frame")).getText();

        System.out.println(result);
    }

    @Test
    public void sub(){

        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Subtract")).click();
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();
        String result= driver.findElement(AppiumBy.id
                ("com.coloros.calculator:id/calculator_frame")).getText();

        System.out.println(result);
    }

    @Test
    public void multiply(){

        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();
        String result= driver.findElement(AppiumBy.id
                ("com.coloros.calculator:id/calculator_frame")).getText();

        System.out.println(result);
    }

    @Test
    public void divide(){

        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Divide")).click();
        driver.findElement(AppiumBy.id("digit_2")).click();
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
