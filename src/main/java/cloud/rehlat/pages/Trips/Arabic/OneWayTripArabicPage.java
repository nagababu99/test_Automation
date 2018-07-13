package cloud.rehlat.pages.Trips.Arabic;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class OneWayTripArabicPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;
	String SelectedFromCity;
	String SelectedToCity;
	public OneWayTripArabicPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id = "radio_1")
	private WebElement radioOneWay;
	@FindBy(id = "autoFlyingFrom1")
	private WebElement txtFlyFrom;
	@FindBy(id = "autoFlyingTo1")
	private WebElement txtFlyTo;
	@FindBy(id = "Fromdated1")
	private WebElement btnDateFrom;
	@FindBy(xpath = "//div[@class='fa fa-chevron-left']")
	private WebElement dateIconBtnFrom;
	@FindBy(xpath = ".//*[@id='flightForm']/div/div/div/div/div[1]/div[2]//table/tbody/tr/td")
	private List<WebElement> allDates;
	@FindBy(id = "dropdownMenu1")
	private WebElement drpTraveler;

	@FindBy(css = "span.add")
	private WebElement clickAdultIncrement;
	@FindBy(xpath = "//div[2]/div/span/span[2]")
	private WebElement clickChildIncrement;
	@FindBy(xpath = "//div[3]/div/span/span[2]")
	private WebElement clickInfantsIncrement;
	@FindBy(linkText = "تم")
	private WebElement btnTravellerDone;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;
	@FindBy(xpath = "//ol/li[3]/span")
	private WebElement headerText;
	@FindBy(xpath = "//div[@class='col-sm-9 col-xs-7 resTitle dpNone pl0']/span[1]")
	private WebElement fromTextInBook;
	@FindBy(xpath = "//div[@class='col-sm-9 col-xs-7 resTitle dpNone pl0']/span[2]")
	private WebElement toTextInBook;
	@FindBy(linkText = "Price")
	private WebElement btnPrice;
	@FindBy(xpath = "(//a[contains(text(),'Low to High')])[2]")
	private WebElement priceLowToHigh;
	@FindBy(xpath = "(//a[contains(text(),'High to Low')])[2]")
	private WebElement priceHighToLow;
	
	

	public void enterFromCityAndToCity(Map<String, String> dataMap) throws InterruptedException {
		String fromCity = dataMap.get("fromCity");
		String toCity = dataMap.get("toCity");
		pageUtils.sendKeysAfterClearingElement(driver, txtFlyFrom, fromCity);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		txtFlyFrom.sendKeys(Keys.TAB);
		String userSelectFromValue=txtFlyFrom.getAttribute("value");
		String[] getTextFrom=DataUtils.splitString(userSelectFromValue, " ");
		 SelectedFromCity=getTextFrom[0];
		pageUtils.sendKeysAfterClearingElement(driver, txtFlyTo, toCity);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		txtFlyTo.sendKeys(Keys.TAB);
		String userSelectToValue=txtFlyTo.getAttribute("value");
		String[] getTextTo=DataUtils.splitString(userSelectToValue, " ");
		 SelectedToCity=getTextTo[0];

	}

	public void selectmonth() {
		pageUtils.clickElement(driver, btnDateFrom);
		for (int i = 0; i < 2; i++) {
			pageUtils.clickElement(driver, dateIconBtnFrom);
		}
	}

	public void selectDate() {
		List<WebElement> li = allDates;
		for (WebElement we : li) {
			String st = we.getText();
			if (st.equalsIgnoreCase(DataConstants.USER_SELECT_ARABIC_DATE)) {
				we.click();
				break;
			}
		}
	}

	public void selectTravellerDetails(Map<String, String> dataMap)
			throws InterruptedException {
		String numofAdults = dataMap.get("adults");
		String numofChilds = dataMap.get("childs");
		String numofInfants = dataMap.get("infant");
		pageUtils.clickElement(driver, drpTraveler);

		int Adult = Integer.parseInt(numofAdults);

		for (int i = 0; i < Adult - 1; i++) {
			pageUtils.clickElement(driver, clickAdultIncrement);
		}

		int Child = Integer.parseInt(numofChilds);

		for (int i = 0; i < Child; i++) {
			pageUtils.clickElement(driver, clickChildIncrement);
		}
		int infant = Integer.parseInt(numofInfants);

		for (int i = 0; i < infant; i++) {
			pageUtils.clickElement(driver, clickInfantsIncrement);
		}
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnTravellerDone);
	}

	public void clickSearch() throws InterruptedException {
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	}
	
	
	
	
	public boolean verifyText()
	{
		boolean status=false;
		pageUtils.isElementDisplayed(driver, headerText);
		String getText=pageUtils.getTextOfElement(driver, headerText);
		String[] Splitvalue=DataUtils.splitString(getText, " ");
		String FromText=Splitvalue[2];
		String ToText=Splitvalue[4];
		if(FromText.equals(SelectedFromCity))
		{
			System.out.println("FLIGHTS:USER SELECTED FROM VALUE AND BOOK NOW PAGE HEADER VALUE IS MATCHING");
			status=true;
			
		}
		else
		{
			Assert.assertTrue("FLIGHTS:USER SELECTED FROM VALUE AND BOOK NOW PAGE HEADER VALUE IS NOT MATCHING", status);	
			status=false;
		}
		if(ToText.equals(SelectedToCity))
		{
			System.out.println("FLIGHTS:USER SELECTED TO VALUE AND INSIDE BOOK NOW PAGE  VALUE IS MATCHING");
			status=true;
		}
		else
		{
			Assert.assertTrue("FLIGHTS:USER SELECTED TO VALUE AND BOOK NOW PAGE HEADER VALUE IS NOT MATCHING", status);	
			status=false;
		}
		String fromText=pageUtils.getTextOfElement(driver, fromTextInBook);
		String toText=pageUtils.getTextOfElement(driver, toTextInBook);
		if(fromText.equals(SelectedFromCity))
		{
			System.out.println("FLIGHTS:USER SELECTED FROM VALUE AND INSIDE BOOK NOW PAGE  VALUE IS MATCHING");
			status=true;
		}
		else
		{
			Assert.assertTrue("FLIGHTS:USER SELECTED FROM VALUE AND INSIDE BOOK NOW PAGE  VALUE IS NOT MATCHING", status);	
			status=false;
		}
		if(toText.equals(SelectedToCity))
		{
			System.out.println("FLIGHTS:USER SELECTED TO VALUE AND INSIDE BOOK NOW PAGE  VALUE IS MATCHING");
			status=true;
		}
		else
		{
			Assert.assertTrue("FLIGHTS:USER SELECTED TO VALUE AND INSIDE BOOK NOW PAGE  VALUE IS NOT MATCHING", status);
			status=false;
		}
		return status;
		
	}
	
	
	
	
}
