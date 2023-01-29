package runPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class openDarazApp {
	
	static AppiumDriver<MobileElement> driver;
		
	public static void main(String[] args)
	{
		try {
			openDaraz();
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public static void openDaraz() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Huawei");
		cap.setCapability("udid", "");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "com.daraz.android");
		cap.setCapability("appActivity", "com.daraz.android.defaultIcon");
		cap.setCapability("enableMultiWindows", true);		
		
		 URL url= new URL("http://127.0.0.1:4723/wd/hub/");
		 driver = new AppiumDriver<MobileElement>(url,cap);
		 
		 System.out.println("Application Started...");
		 
		 //select language	
		 MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 el1.click();
		 
		 //skip
		 MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 el2.click();
		 
		// cancel location
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 //MobileElement el3 = (MobileElement) driver.findElementById("com.daraz.android:id/btn_trade_confirm_dialog_negative");
		 MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
		 //MobileElement eTest = (MobileElement) driver.findElementByClassName("android.widget.TextView");
		 //MobileElement eTest = (MobileElement) driver.findElementByLinkText("No");
		 el3.click();		 
		 System.out.println("cross executed");
		
		 //click account
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\r\n");
		 el7.click();
		 		 
		 //click setting by co-ordinates
		 	 
		 TouchAction touch = new TouchAction(driver)
		 	.tap(PointOption.point(1000, 152));
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 touch.perform();		 
		 
		 //click setting
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
			/*
			 * // id -- com.daraz.android:id/tv_settings
			 * 00000000-0000-0171-ffff-ffff00000047 //MobileElement setting =
			 * (MobileElement) driver.findElementsById("com.daraz.android:id/tv_settings");
			 * //MobileElement setting = (MobileElement) driver.findElementByXPath(
			 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]"
			 * ).findElementById("00000000-0000-0171-ffff-ffff00000047"); //MobileElement
			 * setting = (MobileElement)
			 * driver.findElementByClassName("android.widget.TextView").findElementsById(
			 * "com.daraz.android:id/tv_settings");
			 *  
			 */		 
		 		 
		 //click country
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //id -- com.daraz.android:id/selectedCountryIcon
		 MobileElement country = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Daraz\"]");
		 country.click();
		 
		//click pakistan
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 MobileElement pakRadioButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView");
		 pakRadioButton.click();
		 
		 //change country
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 //id-- android:id/button1
		 MobileElement change = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
		 change.click();
		 
		//change language
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 //id-- android:id/button1
		 MobileElement language = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
		 language.click();
		 
		 //closePopUp
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 MobileElement close = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]");
		 close.click();	 
		 	 
		 System.out.println("Application Closed....");
		 driver.quit();			 
				
		
	}

}
