package appiumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollGesture extends BaseTest {
	
	
	
	
	@Test(enabled = true)
	public void scrollGestureActMethod1() {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
			// for Above method created generic utility in BaseTest
		scrolltoElement1();
		
	}
	
	
	@Test(enabled = false)
	public void scrollGestureActMethod2() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		// by using Do while will scroll down till condition false
//		boolean canScrollMore;
//		do
//		{
//		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 200, "height", 200,
//			    "direction", "down",
//			    "percent", 1.0
//			));
//		}
//		while(canScrollMore);
		
		// for above code created Generic utility In BaseTest
		
		scrollToEndAction2();
	}


}
