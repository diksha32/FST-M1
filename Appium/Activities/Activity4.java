package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("realme X2");
        options.setAppPackage("com.android.contacts");
        options.setAppActivity(".PeopleActivityAlias");
        options.noReset();

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Instantiation
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void AddNewContact(){

        driver.findElement(AppiumBy.accessibilityId("New Contact")).click();
        driver.findElement(AppiumBy.xpath
                ("(//android.widget.EditText)[1]")).sendKeys("Aaditya Varma");
        driver.findElement(AppiumBy.xpath
                ("(//android.widget.EditText)[2]")).sendKeys("999148292");
        driver.findElement(AppiumBy.accessibilityId("Save")).click();

        String name= driver.findElement(AppiumBy.id("main_title")).getText();

        System.out.println(name);

    }


    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
