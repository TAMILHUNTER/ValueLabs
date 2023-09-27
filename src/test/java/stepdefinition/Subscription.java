package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import helper.SeleniumHelper;
import object_repository.ObjectsReporsitory;
import utils.DriverFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import io.cucumber.java.en.And;

public class Subscription {

	public static double Selected_Payment_Plan_Price;
	public static double Plan_Price_in_Cart;
	public static int ElementSize;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Subscription() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Verify User can be able to navigate to the Environment$")
	public static void Verify_User_can_be_able_to_navigate_to_the_Environment() throws InterruptedException {

		DriverFactory.driver.manage().deleteAllCookies();
		DriverFactory.driver.get(ConfigFileReader.getEnvironment());

	}

	@And("Verify User can be able to Change Language$")
	public static void Verify_User_can_be_able_to_Change_Language() throws InterruptedException {

		String Language = ConfigFileReader.getLanguage();
		String LanguageonScreen = ObjectsReporsitory.Language_btn.getText();
		if (Language.equals(LanguageonScreen)) {
			System.out.println("Changing User Preferred Language");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Language_btn));
			ObjectsReporsitory.Language_btn.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Language_btn));
		} else {
			System.out.println("Environment Landed on User Preferred Language");
		}
		System.out.println("Language has been set successfully");

	}

	@Then("Verify User can be able to select Country KSA")
	public static void verify_user_can_be_able_to_select_country_KSA() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Country_btn));
		ObjectsReporsitory.Country_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Country_KSA));
		ObjectsReporsitory.Country_KSA.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Country_Popup_Close));
//		ObjectsReporsitory.Country_Popup_Close.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Country_btn));
		System.out.println("Country Selected Successfully");

	}

	@Then("Verify User can be able to Verify Package Details Lite Plan")
	public void verify_user_can_be_able_to_verify_package_details_Lite_plan() throws InterruptedException {

		System.out.println("Lite Plan Price Details");
		System.out.println("_________________________");
		System.out.println("Plan : Lite - Price Details - " + ObjectsReporsitory.Plan_Lite_Price.getText());
//		System.out.println("Plan : Clasic - Price Details - " + ObjectsReporsitory.Plan_Classic_Price.getText());
//		System.out.println("Plan : Premium - Price Details - " + ObjectsReporsitory.Plan_Premium_Price.getText());

		System.out.println("Lite Plan Features Details");
		System.out.println("_________________________");

		int Package_Features_Count = ObjectsReporsitory.Plan_features_Count.size();

		for (int i = 1; i < Package_Features_Count; i++) {
			Actions action13425 = new Actions(DriverFactory.driver);
			action13425
					.moveToElement(DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")))
					.perform();

			System.out.println("Lite Package Feature : " + DriverFactory.driver.findElement(By.xpath(
					"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")).getText()
					+ " - "
					+ DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[3]"))
							.getText());
		}

	}

	@Then("Verify User can be able to Verify Package Details Classic Plan")
	public void verify_user_can_be_able_to_verify_package_details_Classic_plan() throws InterruptedException {
		System.out.println("Clasic Plan Price Details");
		System.out.println("_________________________");
		System.out.println("Plan : Clasic - Price Details - " + ObjectsReporsitory.Plan_Classic_Price.getText());
		System.out.println("Clasic Plan Features Details");
		System.out.println("_________________________");

		int Package_Features_Count = ObjectsReporsitory.Plan_features_Count.size();

		for (int i = 1; i < Package_Features_Count; i++) {
			Actions action13425 = new Actions(DriverFactory.driver);
			action13425
					.moveToElement(DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")))
					.perform();

			System.out.println("Lite Package Feature : " + DriverFactory.driver.findElement(By.xpath(
					"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")).getText()
					+ " - "
					+ DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[4]"))
							.getText());
		}
	}

	@Then("Verify User can be able to Verify Package Details Premium Plan")
	public void verify_user_can_be_able_to_verify_package_details_Premium_plan() throws InterruptedException {
		System.out.println("Premium Plan Price Details");
		System.out.println("_________________________");
		System.out.println("Plan : Premium - Price Details - " + ObjectsReporsitory.Plan_Classic_Price.getText());
		System.out.println("Premium Plan Features Details");
		System.out.println("_________________________");

		int Package_Features_Count = ObjectsReporsitory.Plan_features_Count.size();

		for (int i = 1; i < Package_Features_Count; i++) {
			Actions action13425 = new Actions(DriverFactory.driver);
			action13425
					.moveToElement(DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")))
					.perform();

			System.out.println("Lite Package Feature : " + DriverFactory.driver.findElement(By.xpath(
					"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[1]")).getText()
					+ " - "
					+ DriverFactory.driver.findElement(By.xpath(
							"(((//div[@class='plan-section'])//div[@class='plan-row'])[" + (i + 1) + "]//div)[5]"))
							.getText());
		}
	}

	@Then("Verify User can be able to Verify Addon Package Details for Lite Plan")
	public void verify_user_can_be_able_to_verify_Addon_package_details_for_Lite_plan() throws InterruptedException {

		System.out.println("Lite Plan AddOn Features Details");
		System.out.println("_________________________");

		int Add_on_Package_Features_Count = ObjectsReporsitory.Plan_Addon_features_Count.size();

		for (int j = 1; j < Add_on_Package_Features_Count; j++) {
//			Actions action134325 = new Actions(DriverFactory.driver);
//			action134325.moveToElement(ObjectsReporsitory.Plan_Addon_features_Count.get(j)).perform();

			System.out.println("Lite Plan Addon Package Feature : "
					+ ObjectsReporsitory.Plan_Addon_features_Count.get(j).getText() + " - "
					+ DriverFactory.driver.findElement(
							By.xpath("(((//div[@class='plan-section extensions'])//div[@class='plan-names'])[" + j
									+ "]//div[1])"))
							.getText());
		}
	}

	@Then("Verify User can be able to Verify Addon Package Details for Classic Plan")
	public void verify_user_can_be_able_to_verify_Addon_package_details_for_Classic_plan() throws InterruptedException {

		System.out.println("Classic Plan AddOn Features Details");
		System.out.println("_________________________");

		int Add_on_Package_Features_Count = ObjectsReporsitory.Plan_Addon_features_Count.size();

		for (int j = 1; j < Add_on_Package_Features_Count; j++) {

			System.out.println("Classic  Plan Addon Package Feature : "
					+ ObjectsReporsitory.Plan_Addon_features_Count.get(j).getText() + " - "
					+ DriverFactory.driver.findElement(
							By.xpath("(((//div[@class='plan-section extensions'])//div[@class='plan-names'])[" + j
									+ "]//div[2])"))
							.getText());
		}

	}

	@Then("Verify User can be able to Verify Addon Package Details for Premium Plan")
	public void verify_user_can_be_able_to_verify_Addon_package_details_for_Premium_plan() throws InterruptedException {

		System.out.println("Premium Plan AddOn Features Details");
		System.out.println("_________________________");

		int Add_on_Package_Features_Count = ObjectsReporsitory.Plan_Addon_features_Count.size();

		for (int j = 1; j < Add_on_Package_Features_Count; j++) {

			System.out.println("Premium  Plan Addon Package Feature : "
					+ ObjectsReporsitory.Plan_Addon_features_Count.get(j).getText() + " - "
					+ DriverFactory.driver.findElement(
							By.xpath("(((//div[@class='plan-section extensions'])//div[@class='plan-names'])[" + j
									+ "]//div[3])"))
							.getText());
		}

	}

	@Then("Verify User can be able to select Subscription package")
	public void verify_user_can_be_able_to_select_subscription_package() throws InterruptedException {

		Actions actionmove = new Actions(DriverFactory.driver);
		actionmove.moveToElement(ObjectsReporsitory.Plan_Lite_btn).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Plan_Lite_btn));
		Random rand4 = new Random();
		int Plan_Size = rand4.nextInt(ObjectsReporsitory.Plan_Count.size());
		ObjectsReporsitory.Plan_Count.get(Plan_Size).click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.PaymentMethod_Next_btn));
		System.out.println("Selected " + ObjectsReporsitory.Selected_Plan.getText());

	}

	@Then("Verify system displayes Subscription package price details correctly")
	public void verify_system_displayes_subscription_package_price_details_correctly() throws InterruptedException {

		Selected_Payment_Plan_Price = Double.parseDouble(ObjectsReporsitory.Selected_Plan_Price.getText());
		Plan_Price_in_Cart = Double.parseDouble(ObjectsReporsitory.Selected_Plan_Total_cart_Price.getText());
		System.out.println("Plan Price for Selected Payment Method : " + Selected_Payment_Plan_Price);
		System.out.println("Plan Price displayed in Cart : " + Plan_Price_in_Cart);
		if (Double.compare(Selected_Payment_Plan_Price, Plan_Price_in_Cart) == 0) {
			System.out.println("System Displays plan price correctly");
		} else {
			System.out.println("There is a mismatch in price details");
		}

	}

	@Then("Verify user can be able to choose Payment Method")
	public void verify_user_can_be_able_to_choose_payment_method() throws InterruptedException {

		Random rand5 = new Random();
		int PaymentMothod_Size = rand5.nextInt(ObjectsReporsitory.Payment_Method.size());
		ObjectsReporsitory.Payment_Method.get(PaymentMothod_Size).click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.PaymentMethod_Next_btn));
		System.out.println("Payment Method selected");
	}

	@Then("Verify system displayes Order Summery correctly")
	public void verify_system_displayes_order_summery_correctly() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.PaymentMethod_Next_btn));
		System.out.println("Selected " + ObjectsReporsitory.Selected_Plan.getText());
		System.out.println("Plan Price displayed in Cart : " + ObjectsReporsitory.Summery_Price.getText());
		System.out.println("Order Total Price : " + ObjectsReporsitory.Summery_order_total_price.getText());
	}

	@Then("Verify User can be able to view AddOn Package details")
	public void verify_user_can_be_able_to_add_view_on_package_details() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.PaymentMethod_Next_btn));
		ObjectsReporsitory.PaymentMethod_Next_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));

		Actions action11523 = new Actions(DriverFactory.driver);
		action11523.moveToElement(ObjectsReporsitory.AddOn_Plan_Details_Selection_first).perform();
		ObjectsReporsitory.AddOn_Plan_Details_Selection_first.click();

//		Random rand6 = new Random();
//		int AddonDetails_Size = rand6.nextInt(ObjectsReporsitory.AddOn_Plan_Details_Selection.size());
//		Actions action15 = new Actions(DriverFactory.driver);
//		action15.moveToElement(ObjectsReporsitory.AddOn_Plan_Details_Selection.get(AddonDetails_Size)).perform();
//		WebElement addonPackageElement_View = ObjectsReporsitory.AddOn_Plan_Details_Selection.get(AddonDetails_Size);
//		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
//				addonPackageElement_View);
//		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(addonPackageElement_View));
//		addonPackageElement_View.click();

//		wait.until(ExpectedConditions
//				.elementToBeClickable(ObjectsReporsitory.AddOn_Plan_Details_Selection.get(AddonDetails_Size)));
//		ObjectsReporsitory.AddOn_Plan_Details_Selection.get(AddonDetails_Size).click();

		System.out.println("Add On Plan Details : " + ObjectsReporsitory.AddOn_Plan_Details.getText());
		System.out.println("_____________________________________________________________________________");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.AddOn_Plan_Details_Close));
		ObjectsReporsitory.AddOn_Plan_Details_Close.click();

	}

	@Then("Verify User can be able to add AddOn Packages")
	public void verify_user_can_be_able_to_add_add_on_packages() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));
//		Random rand7 = new Random();
//		int AddonPlan_Size = rand7.nextInt(ObjectsReporsitory.AddOn_Plan_Selection.size());

//		WebElement addonPackageElement_Select = ObjectsReporsitory.AddOn_Plan_Selection.get(AddonPlan_Size);
//		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
//				addonPackageElement_Select);
//		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(addonPackageElement_Select));
//		addonPackageElement_Select.click();

//		Actions action115 = new Actions(DriverFactory.driver);
//		action115.moveToElement(ObjectsReporsitory.AddOn_Plan_Selection.get(AddonPlan_Size)).perform();
//		ObjectsReporsitory.AddOn_Plan_Selection.get(AddonPlan_Size).click();

		Actions action115 = new Actions(DriverFactory.driver);
		action115.moveToElement(ObjectsReporsitory.AddOn_Plan_Selection_first).perform();
		ObjectsReporsitory.AddOn_Plan_Selection_first.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));
		System.out.println("Addon Plan Has been Added to Subscription");
	}

	@Then("Verify system displayes Order Summery correctly after adding AddOn packages")
	public static void verify_system_displayes_order_summery_correctly_after_adding_add_on_packages()
			throws InterruptedException {

		int Summary_Count = ObjectsReporsitory.Plan_Summary.size();

		for (int k = 1; k < Summary_Count; k++) {

			System.out.println(ObjectsReporsitory.Plan_Summary.get(k).getText() + " - "
					+ ObjectsReporsitory.Plan_Price.get(k).getText());
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));
		System.out.println("Subscription Plan Summary details displayed correcttly");

	}

	@Then("Verify User can be able to change Payment Method")
	public void verify_user_can_be_able_to_change_payment_method() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));
		ObjectsReporsitory.Add_btn_AddonScreen.click();

		ElementSize = ObjectsReporsitory.Summary_mobileNumber.size();

		System.out.println("Element Size :" + ElementSize);
		if (ElementSize == 1) {

			System.out.println("Payment Method selected : STC");
			System.out.println("________________________________________________________");

//			Random rnd = new Random();
//			long number1 = rnd.nextInt(62332);
//			long number2 = rnd.nextInt(62326);

			ObjectsReporsitory.Summary_mobileNumber_input.sendKeys("8765432345");

//			ObjectsReporsitory.Summary_mobileNumber_input.sendKeys("" + number1 + number2);
		} else {

			ObjectsReporsitory.Summary_emailAddress_Input.click();
			ObjectsReporsitory.Summary_emailAddress_Input
					.sendKeys("" + RandomString.make(5) + "@" + RandomString.make(5) + ".com");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Summary_Password_Input));
			ObjectsReporsitory.Summary_Password_Input.click();
			ObjectsReporsitory.Summary_Password_Input.clear();
			ObjectsReporsitory.Summary_Password_Input.click();
			ObjectsReporsitory.Summary_Password_Input.sendKeys("" + RandomString.make(10));

		}

		WebElement btnFinalStepSubscribe = ObjectsReporsitory.btnFinalStepSubscribe;
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				btnFinalStepSubscribe);
		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnFinalStepSubscribe));
		System.out.println("Element Visible");

//		
//		WebElement Change_Payment_Method = ObjectsReporsitory.Change_Payment_Method;
//		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
//				Change_Payment_Method);
//		WebDriverWait wait2 = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
//		wait2.until(ExpectedConditions.elementToBeClickable(Change_Payment_Method));
//		System.out.println("Element Visible");
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Payment_Method));
//		ObjectsReporsitory.Change_Payment_Method.click();
//
//		Random rand50 = new Random();
//		int Change_PaymentMothod_Size = rand50.nextInt(ObjectsReporsitory.Change_payment_Method_options.size());
//		ObjectsReporsitory.Change_payment_Method_options.get(Change_PaymentMothod_Size).click();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Payment_method_submit));
//		ObjectsReporsitory.Change_Payment_method_submit.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Plan));
//		System.out.println("Payment Method Changed Successfully");

	}

	@Then("Verify system displayes Subscription package price details correctly after changing payment method")
	public void verify_system_displayes_subscription_package_price_details_correctly_after_changing_payment_method()
			throws InterruptedException {

		int Summary_Count = ObjectsReporsitory.Plan_Summary.size();

		for (int k = 1; k < Summary_Count; k++) {

			System.out.println(ObjectsReporsitory.Plan_Summary.get(k).getText() + " - "
					+ ObjectsReporsitory.Plan_Price.get(k).getText());
		}

	}

	@Then("Verify User can be able to change Subscription plan")
	public void verify_user_can_be_able_to_change_subscription_plan() throws InterruptedException {

//		WebElement Change_Plan = ObjectsReporsitory.Change_Plan;
//		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
//				Change_Plan);
//		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(Change_Plan));
//		Change_Plan.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Plan));

		ObjectsReporsitory.Change_Plan.click();

		Random rand501 = new Random();
		int Change_Plan_Size = rand501.nextInt(ObjectsReporsitory.Change_Plan_options.size());
		ObjectsReporsitory.Change_Plan_options.get(Change_Plan_Size).click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Plan_submit));
		ObjectsReporsitory.Change_Plan_submit.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Plan));
		System.out.println("Subscription Plan has been Changed Successfully");

	}

	@Then("Verify system displayes Subscription package price details correctly after changing plan")
	public void verify_system_displayes_subscription_package_price_details_correctly_after_changing_plan()
			throws InterruptedException {
		int Summary_Count = ObjectsReporsitory.Plan_Summary.size();

		for (int k = 1; k < Summary_Count; k++) {

			System.out.println(ObjectsReporsitory.Plan_Summary.get(k).getText() + " - "
					+ ObjectsReporsitory.Plan_Price.get(k).getText());
		}

	}

	@Then("Verify User can be able to add Addon packages on summary page")
	public void verify_user_can_be_able_to_add_addon_packages_on_summary_page() throws InterruptedException {

		WebElement addonPackageElement = ObjectsReporsitory.Add_Addon_Package;
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				addonPackageElement);
		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addonPackageElement));
		addonPackageElement.click();

		Random rand72 = new Random();
		int Add_AddonPlan_Size = rand72.nextInt(ObjectsReporsitory.Add_Addon_Package_Options.size());
		Actions action115 = new Actions(DriverFactory.driver);
		action115.moveToElement(ObjectsReporsitory.Add_Addon_Package_Options.get(Add_AddonPlan_Size)).perform();
		ObjectsReporsitory.Add_Addon_Package_Options.get(Add_AddonPlan_Size).click();
		Actions action11532 = new Actions(DriverFactory.driver);
		action11532.moveToElement(ObjectsReporsitory.Add_Addon_Package_close).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_Addon_Package_close));
		ObjectsReporsitory.Add_Addon_Package_close.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Plan));
		System.out.println("Addon Plan Has been Added to Subscription");
	}

	@Then("Verify system displayes Subscription package price details correctly after changing AddOn plan")
	public void verify_system_displayes_subscription_package_price_details_correctly_after_changing_AddOn_plan()
			throws InterruptedException {
		int Summary_Count = ObjectsReporsitory.Plan_Summary.size();

		for (int k = 1; k < Summary_Count; k++) {

			System.out.println(ObjectsReporsitory.Plan_Summary.get(k).getText() + " - "
					+ ObjectsReporsitory.Plan_Price.get(k).getText());
		}

	}

	@Then("Verify System gets user details for payment based on the payment method selected")
	public void verify_system_gets_user_details_for_payment_based_on_the_payment_method_selected()
			throws InterruptedException, IOException {
//Added
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Add_btn_AddonScreen));
//		ObjectsReporsitory.Add_btn_AddonScreen.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Change_Payment_Method));
//Added
		ElementSize = ObjectsReporsitory.Summary_mobileNumber.size();

		System.out.println("Element Size :" + ElementSize);
		if (ElementSize == 1) {

			System.out.println("Payment Method selected : STC");
			System.out.println("________________________________________________________");

		} else {
			System.out.println("Payment Method selected : VISA");
			System.out.println("________________________________________________________");

		}

		WebElement btnFinalStepSubscribe = ObjectsReporsitory.btnFinalStepSubscribe;
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				btnFinalStepSubscribe);
		WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnFinalStepSubscribe));
		System.out.println("Element Visible");
	}

	@And("Verify user can be able to proceed to Payment")
	public void verify_user_can_be_able_to_proceed_to_payment() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.btnFinalStepSubscribe));
		ObjectsReporsitory.btnFinalStepSubscribe.click();

		if (ElementSize > 0) {
			String firstWindowHandle = DriverFactory.driver.getWindowHandle();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Proceedpayment));
			ObjectsReporsitory.Proceedpayment.click();
			Thread.sleep(5000);
			Set<String> allWindowHandles = DriverFactory.driver.getWindowHandles();

			System.out.println("Title : " + DriverFactory.driver.getTitle());

			String[] handlesArray = allWindowHandles.toArray(new String[0]);

			int desiredWindowIndex = 1;
			DriverFactory.driver.switchTo().window(handlesArray[desiredWindowIndex]);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MySTC));
			System.out.println("Testing Completed");
			System.out.println("___________________________");
			DriverFactory.driver.switchTo().window(firstWindowHandle);

			System.out.println("Return to original Window");
			System.out.println("___________________________");
			System.out.println("Complete Payment By Login in STC Site");
			System.out.println("_________________________________________");
		} else {
			System.out.println("Payment Method Selected : VISA");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.cardholdername));
			ObjectsReporsitory.cardholdername.sendKeys(RandomString.make(10));

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.cardnumber));
			Random rnd = new Random();
			long number1 = rnd.nextInt(6234);
			long number2 = rnd.nextInt(4562);
			long number3 = rnd.nextInt(2232);
			long number4 = rnd.nextInt(6251);
			ObjectsReporsitory.cardnumber.sendKeys("" + number1 + number2 + number3 + number4);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.expirymonth));
			Random rnd2 = new Random();
			int number5 = rnd2.nextInt(99);
			ObjectsReporsitory.expirymonth.sendKeys("" + number5);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.expiryyear));
			Random rnd3 = new Random();
			int number6 = rnd3.nextInt(99);
			ObjectsReporsitory.expiryyear.sendKeys("" + number6);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.cardsecuritycode));
			Random rnd4 = new Random();
			int number7 = rnd4.nextInt(999);
			ObjectsReporsitory.cardsecuritycode.sendKeys("" + number7);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Payment_submit));
			ObjectsReporsitory.Payment_submit.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Payment_submit));
			System.out.println("Payment Response : " + ObjectsReporsitory.Payment_Status.getText());
			System.out.println("____________________________________________________");

		}
	}

}
