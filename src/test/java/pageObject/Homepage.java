package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage {
	
	public Homepage(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement nameField; 	
	
	@AndroidFindBy(xpath="//*[@text='Male']")
	public WebElement maleOption; 
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleOption; 
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement dropDownClick;
	
	@AndroidFindBy(xpath="//*[@text='Bangladesh']")
	public WebElement ChooseCountryBangladesh;
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsShop;
	
	//swipe
	
	
	
	
	

}
