package Appium;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSettings {


    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();



        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_6");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability("appPackage","com.android.settings");
        capabilities.setCapability("appActivity","com.android.settings.Settings");
        capabilities.setCapability("noReset",true);

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        System.out.println("Settings Opened");
        Thread.sleep(7000);

        driver.findElementById("com.martianmode.applock:id/pin_button_2").click();
        driver.findElementById("com.martianmode.applock:id/pin_button_0").click();
        driver.findElementById("com.martianmode.applock:id/pin_button_0").click();
        driver.findElementById("com.martianmode.applock:id/pin_button_9").click();

        System.out.println("PIN entered succesfully");
        Thread.sleep(4000);

        driver.closeApp();
        System.out.println("App closed");
    }

}





