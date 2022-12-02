package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UtilitiesMethod {
	
	
	 AndroidDriver<AndroidElement> driver;

		public UtilitiesMethod(AndroidDriver<AndroidElement> driver) {
			this.driver=driver;
		}
		
		public void scrollToText(String value) 
		{
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));");
		}
	

}
 