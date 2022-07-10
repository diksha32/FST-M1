package LiveProjectAppium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity1 {

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
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Instantiation
        driver = new AndroidDriver(serverURL,options);
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void addTask(){

        for(int i=1;i<=3;i++){

            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Create new task")));
            driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));
            driver.findElement(AppiumBy.id("add_task_title")).
                    sendKeys("Add Appium Project "+i);
            driver.findElement(AppiumBy.id("add_task_done")).click();
        }

        System.out.println("Tasks added");

        List<WebElement> taskList = driver.findElements(
                AppiumBy.id("com.google.android.apps.tasks:id/task_name"));
        for(WebElement task: taskList){

            System.out.println("Tasks added are: "+task.getText());
        }

    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
