package appiumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPressGesture extends BaseTest {
	
	
	
	
	@Test
	public void longPressAction() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement ele = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")"));
		
		longClickAction(ele); // static method created in BaseClass
		
		String actualValue = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		
		Assert.assertEquals(actualValue, "Sample menu");
		
		
	}

}
