package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.Checkout_Page;
import pageObject.Homepage;
import pageObject.Product_Page;
import utilities.UtilitiesMethod;

public class Generalstore_Ecommerce extends Base{

	@Test
	public void myfirstTest() throws IOException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver =capabilities();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Appium");
		Homepage home= new Homepage(driver);
		home.nameField.sendKeys("Abdul Hannan");
		Thread.sleep(2000);


		driver.hideKeyboard();

		//		home.femaleOption.click();
		home.maleOption.click();
		home.dropDownClick.click();

		UtilitiesMethod util= new UtilitiesMethod(driver);
		util.scrollToText("Bangladesh");
		Thread.sleep(2000);

		home.ChooseCountryBangladesh.click();
		Thread.sleep(2000);


		home.letsShop.click();

		Product_Page prod=new Product_Page(driver);
		prod.addToCart.get(1).click();
		Thread.sleep(1000);
		prod.addToCart.get(0).click();

		Thread.sleep(1000);
		//scrolldown
		util.scrollToText("PG 3");
		Thread.sleep(2000);

		//select randon product
		//prod.addToCart.get(0).click();

		//Thread.sleep(1000);

		prod.cart.click();
		Thread.sleep(1000);

		Checkout_Page cpage=new Checkout_Page(driver);

		//verify product price to total pay price
		double sum=0;
		
		
		
		int count=cpage.productList.size();
		System.out.println("count " + count);
		for (int i = 0; i < count; i++) {
			String amount1 = cpage.productList.get(i).getText();
			double amountValue1 = getAmount(amount1);
			sum = sum + amountValue1;
		}

		System.out.println("SumOfProducts individually: " + sum);

		String totalamount=cpage.totalPurchaseAmount.getText();
		double totalValue = getAmount(totalamount);
		System.out.println("Total payable amount  from the application: " + totalValue);


		Assert.assertEquals(sum, totalValue);

		//driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.quit();



	} 

	public static double getAmount(String value) {
		value = value.substring(1);
		double amountValue = Double.parseDouble(value);
		return amountValue;
	}




}
