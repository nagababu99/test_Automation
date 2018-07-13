package cloud.rehlat.pages.engine.arabic;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.pages.Accounts.GmailPage;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class FlightLoginPageArabic {
	
	private WebDriver driver;
	private PageUtils pageUtils;
	
	public FlightLoginPageArabic(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	@FindBy(linkText="رحلات جوية")
	private  WebElement getText;
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="تسجيل الدخول")
	private  WebElement btnSignIn;
	
	@FindBy(css="#identifierId")
	private WebElement txtUsername;
	@FindBy(xpath="//div[@id='identifierNext']/div[2]")
	private WebElement btnNextuser;
	@FindBy(css="input[name='password']")
	private WebElement txtPassword;
	@FindBy(xpath="//div[@id='passwordNext']/div[2]")
	private WebElement btnNextpass;
	
	
	
	/**
	 * This method is used to enter the login credentials of the user on Engine
	 * @param dataMap
	 * @throws InterruptedException 
	 */
	public void enterCredentials(Map<String, String> dataMap) throws InterruptedException {
		String userRole = dataMap.get("userRole");
		String loginType = dataMap.get("loginType");
		String username = TestDataUtils.getUsernameForRole(userRole, loginType);
		String password = TestDataUtils.getPasswordForRole(userRole, loginType);
		//pageUtils.waitForElementToLoad(driver, txtUsername);
		//pageUtils.waitForElementToLoad(driver, txtPassword);
		pageUtils.sendKeysAfterClearingElement(driver, txtUsername, username);
		pageUtils.clickElement(driver, btnNextuser);
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, password);
		pageUtils.clickElement(driver, btnNextpass);
	}
	
	public  FlightNavigationArabic LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
		return new FlightNavigationArabic(driver) ;
	}
	public  FlightNavigationArabic clicksignbtn() throws InterruptedException {
		pageUtils.clickElement(driver, btnSignIn);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		return new FlightNavigationArabic(driver) ;
		
	}
	public  FlightNavigationArabic Homepage() {
		pageUtils.getTextOfElement(driver, getText);
		return new FlightNavigationArabic(driver) ;
	}
	
	
}
