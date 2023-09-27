package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectsReporsitory {

	// **Login Elements**

	@FindBy(how = How.ID, using = "translation-btn")
	public static WebElement Language_btn;

	@FindBy(how = How.LINK_TEXT, using = "العربية")
	public static WebElement Language_arabic;

	@FindBy(how = How.LINK_TEXT, using = "English")
	public static WebElement Language_English;

	@FindBy(how = How.ID, using = "country-name")
	public static WebElement Country_btn;

	@FindBy(how = How.ID, using = "bh-contry-lable")
	public static WebElement Country_bahrain;

	@FindBy(how = How.ID, using = "sa-contry-lable")
	public static WebElement Country_KSA;

	@FindBy(how = How.ID, using = "kw-contry-lable")
	public static WebElement Country_KW;

	@FindBy(how = How.ID, using = "country-poppup-close")
	public static WebElement Country_Popup_Close;

	@FindBy(how = How.ID, using = "name-lite")
	public static WebElement Plan_Name_Lite;

	@FindBy(how = How.ID, using = "name-classic")
	public static WebElement Plan_Name_Clasic;

	@FindBy(how = How.ID, using = "name-premium")
	public static WebElement Plan_Name_premium;

	@FindBy(how = How.XPATH, using = "(//div[@class='price'])[1]")
	public static WebElement Plan_Lite_Price;

	@FindBy(how = How.XPATH, using = "(//div[@class='price'])[2]")
	public static WebElement Plan_Classic_Price;

	@FindBy(how = How.XPATH, using = "(//div[@class='price'])[3]")
	public static WebElement Plan_Premium_Price;

	@FindBy(how = How.XPATH, using = "((//div[@class='plan-section'])//div[@class='plan-row'])")
	public static List<WebElement> Plan_features_Count;

	@FindBy(how = How.XPATH, using = "((//div[@class='plan-section extensions'])//div[@class='extensions-details'])")
	public static List<WebElement> Plan_Addon_features_Count;

	@FindBy(how = How.ID, using = "lite-selection")
	public static WebElement Plan_Lite_btn;

	@FindBy(how = How.ID, using = "classic-selection")
	public static WebElement Plan_Classic_btn;
	
	@FindBy(how = How.ID, using = "premium-selection")
	public static WebElement Plan_Premium_btn;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnChoosePaymentMethod']")
	public static WebElement PaymentMethod_Next_btn;

	@FindBy(how = How.XPATH, using = "(//span[@class='total-caption'])[1]")
	public static WebElement Selected_Plan;

	@FindBy(how = How.XPATH, using = "((//span[@class='price']//b)[1])")
	public static WebElement Selected_Plan_Price;

	@FindBy(how = How.XPATH, using = "(//span[@class='total-price']//b)[1]")
	public static WebElement Selected_Plan_Total_cart_Price;

	@FindBy(how = How.XPATH, using = "//div[@class='payment-option']")
	public static List<WebElement> Payment_Method;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='payment-option'])[1]")
	public static WebElement Payment_Method_STC;

	@FindBy(how = How.XPATH, using = "(//div[@class='payment-option'])[2]")
	public static WebElement Payment_Method_VISA;
	
	@FindBy(how = How.ID, using = "order-tier-price")
	public static WebElement Summery_Price;

	@FindBy(how = How.ID, using = "order-total-price")
	public static WebElement Summery_order_total_price;

	@FindBy(how = How.XPATH, using = "(//a[@class='plan-link'])")
	public static List<WebElement> Plan_Count;

	@FindBy(how = How.XPATH, using = "(//div[@id='country-selct']//div[@class='flag']//img)")
	public static List<WebElement> Country_Count;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='button inverse'])")
	public static List<WebElement> AddOn_Plan_Details_Selection;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='button inverse'])[1]")
	public static WebElement AddOn_Plan_Details_Selection_first;

	@FindBy(how = How.XPATH, using = "((//div[@class='details-holder']//p))")
	public static WebElement AddOn_Plan_Details;

	@FindBy(how = How.XPATH, using = "(//div[@class='close-icon'])")
	public static WebElement AddOn_Plan_Details_Close;

	@FindBy(how = How.XPATH, using = "(//label[@class='card-footer '])")
	public static List<WebElement> AddOn_Plan_Selection;
	
	@FindBy(how = How.XPATH, using = "(//label[@class='card-footer '])[1]")
	public static WebElement AddOn_Plan_Selection_first;

	@FindBy(how = How.XPATH, using = "//button[@id='btnChooseAddons']")
	public static WebElement Add_btn_AddonScreen;

	@FindBy(how = How.XPATH, using = "(//span[@class='total-caption'])")
	public static List<WebElement> Plan_Summary;

	@FindBy(how = How.XPATH, using = "(//span[@class='total-price'])")
	public static List<WebElement> Plan_Price;

	@FindBy(how = How.ID, using = "selected-payment-change-button")
	public static WebElement Change_Payment_Method;

	@FindBy(how = How.XPATH, using="/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[3]/div[1]/a")
	public static WebElement Change_Plan;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content']//div[@class='payment-option'])")
	public static List<WebElement> Change_payment_Method_options;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content']//button[text()='Cancel'])")
	public static WebElement Change_Payment_method_cancel;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content']//button[text()='Submit'])")
	public static WebElement Change_Payment_method_submit;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content scroll']//div[@class='payment-body'])")
	public static List<WebElement> Change_Plan_options;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content scroll']//button[text()='Cancel'])")
	public static WebElement Change_Plan_cancel;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content scroll']//button[text()='Submit'])")
	public static WebElement Change_Plan_submit;

	@FindBy(how = How.XPATH, using = "//div[@class='payment-body option-add']")
	public static WebElement Add_Addon_Package;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content']//label[@class='card-footer '])")
	public static List<WebElement> Add_Addon_Package_Options;

	@FindBy(how = How.XPATH, using = "(//div[@class='popup-content']//div[@class='close-icon'])")
	public static WebElement Add_Addon_Package_close;

	@FindBy(how = How.ID, using = "selected-payment-method-name")
	public static WebElement Selected_Payment_Method;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Mobile number']")
	public static List<WebElement> Summary_mobileNumber;

	@FindBy(how = How.XPATH, using="//h3[text()='Mobile number']")
	public static WebElement Summary_mobileNumber_input_header;
	
	@FindBy(how = How.XPATH, using="//h3[text()='Account Details']")
	public static WebElement Summary_Account_input_header;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Mobile number']")
	public static WebElement Summary_mobileNumber_input;

	@FindBy(how = How.XPATH, using="//input[@placeholder='Email Address']")
	public static WebElement Summary_emailAddress_Input;

	@FindBy(how = How.ID, using="readonlyPassword")
	public static WebElement Summary_Password_Input;
	
	@FindBy(how = How.XPATH, using="//button[@id='btnFinalStepSubscribe']")
	public static WebElement btnFinalStepSubscribe;
	
	@FindBy(how = How.ID, using="cancelURLRedirection")
	public static WebElement noChangeLandline;
	
	@FindBy(how = How.ID, using="proceedURLRedirection")
	public static WebElement Proceedpayment;
	
	@FindBy(how = How.XPATH, using="//li[@title='Personal']//a")
	public static WebElement MySTC;
	
	@FindBy(how = How.ID, using="card_holder_name")
	public static WebElement cardholdername;
	
	@FindBy(how = How.ID, using="card_number")
	public static WebElement cardnumber;
	
	@FindBy(how = How.ID, using="expiry_month")
	public static WebElement expirymonth;
	
	@FindBy(how = How.ID, using="expiry_year")
	public static WebElement expiryyear;
	
	@FindBy(how = How.ID, using="card_security_code")
	public static WebElement cardsecuritycode;
	
	@FindBy(how = How.LINK_TEXT, using="Cancel")
	public static WebElement cancel;
	
	@FindBy(how = How.XPATH, using="//button[@type='submit']")
	public static WebElement Payment_submit;
	
	@FindBy(how = How.CLASS_NAME, using="error")
	public static WebElement Payment_Status;
	
}
