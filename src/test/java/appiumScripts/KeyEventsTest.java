package appiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventsTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
	DesiredCapabilities	cap= new DesiredCapabilities();
		
	    cap.setCapability("deviceName", "443418ec");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
			
		// we need to provide the path of Server to the script
		// http://127.0.0.1:4723/wd/hub
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		// click on search here test box
		
		driver.findElementByXPath("//android.widget.TextView[@text='Search here']").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("N");
		
		// Key Events to press on kypad of the device
		
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		
		driver.pressKey(new KeyEvent(AndroidKey.D));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));		
		

	}

}
