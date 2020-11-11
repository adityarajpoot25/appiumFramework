package practise.AppiumFramework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;




public class RealDeviceDemo extends base{

	
	@Test
	public void totalValidation() throws IOException, InterruptedException
	{
		//15 -General-Store.apk4.0
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.get("https://www.google.com");
	     driver.get("https://www.google.com");
	 	driver.findElement(By.name("q")).sendKeys("hello");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));




	}
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	

	
	
}
