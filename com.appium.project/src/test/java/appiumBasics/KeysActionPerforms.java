package appiumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeysActionPerforms extends BaseTest

{
	@Test
	public void keyActions() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
		
		driver.findElement(By.id("android:id/edit")).sendKeys("shoaib-WiFi");   //android:id/edit
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(5000);
		
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}

}
