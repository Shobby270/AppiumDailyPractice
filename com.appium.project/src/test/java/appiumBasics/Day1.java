package appiumBasics;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Day1 extends BaseTest

{
	@Test
	public void setWiFiName() throws MalformedURLException, URISyntaxException
	{
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(1)")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("shoaib");
		driver.findElement(By.id("android:id/button1")).click();
		
	}

}
