package appiumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeGesture extends BaseTest {

	@Test
	public void swipeTest() {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement ele = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		String attributeValueT = ele.getAttribute("focusable");
		Assert.assertEquals(attributeValueT, "true");
		
		
		//Created Generic method For swipe Action in BaseTest
		/*((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele)
				.getId(),
				"direction","left",
				"percent",0.25));*/
		swipeAction(ele,"left"); // generic method for swipAction
		String attributeValueF = ele.getAttribute("focusable");
		Assert.assertEquals(attributeValueF, "false");
		
		

	}

}
