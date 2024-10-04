package appiumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LandscapeScreenDemo extends BaseTest

{
	@Test
	public void screenRotate() 
	{
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
		
		driver.findElement(By.id("android:id/edit")).sendKeys("shoaib-WiFi");   //android:id/edit
		driver.findElement(By.id("android:id/button1")).click();
		
	}

}
