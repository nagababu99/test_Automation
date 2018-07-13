package cloud.rehlat.pages.Trips;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;
import cloud.rehlat.constants.common.DataConstants;
public class TravellerInformationPage {
	public WebDriver driver;
	private PageUtils pageUtils;

	public TravellerInformationPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	
	@FindBy(id = "countries_title")
	private WebElement btndrpClick;
	@FindBy(xpath = "//li[@class='enabled _msddli_']/span")
	private List<WebElement> drpCountry;
	@FindBy(id = "PhonenumberTraveller")
	private WebElement txtPhoneNumber;
	@FindBy(css = "#btnMakepayment")
	private WebElement btnPaySecurely;
	
	// Adult 1 with passport
	@FindBy(css = "select[name=\"Pax[0].Gender\"]")
	private WebElement drpAdultG1;
	@FindBy(css = "#Adult_FirstName1")
	private WebElement txtAdultfirstName1;
	@FindBy(css = "#Adult_LastName1")
	private WebElement txtAdultLastName1;
	@FindBy(css = "#AdultDate0")
	private WebElement drpAdultDate1;
	@FindBy(css = "#AdultMonth0")
	private WebElement drpAdultMonth1;
	@FindBy(css = "#AdultYear0")
	private WebElement drpAdultYear1;
	@FindBy(css = "input[name=\"Pax[0].PassportNo\"]")
	private WebElement txtAdultPassportNum1;
	@FindBy(css = "#Adult_Nationality_0")
	private WebElement drpAdultnationality1;
	@FindBy(css = "#Adult_IssuingCountryCode_0")
	private WebElement drpAdultIssuing1;
	@FindBy(css = "#PassAdultDate0")
	private WebElement drpAdultExpDate1;
	@FindBy(css = "#PassAdultMonth0")
	private WebElement drpAdultExpMonth1;
	@FindBy(css = "#PassAdultYear0")
	private WebElement drpAdultExpYear1;
	// Adult 2 with passport
	@FindBy(css = "select[name=\"Pax[1].Gender\"]")
	private WebElement drpAdultG2;
	@FindBy(css = "#Adult_FirstName2")
	private WebElement txtAdultfirstName2;
	@FindBy(css = "#Adult_LastName2")
	private WebElement txtAdultLastName2;
	@FindBy(css = "#AdultDate1")
	private WebElement drpAdultDate2;
	@FindBy(css = "#AdultMonth1")
	private WebElement drpAdultMonth2;
	@FindBy(css = "#AdultYear1")
	private WebElement drpAdultYear2;
	@FindBy(css = "input[name=\"Pax[1].PassportNo\"]")
	private WebElement txtAdultPassportNum2;
	@FindBy(css = "#Adult_Nationality_1")
	private WebElement drpAdultnationality2;
	@FindBy(css = "#Adult_IssuingCountryCode_1")
	private WebElement drpAdultIssuing2;
	@FindBy(css = "#PassAdultDate1")
	private WebElement drpAdultExpDate2;
	@FindBy(css = "#PassAdultMonth1")
	private WebElement drpAdultExpMonth2;
	@FindBy(css = "#PassAdultYear1")
	private WebElement drpAdultExpYear2;

	// Adult 3 with passport
	@FindBy(css = "select[name=\"Pax[2].Gender\"]")
	private WebElement drpAdultG3;
	@FindBy(css = "#Adult_FirstName3")
	private WebElement txtAdultfirstName3;
	@FindBy(css = "#Adult_LastName3")
	private WebElement txtAdultLastName3;
	@FindBy(css = "#AdultDate2")
	private WebElement drpAdultDate3;
	@FindBy(css = "#AdultMonth2")
	private WebElement drpAdultMonth3;
	@FindBy(css = "#AdultYear2")
	private WebElement drpAdultYear3;
	@FindBy(css = "input[name=\"Pax[2].PassportNo\"]")
	private WebElement txtAdultPassportNum3;
	@FindBy(css = "#Adult_Nationality_2")
	private WebElement drpAdultnationality3;
	@FindBy(css = "#Adult_IssuingCountryCode_2")
	private WebElement drpAdultIssuing3;
	@FindBy(css = "#PassAdultDate2")
	private WebElement drpAdultExpDate3;
	@FindBy(css = "#PassAdultMonth2")
	private WebElement drpAdultExpMonth3;
	@FindBy(css = "#PassAdultYear2")
	private WebElement drpAdultExpYear3;

	// Adult 4 with passport
	@FindBy(css = "select[name=\"Pax[3].Gender\"]")
	private WebElement drpAdultG4;
	@FindBy(css = "#Adult_FirstName4")
	private WebElement txtAdultfirstName4;
	@FindBy(css = "#Adult_LastName4")
	private WebElement txtAdultLastName4;
	@FindBy(css = "#AdultDate3")
	private WebElement drpAdultDate4;
	@FindBy(css = "#AdultMonth3")
	private WebElement drpAdultMonth4;
	@FindBy(css = "#AdultYear3")
	private WebElement drpAdultYear4;
	@FindBy(css = "input[name=\"Pax[3].PassportNo\"]")
	private WebElement txtAdultPassportNum4;
	@FindBy(css = "#Adult_Nationality_3")
	private WebElement drpAdultnationality4;
	@FindBy(css = "#Adult_IssuingCountryCode_3")
	private WebElement drpAdultIssuing4;
	@FindBy(css = "#PassAdultDate3")
	private WebElement drpAdultExpDate4;
	@FindBy(css = "#PassAdultMonth3")
	private WebElement drpAdultExpMonth4;
	@FindBy(css = "#PassAdultYear3")
	private WebElement drpAdultExpYear4;

	// Adult 5 with passport
	@FindBy(css = "select[name=\"Pax[4].Gender\"]")
	private WebElement drpAdultG5;
	@FindBy(css = "#Adult_FirstName5")
	private WebElement txtAdultfirstName5;
	@FindBy(css = "#Adult_LastName5")
	private WebElement txtAdultLastName5;
	@FindBy(css = "#AdultDate4")
	private WebElement drpAdultDate5;
	@FindBy(css = "#AdultMonth4")
	private WebElement drpAdultMonth5;
	@FindBy(css = "#AdultYear4")
	private WebElement drpAdultYear5;
	@FindBy(css = "input[name=\"Pax[4].PassportNo\"]")
	private WebElement txtAdultPassportNum5;
	@FindBy(css = "#Adult_Nationality_4")
	private WebElement drpAdultnationality5;
	@FindBy(css = "#Adult_IssuingCountryCode_4")
	private WebElement drpAdultIssuing5;
	@FindBy(css = "#PassAdultDate4")
	private WebElement drpAdultExpDate5;
	@FindBy(css = "#PassAdultMonth4")
	private WebElement drpAdultExpMonth5;
	@FindBy(css = "#PassAdultYear4")
	private WebElement drpAdultExpYear5;

	// Adult 6 with passport
	@FindBy(css = "select[name=\"Pax[5].Gender\"]")
	private WebElement drpAdultG6;
	@FindBy(css = "#Adult_FirstName6")
	private WebElement txtAdultfirstName6;
	@FindBy(css = "#Adult_LastName6")
	private WebElement txtAdultLastName6;
	@FindBy(css = "#AdultDate5")
	private WebElement drpAdultDate6;
	@FindBy(css = "#AdultMonth5")
	private WebElement drpAdultMonth6;
	@FindBy(css = "#AdultYear5")
	private WebElement drpAdultYear6;
	@FindBy(css = "input[name=\"Pax[5].PassportNo\"]")
	private WebElement txtAdultPassportNum6;
	@FindBy(css = "#Adult_Nationality_5")
	private WebElement drpAdultnationality6;
	@FindBy(css = "#Adult_IssuingCountryCode_5")
	private WebElement drpAdultIssuing6;
	@FindBy(css = "#PassAdultDate5")
	private WebElement drpAdultExpDate6;
	@FindBy(css = "#PassAdultMonth5")
	private WebElement drpAdultExpMonth6;
	@FindBy(css = "#PassAdultYear5")
	private WebElement drpAdultExpYear6;

	// Adult 7 with passport
	@FindBy(css = "select[name=\"Pax[6].Gender\"]")
	private WebElement drpAdultG7;
	@FindBy(css = "#Adult_FirstName7")
	private WebElement txtAdultfirstName7;
	@FindBy(css = "#Adult_LastName7")
	private WebElement txtAdultLastName7;
	@FindBy(css = "#AdultDate6")
	private WebElement drpAdultDate7;
	@FindBy(css = "#AdultMonth6")
	private WebElement drpAdultMonth7;
	@FindBy(css = "#AdultYear6")
	private WebElement drpAdultYear7;
	@FindBy(css = "input[name=\"Pax[6].PassportNo\"]")
	private WebElement txtAdultPassportNum7;
	@FindBy(css = "#Adult_Nationality_6")
	private WebElement drpAdultnationality7;
	@FindBy(css = "#Adult_IssuingCountryCode_6")
	private WebElement drpAdultIssuing7;
	@FindBy(css = "#PassAdultDate6")
	private WebElement drpAdultExpDate7;
	@FindBy(css = "#PassAdultMonth6")
	private WebElement drpAdultExpMonth7;
	@FindBy(css = "#PassAdultYear6")
	private WebElement drpAdultExpYear7;

	// Adult 8 with passport
	@FindBy(css = "select[name=\"Pax[7].Gender\"]")
	private WebElement drpAdultG8;
	@FindBy(css = "#Adult_FirstName8")
	private WebElement txtAdultfirstName8;
	@FindBy(css = "#Adult_LastName8")
	private WebElement txtAdultLastName8;
	@FindBy(css = "#AdultDate7")
	private WebElement drpAdultDate8;
	@FindBy(css = "#AdultMonth7")
	private WebElement drpAdultMonth8;
	@FindBy(css = "#AdultYear7")
	private WebElement drpAdultYear8;
	@FindBy(css = "input[name=\"Pax[7].PassportNo\"]")
	private WebElement txtAdultPassportNum8;
	@FindBy(css = "#Adult_Nationality_7")
	private WebElement drpAdultnationality8;
	@FindBy(css = "#Adult_IssuingCountryCode_7")
	private WebElement drpAdultIssuing8;
	@FindBy(css = "#PassAdultDate7")
	private WebElement drpAdultExpDate8;
	@FindBy(css = "#PassAdultMonth7")
	private WebElement drpAdultExpMonth8;
	@FindBy(css = "#PassAdultYear7")
	private WebElement drpAdultExpYear8;

	// Adult 9 with passport
	@FindBy(css = "select[name=\"Pax[8].Gender\"]")
	private WebElement drpAdultG9;
	@FindBy(css = "#Adult_FirstName9")
	private WebElement txtAdultfirstName9;
	@FindBy(css = "#Adult_LastName9")
	private WebElement txtAdultLastName9;
	@FindBy(css = "#AdultDate8")
	private WebElement drpAdultDate9;
	@FindBy(css = "#AdultMonth8")
	private WebElement drpAdultMonth9;
	@FindBy(css = "#AdultYear8")
	private WebElement drpAdultYear9;
	@FindBy(css = "input[name=\"Pax[8].PassportNo\"]")
	private WebElement txtAdultPassportNum9;
	@FindBy(css = "#Adult_Nationality_8")
	private WebElement drpAdultnationality9;
	@FindBy(css = "#Adult_IssuingCountryCode_8")
	private WebElement drpAdultIssuing9;
	@FindBy(css = "#PassAdultDate8")
	private WebElement drpAdultExpDate9;
	@FindBy(css = "#PassAdultMonth8")
	private WebElement drpAdultExpMonth9;
	@FindBy(css = "#PassAdultYear8")
	private WebElement drpAdultExpYear9;

	// Child 1 with Passport

	@FindBy(id = "Child_Gender1")
	private WebElement drpChildG1;
	@FindBy(id = "Child_FirstName1")
	private WebElement txtChildFirstName1;
	@FindBy(id = "Child_MiddleName1")
	private WebElement txtChildMiddleName1;
	@FindBy(id = "Child_LastName1")
	private WebElement txtChildLastName1;
	@FindBy(id = "ChildDate1")
	private WebElement drpChildDate1;
	@FindBy(id = "ChildMonth1")
	private WebElement drpChildMonth1;
	@FindBy(id = "ChildYear1")
	private WebElement drpChildYear1;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtChildPassportNum1;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpChildnationality1;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpChildIssuing1;
	@FindBy(id = "PassChildDate1")
	private WebElement drpChildExpDate1;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpChildExpMonth1;
	@FindBy(id = "PasschildYear1")
	private WebElement drpChildExpYear1;

	// Child 2 with Passport

	@FindBy(id = "Child_Gender2")
	private WebElement drpChildG2;
	@FindBy(id = "Child_FirstName2")
	private WebElement txtChildFirstName2;
	@FindBy(id = "Child_MiddleName2")
	private WebElement txtChildMiddleName2;
	@FindBy(id = "Child_LastName2")
	private WebElement txtChildLastName2;
	@FindBy(id = "ChildDate2")
	private WebElement drpChildDate2;
	@FindBy(id = "ChildMonth2")
	private WebElement drpChildMonth2;
	@FindBy(id = "ChildYear2")
	private WebElement drpChildYear2;
	@FindBy(xpath = "//div[@id='ChildPass_1']/div[2]/div/input")
	private WebElement txtChildPassportNum2;
	@FindBy(id = "Child_Nationality_1")
	private WebElement drpChildnationality2;
	@FindBy(id = "Child_IssuingCountryCode_1")
	private WebElement drpChildIssuing2;
	@FindBy(id = "PassChildDate2")
	private WebElement drpChildExpDate2;
	@FindBy(id = "PassChildMonth2")
	private WebElement drpChildExpMonth2;
	@FindBy(id = "PasschildYear2")
	private WebElement drpChildExpYear2;

	// Child 3 with Passport

	@FindBy(id = "Child_Gender3")
	private WebElement drpChildG3;
	@FindBy(id = "Child_FirstName3")
	private WebElement txtChildFirstName3;
	@FindBy(id = "Child_MiddleName3")
	private WebElement txtChildMiddleName3;
	@FindBy(id = "Child_LastName3")
	private WebElement txtChildLastName3;
	@FindBy(id = "ChildDate3")
	private WebElement drpChildDate3;
	@FindBy(id = "ChildMonth3")
	private WebElement drpChildMonth3;
	@FindBy(id = "ChildYear3")
	private WebElement drpChildYear3;
	@FindBy(xpath = "//div[@id='ChildPass_2']/div[2]/div/input")
	private WebElement txtChildPassportNum3;
	@FindBy(id = "Child_Nationality_2")
	private WebElement drpChildnationality3;
	@FindBy(id = "Child_IssuingCountryCode_2")
	private WebElement drpChildIssuing3;
	@FindBy(id = "PassChildDate3")
	private WebElement drpChildExpDate3;
	@FindBy(id = "PassChildMonth3")
	private WebElement drpChildExpMonth3;
	@FindBy(id = "PasschildYear3")
	private WebElement drpChildExpYear3;

	// Child 4 with Passport

	@FindBy(id = "Child_Gender4")
	private WebElement drpChildG4;
	@FindBy(id = "Child_FirstName4")
	private WebElement txtChildFirstName4;
	@FindBy(id = "Child_MiddleName4")
	private WebElement txtChildMiddleName4;
	@FindBy(id = "Child_LastName4")
	private WebElement txtChildLastName4;
	@FindBy(id = "ChildDate4")
	private WebElement drpChildDate4;
	@FindBy(id = "ChildMonth4")
	private WebElement drpChildMonth4;
	@FindBy(id = "ChildYear4")
	private WebElement drpChildYear4;
	@FindBy(xpath = "//div[@id='ChildPass_3']/div[2]/div/input")
	private WebElement txtChildPassportNum4;
	@FindBy(id = "Child_Nationality_3")
	private WebElement drpChildnationality4;
	@FindBy(id = "Child_IssuingCountryCode_3")
	private WebElement drpChildIssuing4;
	@FindBy(id = "PassChildDate4")
	private WebElement drpChildExpDate4;
	@FindBy(id = "PassChildMonth4")
	private WebElement drpChildExpMonth4;
	@FindBy(id = "PasschildYear4")
	private WebElement drpChildExpYear4;

	// Child 5 with Passport

	@FindBy(id = "Child_Gender5")
	private WebElement drpChildG5;
	@FindBy(id = "Child_FirstName5")
	private WebElement txtChildFirstName5;
	@FindBy(id = "Child_MiddleName5")
	private WebElement txtChildMiddleName5;
	@FindBy(id = "Child_LastName5")
	private WebElement txtChildLastName5;
	@FindBy(id = "ChildDate5")
	private WebElement drpChildDate5;
	@FindBy(id = "ChildMonth5")
	private WebElement drpChildMonth5;
	@FindBy(id = "ChildYear5")
	private WebElement drpChildYear5;
	@FindBy(xpath = "//div[@id='ChildPass_4']/div[2]/div/input")
	private WebElement txtChildPassportNum5;
	@FindBy(id = "Child_Nationality_4")
	private WebElement drpChildnationality5;
	@FindBy(id = "Child_IssuingCountryCode_4")
	private WebElement drpChildIssuing5;
	@FindBy(id = "PassChildDate5")
	private WebElement drpChildExpDate5;
	@FindBy(id = "PassChildMonth5")
	private WebElement drpChildExpMonth5;
	@FindBy(id = "PasschildYear5")
	private WebElement drpChildExpYear5;

	// Child 6 with Passport

	@FindBy(id = "Child_Gender6")
	private WebElement drpChildG6;
	@FindBy(id = "Child_FirstName6")
	private WebElement txtChildFirstName6;
	@FindBy(id = "Child_MiddleName6")
	private WebElement txtChildMiddleName6;
	@FindBy(id = "Child_LastName6")
	private WebElement txtChildLastName6;
	@FindBy(id = "ChildDate6")
	private WebElement drpChildDate6;
	@FindBy(id = "ChildMonth6")
	private WebElement drpChildMonth6;
	@FindBy(id = "ChildYear6")
	private WebElement drpChildYear6;
	@FindBy(xpath = "//div[@id='ChildPass_5']/div[2]/div/input")
	private WebElement txtChildPassportNum6;
	@FindBy(id = "Child_Nationality_5")
	private WebElement drpChildnationality6;
	@FindBy(id = "Child_IssuingCountryCode_5")
	private WebElement drpChildIssuing6;
	@FindBy(id = "PassChildDate6")
	private WebElement drpChildExpDate6;
	@FindBy(id = "PassChildMonth6")
	private WebElement drpChildExpMonth6;
	@FindBy(id = "PasschildYear6")
	private WebElement drpChildExpYear6;

	// Child 7 with Passport

	@FindBy(id = "Child_Gender7")
	private WebElement drpChildG7;
	@FindBy(id = "Child_FirstName7")
	private WebElement txtChildFirstName7;
	@FindBy(id = "Child_MiddleName7")
	private WebElement txtChildMiddleName7;
	@FindBy(id = "Child_LastName7")
	private WebElement txtChildLastName7;
	@FindBy(id = "ChildDate7")
	private WebElement drpChildDate7;
	@FindBy(id = "ChildMonth7")
	private WebElement drpChildMonth7;
	@FindBy(id = "ChildYear7")
	private WebElement drpChildYear7;
	@FindBy(xpath = "//div[@id='ChildPass_6']/div[2]/div/input")
	private WebElement txtChildPassportNum7;
	@FindBy(id = "Child_Nationality_6")
	private WebElement drpChildnationality7;
	@FindBy(id = "Child_IssuingCountryCode_6")
	private WebElement drpChildIssuing7;
	@FindBy(id = "PassChildDate7")
	private WebElement drpChildExpDate7;
	@FindBy(id = "PassChildMonth7")
	private WebElement drpChildExpMonth7;
	@FindBy(id = "PasschildYear7")
	private WebElement drpChildExpYear7;

	// Child 7 with Passport

	@FindBy(id = "Child_Gender8")
	private WebElement drpChildG8;
	@FindBy(id = "Child_FirstName8")
	private WebElement txtChildFirstName8;
	@FindBy(id = "Child_MiddleName8")
	private WebElement txtChildMiddleName8;
	@FindBy(id = "Child_LastName8")
	private WebElement txtChildLastName8;
	@FindBy(id = "ChildDate8")
	private WebElement drpChildDate8;
	@FindBy(id = "ChildMonth8")
	private WebElement drpChildMonth8;
	@FindBy(id = "ChildYear8")
	private WebElement drpChildYear8;
	@FindBy(xpath = "//div[@id='ChildPass_7']/div[2]/div/input")
	private WebElement txtChildPassportNum8;
	@FindBy(id = "Child_Nationality_7")
	private WebElement drpChildnationality8;
	@FindBy(id = "Child_IssuingCountryCode_7")
	private WebElement drpChildIssuing8;
	@FindBy(id = "PassChildDate8")
	private WebElement drpChildExpDate8;
	@FindBy(id = "PassChildMonth8")
	private WebElement drpChildExpMonth8;
	@FindBy(id = "PasschildYear8")
	private WebElement drpChildExpYear8;

	// Infants 1 with Passport

	@FindBy(css = "select[name=\"Pax[1].Gender\"]")
	private WebElement drpInfantG1;
	@FindBy(id = "Infant_FirstName1")
	private WebElement txtInfantFirstName1;
	@FindBy(id = "Infant_MiddleName1")
	private WebElement txtInfantMiddleName1;
	@FindBy(id = "Infant_LastName1")
	private WebElement txtInfantLastName1;
	@FindBy(id = "InfantDate1")
	private WebElement drpInfantDate1;
	@FindBy(id = "InfantMonth1")
	private WebElement drpInfantMonth1;
	@FindBy(id = "InfantYear1")
	private WebElement drpInfantYear1;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum1;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality1;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing1;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate1;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth1;
	@FindBy(id = "PasschildYear1")
	private WebElement drpInfantExpYear1;

	// Infants 2 with Passport

	@FindBy(css = "select[name=\"Pax[2].Gender\"]")
	private WebElement drpInfantG2;
	@FindBy(id = "Infant_FirstName2")
	private WebElement txtInfantFirstName2;
	@FindBy(id = "Infant_MiddleName2")
	private WebElement txtInfantMiddleName2;
	@FindBy(id = "Infant_LastName2")
	private WebElement txtInfantLastName2;
	@FindBy(id = "InfantDate2")
	private WebElement drpInfantDate2;
	@FindBy(id = "InfantMonth2")
	private WebElement drpInfantMonth2;
	@FindBy(id = "InfantYear2")
	private WebElement drpInfantYear2;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum2;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality2;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing2;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate2;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth2;
	@FindBy(id = "PasschildYear1")
	private WebElement drpInfantExpYear2;

	// Infants 3 with Passport

	@FindBy(css = "select[name=\"Pax[3].Gender\"]")
	private WebElement drpInfantG3;
	@FindBy(id = "Infant_FirstName3")
	private WebElement txtInfantFirstName3;
	@FindBy(id = "Infant_MiddleName3")
	private WebElement txtInfantMiddleName3;
	@FindBy(id = "Infant_LastName3")
	private WebElement txtInfantLastName3;
	@FindBy(id = "InfantDate3")
	private WebElement drpInfantDate3;
	@FindBy(id = "InfantMonth3")
	private WebElement drpInfantMonth3;
	@FindBy(id = "InfantYear3")
	private WebElement drpInfantYear3;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum3;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality3;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing3;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate3;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth3;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear3;

	// Infants 4 with Passport

	@FindBy(css = "select[name=\"Pax[4].Gender\"]")
	private WebElement drpInfantG4;
	@FindBy(id = "Infant_FirstName4")
	private WebElement txtInfantFirstName4;
	@FindBy(id = "Infant_MiddleName4")
	private WebElement txtInfantMiddleName4;
	@FindBy(id = "Infant_LastName4")
	private WebElement txtInfantLastName4;
	@FindBy(id = "InfantDate4")
	private WebElement drpInfantDate4;
	@FindBy(id = "InfantMonth4")
	private WebElement drpInfantMonth4;
	@FindBy(id = "InfantYear4")
	private WebElement drpInfantYear4;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum4;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality4;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing4;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate4;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth4;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear4;

	// Infants 5 with Passport

	@FindBy(css = "select[name=\"Pax[5].Gender\"]")
	private WebElement drpInfantG5;
	@FindBy(id = "Infant_FirstName5")
	private WebElement txtInfantFirstName5;
	@FindBy(id = "Infant_MiddleName5")
	private WebElement txtInfantMiddleName5;
	@FindBy(id = "Infant_LastName5")
	private WebElement txtInfantLastName5;
	@FindBy(id = "InfantDate5")
	private WebElement drpInfantDate5;
	@FindBy(id = "InfantMonth5")
	private WebElement drpInfantMonth5;
	@FindBy(id = "InfantYear5")
	private WebElement drpInfantYear5;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum5;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality5;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing5;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate5;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth5;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear5;

	// Infants 6 with Passport

	@FindBy(css = "select[name=\"Pax[6].Gender\"]")
	private WebElement drpInfantG6;
	@FindBy(id = "Infant_FirstName6")
	private WebElement txtInfantFirstName6;
	@FindBy(id = "Infant_MiddleName6")
	private WebElement txtInfantMiddleName6;
	@FindBy(id = "Infant_LastName6")
	private WebElement txtInfantLastName6;
	@FindBy(id = "InfantDate6")
	private WebElement drpInfantDate6;
	@FindBy(id = "InfantMonth6")
	private WebElement drpInfantMonth6;
	@FindBy(id = "InfantYear6")
	private WebElement drpInfantYear6;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum6;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality6;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing6;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate6;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth6;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear6;

	// Infants 7 with Passport

	@FindBy(css = "select[name=\"Pax[7].Gender\"]")
	private WebElement drpInfantG7;
	@FindBy(id = "Infant_FirstName7")
	private WebElement txtInfantFirstName7;
	@FindBy(id = "Infant_MiddleName7")
	private WebElement txtInfantMiddleName7;
	@FindBy(id = "Infant_LastName7")
	private WebElement txtInfantLastName7;
	@FindBy(id = "InfantDate7")
	private WebElement drpInfantDate7;
	@FindBy(id = "InfantMonth7")
	private WebElement drpInfantMonth7;
	@FindBy(id = "InfantYear7")
	private WebElement drpInfantYear7;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum7;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality7;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing7;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate7;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth7;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear7;

	// Infants 8 with Passport

	@FindBy(css = "select[name=\"Pax[8].Gender\"]")
	private WebElement drpInfantG8;
	@FindBy(id = "Infant_FirstName8")
	private WebElement txtInfantFirstName8;
	@FindBy(id = "Infant_MiddleName8")
	private WebElement txtInfantMiddleName8;
	@FindBy(id = "Infant_LastName8")
	private WebElement txtInfantLastName8;
	@FindBy(id = "InfantDate8")
	private WebElement drpInfantDate8;
	@FindBy(id = "InfantMonth8")
	private WebElement drpInfantMonth8;
	@FindBy(id = "InfantYear8")
	private WebElement drpInfantYear8;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtInfantPassportNum8;
	@FindBy(id = "Child_Nationality_0")
	private WebElement drpInfantnationality8;
	@FindBy(id = "Child_IssuingCountryCode_0")
	private WebElement drpInfantIssuing8;
	@FindBy(id = "PassChildDate1")
	private WebElement drpInfantExpDate8;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpInfantExpMonth8;
	@FindBy(id = "PasschildYear2")
	private WebElement drpInfantExpYear8;

	public void AdultChildNumber1_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG1, "Male");
		pageUtils.selectByVisibleText(drpInfantDate1, "12");
		pageUtils.selectByVisibleText(drpInfantMonth1, "May");
		pageUtils.selectByVisibleText(drpInfantYear1, "2017");

	}

	public void AdultChildNumber2_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG2, "Male");
		pageUtils.selectByVisibleText(drpInfantDate2, "12");
		pageUtils.selectByVisibleText(drpInfantMonth2, "May");
		pageUtils.selectByVisibleText(drpInfantYear2, "2017");

	}

	public void AdultChildNumber3_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG3, "Male");
		pageUtils.selectByVisibleText(drpInfantDate3, "12");
		pageUtils.selectByVisibleText(drpInfantMonth3, "May");
		pageUtils.selectByVisibleText(drpInfantYear3, "2017");

	}

	public void AdultChildNumber4_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG4, "Male");
		pageUtils.selectByVisibleText(drpInfantDate4, "12");
		pageUtils.selectByVisibleText(drpInfantMonth4, "May");
		pageUtils.selectByVisibleText(drpInfantYear4, "2017");

	}

	public void AdultChildNumber5_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG5, "Male");
		pageUtils.selectByVisibleText(drpInfantDate5, "12");
		pageUtils.selectByVisibleText(drpInfantMonth5, "May");
		pageUtils.selectByVisibleText(drpInfantYear5, "2017");

	}

	public void AdultChildNumber6_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG6, "Male");
		pageUtils.selectByVisibleText(drpInfantDate6, "12");
		pageUtils.selectByVisibleText(drpInfantMonth6, "May");
		pageUtils.selectByVisibleText(drpInfantYear6, "2017");

	}

	public void AdultChildNumber7_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG7, "Male");
		pageUtils.selectByVisibleText(drpInfantDate7, "12");
		pageUtils.selectByVisibleText(drpInfantMonth7, "May");
		pageUtils.selectByVisibleText(drpInfantYear7, "2017");

	}

	public void AdultChildNumber8_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG8, "Male");
		pageUtils.selectByVisibleText(drpInfantDate8, "12");
		pageUtils.selectByVisibleText(drpInfantMonth8, "May");
		pageUtils.selectByVisibleText(drpInfantYear8, "2017");

	}

	public void AdultNumber1_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate1, "12");
		pageUtils.selectByVisibleText(drpChildMonth1, "May");
		pageUtils.selectByVisibleText(drpChildYear1, "2010");
		AdultNumber1_passport();

	}

	public void AdultNumber1_passport() {
		try {

			pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum1, "243535");
			pageUtils.selectByVisibleText(drpChildnationality1, "India");
			pageUtils.selectByVisibleText(drpChildIssuing1, "India");
			pageUtils.selectByVisibleText(drpChildExpDate1, "15");
			pageUtils.selectByVisibleText(drpChildExpMonth1, "Jun");
			pageUtils.selectByVisibleText(drpChildExpYear1, "2027");

		} catch (Exception e) {

		}
	}

	public void AdultNumber2_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate2, "12");
		pageUtils.selectByVisibleText(drpChildMonth2, "May");
		pageUtils.selectByVisibleText(drpChildYear2, "2010");

		AdultNumber2_passport();

	}

	public void AdultNumber2_passport() {
		try {
			if (txtChildPassportNum2.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum2, "243535");
				pageUtils.selectByVisibleText(drpChildnationality2, "India");
				pageUtils.selectByVisibleText(drpChildIssuing2, "India");
				pageUtils.selectByVisibleText(drpChildExpDate2, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth2, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear2, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber3_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate3, "12");
		pageUtils.selectByVisibleText(drpChildMonth3, "May");
		pageUtils.selectByVisibleText(drpChildYear3, "2010");
		AdultNumber3_passport();

	}

	public void AdultNumber3_passport() {
		try {
			if (txtChildPassportNum3.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum3, "243535");
				pageUtils.selectByVisibleText(drpChildnationality3, "India");
				pageUtils.selectByVisibleText(drpChildIssuing3, "India");
				pageUtils.selectByVisibleText(drpChildExpDate3, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth3, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear3, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber4_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate4, "12");
		pageUtils.selectByVisibleText(drpChildMonth4, "May");
		pageUtils.selectByVisibleText(drpChildYear4, "2010");
		AdultNumber4_passport();

	}

	public void AdultNumber4_passport() {
		try {
			if (txtChildPassportNum4.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum4, "243535");
				pageUtils.selectByVisibleText(drpChildnationality4, "India");
				pageUtils.selectByVisibleText(drpChildIssuing4, "India");
				pageUtils.selectByVisibleText(drpChildExpDate4, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth4, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear4, "2027");

			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber5_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate5, "12");
		pageUtils.selectByVisibleText(drpChildMonth5, "May");
		pageUtils.selectByVisibleText(drpChildYear5, "2010");

		AdultNumber5_passport();

	}

	public void AdultNumber5_passport() {
		try {
			if (txtChildPassportNum5.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum5, "243535");
				pageUtils.selectByVisibleText(drpChildnationality5, "India");
				pageUtils.selectByVisibleText(drpChildIssuing5, "India");
				pageUtils.selectByVisibleText(drpChildExpDate5, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth5, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear5, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber6_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate6, "12");
		pageUtils.selectByVisibleText(drpChildMonth6, "May");
		pageUtils.selectByVisibleText(drpChildYear6, "2010");
		AdultNumber6_passport();

	}

	public void AdultNumber6_passport() {
		try {
			if (txtChildPassportNum6.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum6, "243535");
				pageUtils.selectByVisibleText(drpChildnationality6, "India");
				pageUtils.selectByVisibleText(drpChildIssuing6, "India");
				pageUtils.selectByVisibleText(drpChildExpDate6, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth6, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear6, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber7_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate7, "12");
		pageUtils.selectByVisibleText(drpChildMonth7, "May");
		pageUtils.selectByVisibleText(drpChildYear7, "2010");
		AdultNumber7_passport();

	}

	public void AdultNumber7_passport() {

		try {
			if (txtChildPassportNum7.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum7, "243535");
				pageUtils.selectByVisibleText(drpChildnationality7, "India");
				pageUtils.selectByVisibleText(drpChildIssuing7, "India");
				pageUtils.selectByVisibleText(drpChildExpDate7, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth7, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear7, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber8_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate8, "12");
		pageUtils.selectByVisibleText(drpChildMonth8, "May");
		pageUtils.selectByVisibleText(drpChildYear8, "2010");
		AdultNumber8_passport();
	}

	public void AdultNumber8_passport() {

		try {
			if (txtChildPassportNum8.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum8, "243535");
				pageUtils.selectByVisibleText(drpChildnationality8, "India");
				pageUtils.selectByVisibleText(drpChildIssuing8, "India");
				pageUtils.selectByVisibleText(drpChildExpDate8, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth8, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear8, "2027");
			}
		} catch (Exception e) {

		}
	}

	public void infantsDetails(Map<String, String> dataMap) {
		String childnum = dataMap.get("childs");
		String adult = dataMap.get("adults");
		String infant = dataMap.get("infant");
        System.out.println("Infants valus:"+infant);
		Integer totalValue = Integer.parseInt(childnum) + Integer.parseInt(adult);
		System.out.println("totalValue:" + totalValue);
		String numberAsString = Integer.toString(totalValue);
		System.out.println(numberAsString);

		if ("1".equals(infant)) {
			//pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
		}

		if ("2".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}
		if ("3".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}

		if ("4".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}
		
	/*	
		if ("5".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			
			pageUtils.selectByVisibleText(drpInfantG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName5, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}

		
		if ("6".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			
			pageUtils.selectByVisibleText(drpInfantG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName5, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName6, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}

		if ("7".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			
			pageUtils.selectByVisibleText(drpInfantG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName5, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName6, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG7, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName7, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName7, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName7, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}
		
		if ("8".equals(infant)) {
			pageUtils.selectByVisibleText(drpInfantG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			pageUtils.selectByVisibleText(drpInfantG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 

			pageUtils.selectByVisibleText(drpInfantG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			
			pageUtils.selectByVisibleText(drpInfantG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName5, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName6, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG7, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName7, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName7, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName7, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
			
			pageUtils.selectByVisibleText(drpInfantG8, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName8, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName8, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName8, "lastname");
			if ("1".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			} 
		}
*/

	}

	public void childDetails_test(Map<String, String> dataMap) {
		String childnum = dataMap.get("childs");
		String adult = dataMap.get("adults");

		if ("1".equals(childnum)) {

			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
		}

		// Child 2
		if ("2".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 3
		if ("3".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 4
		if ("4".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 5
		if ("5".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, "lastname");
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 6
		if ("6".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, "lastname");
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, "lastname");
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 7
		if ("7".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, "lastname");
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, "lastname");
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG7, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, "lastname");
			if ("1".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

		// Child 8
		if ("8".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, "lastname");
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG2, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG3, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

			pageUtils.selectByVisibleText(drpChildG4, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG5, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, "lastname");
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG6, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, "lastname");
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG7, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, "lastname");
			if ("1".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			pageUtils.selectByVisibleText(drpChildG8, "Male");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName8, "Firstname");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName8, "middle");
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName8, "lastname");
			if ("1".equals(adult)) {
				AdultNumber8_CompareToChild();
			}

		}

	}

	public void child2() {
		pageUtils.selectByVisibleText(drpChildG2, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, "lastname");

		/*
		 * try { pageUtils.selectByVisibleText(drpChildDate2, "12");
		 * pageUtils.selectByVisibleText(drpChildMonth2, "May");
		 * pageUtils.selectByVisibleText(drpChildYear2, "2010");
		 * 
		 * } catch (Exception e) {
		 * 
		 * } try { pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum2,
		 * "243535"); pageUtils.selectByVisibleText(drpChildnationality2, "India");
		 * pageUtils.selectByVisibleText(drpChildIssuing2, "India");
		 * pageUtils.selectByVisibleText(drpChildExpDate2, "15");
		 * pageUtils.selectByVisibleText(drpChildExpMonth2, "Jun");
		 * pageUtils.selectByVisibleText(drpChildExpYear2, "2027"); } catch (Exception
		 * e) {
		 * 
		 * }
		 */
	}

	public void child3() {
		pageUtils.selectByVisibleText(drpChildG3, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, "lastname");

	}

	public void child4() {
		pageUtils.selectByVisibleText(drpChildG4, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, "lastname");

	}

	public void child5() {
		pageUtils.selectByVisibleText(drpChildG5, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, "lastname");

	}

	public void child6() {
		pageUtils.selectByVisibleText(drpChildG6, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, "lastname");

	}

	public void child7() {
		pageUtils.selectByVisibleText(drpChildG7, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, "lastname");

	}

	public void child8() {
		pageUtils.selectByVisibleText(drpChildG8, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName8, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName8, "middle");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName8, "lastname");

	}

	public void adultDetails(Map<String, String> dataMap) {
		String numofAdults = dataMap.get("adults");
		if (numofAdults.equals("1")) {
			adult1();
		} else if (numofAdults.equals("2")) {
			adult1();
			adult2();
		} else if (numofAdults.equals("3")) {
			adult1();
			adult2();
			adult3();
		} else if (numofAdults.equals("4")) {
			adult1();
			adult2();
			adult3();
			adult4();
		} else if (numofAdults.equals("5")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
		} else if (numofAdults.equals("6")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
		} else if (numofAdults.equals("7")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
		} else if (numofAdults.equals("8")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
			adult8();
		} else if (numofAdults.equals("8")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
			adult8();
			adult9();
		}
	}

	public void adult1() {
		pageUtils.selectByVisibleText(drpAdultG1, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName1, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName1, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate1, "12");
			pageUtils.selectByVisibleText(drpAdultMonth1, "May");
			pageUtils.selectByVisibleText(drpAdultYear1, "2010");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum1, "243535");
			pageUtils.selectByVisibleText(drpAdultnationality1, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing1, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate1, "15");
			pageUtils.selectByVisibleText(drpAdultExpMonth1, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear1, "2027");
		} catch (Exception e) {

		}
	}

	public void adult2() {
		pageUtils.selectByVisibleText(drpAdultG2, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName2, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName2, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate2, "12");
			pageUtils.selectByVisibleText(drpAdultMonth2, "May");
			pageUtils.selectByVisibleText(drpAdultYear2, "2010");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum2, "243535");
			pageUtils.selectByVisibleText(drpAdultnationality2, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing2, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate2, "15");
			pageUtils.selectByVisibleText(drpAdultExpMonth2, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear2, "2027");
		} catch (Exception e) {

		}
	}

	public void adult3() {
		pageUtils.selectByVisibleText(drpAdultG3, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName3, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName3, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate3, "12");
			pageUtils.selectByVisibleText(drpAdultMonth3, "May");
			pageUtils.selectByVisibleText(drpAdultYear3, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum3, "243535");
			pageUtils.selectByVisibleText(drpAdultnationality3, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing3, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate3, "15");
			pageUtils.selectByVisibleText(drpAdultExpMonth3, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear3, "2027");
		} catch (Exception e) {

		}
	}

	public void adult4() {
		pageUtils.selectByVisibleText(drpAdultG4, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName4, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName4, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate4, "12");
			pageUtils.selectByVisibleText(drpAdultMonth4, "May");
			pageUtils.selectByVisibleText(drpAdultYear4, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum4, "243535");
			pageUtils.selectByVisibleText(drpAdultnationality4, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing4, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate4, "15");
			pageUtils.selectByVisibleText(drpAdultExpMonth4, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear4, "2027");
		} catch (Exception e) {

		}
	}

	public void adult5() {
		pageUtils.selectByVisibleText(drpAdultG5, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName5, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName5, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate5, "12");
			pageUtils.selectByVisibleText(drpAdultMonth5, "May");
			pageUtils.selectByVisibleText(drpAdultYear5, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum5, "253535");
			pageUtils.selectByVisibleText(drpAdultnationality5, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing5, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate5, "15");
			pageUtils.selectByVisibleText(drpAdultExpMonth5, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear5, "2027");
		} catch (Exception e) {

		}
	}

	public void adult6() {
		pageUtils.selectByVisibleText(drpAdultG6, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName6, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName6, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate6, "12");
			pageUtils.selectByVisibleText(drpAdultMonth6, "May");
			pageUtils.selectByVisibleText(drpAdultYear6, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum6, "263636");
			pageUtils.selectByVisibleText(drpAdultnationality6, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing6, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate6, "16");
			pageUtils.selectByVisibleText(drpAdultExpMonth6, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear6, "2027");
		} catch (Exception e) {

		}
	}

	public void adult7() {
		pageUtils.selectByVisibleText(drpAdultG7, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName7, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName7, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate7, "12");
			pageUtils.selectByVisibleText(drpAdultMonth7, "May");
			pageUtils.selectByVisibleText(drpAdultYear7, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum7, "273737");
			pageUtils.selectByVisibleText(drpAdultnationality7, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing7, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate7, "16");
			pageUtils.selectByVisibleText(drpAdultExpMonth7, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear7, "2027");
		} catch (Exception e) {

		}
	}

	public void adult8() {
		pageUtils.selectByVisibleText(drpAdultG8, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName8, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName8, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate8, "12");
			pageUtils.selectByVisibleText(drpAdultMonth8, "May");
			pageUtils.selectByVisibleText(drpAdultYear8, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum8, "283838");
			pageUtils.selectByVisibleText(drpAdultnationality8, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing8, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate8, "16");
			pageUtils.selectByVisibleText(drpAdultExpMonth8, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear8, "2027");
		} catch (Exception e) {

		}
	}

	public void adult9() {
		pageUtils.selectByVisibleText(drpAdultG9, "Male");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName9, "Firstname");
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName9, "lastname");

		try {
			pageUtils.selectByVisibleText(drpAdultDate9, "12");
			pageUtils.selectByVisibleText(drpAdultMonth9, "May");
			pageUtils.selectByVisibleText(drpAdultYear9, "1999");
			pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum9, "293939");
			pageUtils.selectByVisibleText(drpAdultnationality9, "India");
			pageUtils.selectByVisibleText(drpAdultIssuing9, "India");
			pageUtils.selectByVisibleText(drpAdultExpDate9, "16");
			pageUtils.selectByVisibleText(drpAdultExpMonth9, "Jun");
			pageUtils.selectByVisibleText(drpAdultExpYear9, "2027");
		} catch (Exception e) {

		}
	}
	
	public void enterContactDetails() throws Exception
	{
		pageUtils.clickElement(driver, btndrpClick);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.selectCountry(drpCountry, "India (91)");
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		
		pageUtils.sendKeysAfterClearingElement(driver, txtPhoneNumber, DataConstants.USER_PHONE_NUMBER);
	}
	
	
	public void clickOnPaySecurely() throws InterruptedException {
		pageUtils.clickElement(driver, btnPaySecurely);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	
	
}
