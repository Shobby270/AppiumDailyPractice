package appiumBasics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest 

{
	
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	
	@BeforeClass
	public void AppiumConfigure() throws MalformedURLException, URISyntaxException
	{
		//C://Users//Expert//AppData//Roaming//npm//node_modules//appium//build//lib//main.js
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Expert//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		//http://127.0.0.1:4723/
		
		URL url = new URI("http://127.0.0.1:4723").toURL();   // server URL
		
		
		// Setting up capabilities 
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Medium Phone API 31"); // Emulator
		options.setApp("D://Framework_Workspace//com.appium.project//src//test//java//appResources//ApiDemos-debug.apk");
		
		driver = new AndroidDriver(url,options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	public void longClickAction(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement) element).getId(),
				"duration", 2000));
	}
	
	public void scrollToEndAction2()
	{
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 1.0
			));
		}
		while(canScrollMore);
	}
	
	
	
	public void scrolltoElement1()
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}
	

}