package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Product_Page {


	public Product_Page(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);


	}



	@AndroidFindBy(xpath = "//*[@text='ADD TO CART']")
	public List<WebElement> addToCart;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement cart;
	
	



}
