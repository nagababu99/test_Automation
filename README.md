package cloud.canopy.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import cloud.canopy.constants.common.BrowserConstants;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserUtils {

    public static String targetUrl = null;
    public static WebDriver driver = null;
    public static String applicationUrl = null;
    public static String engineEnvironment = null;
    private static String downloadPath = System.getProperty("user.dir").replace("\\", "/") + "/downloads";

    private static void initializeSystemProperties() {
        System.setProperty("browser", System.getProperty("browser", "chrome"));
        System.setProperty("pathToDriver", System.getProperty("pathToDriver", "D:\\jarfiles\\chromedriver.exe"));
        System.setProperty("foreground", System.getProperty("foreground", "false"));
        System.setProperty("target", System.getProperty("target", "ML"));
        System.setProperty("environment", System.getProperty("environment", "TST"));
        System.setProperty("application", System.getProperty("application", "ENGINE"));
        System.setProperty("url", System.getProperty("url", "https://canopy-staging.kurtosys.org"));
        System.setProperty("seleniumGridUrl", System.getProperty("seleniumGridUrl", "none"));
        System.setProperty("headless", "true");
    }

    /**
     * This method is used to return the browser instance
     */
    public static WebDriver getDriverInstance() {
        if (driver == null) {
            driver = launchBrowser(null);
        }
        return driver;
    }

    @Before
    public static void launchUrl(Scenario scenario) {
        launchBrowser(scenario);
        getApplicationUrl();
        getTargetEnv();
        driver.get(applicationUrl);
        //driver.get(targetUrl);
        driver.manage().window().maximize();
        Cookie cookie = new Cookie("zaleniumMessage", scenario.getName());
        driver.manage().addCookie(cookie);
    }

    private static WebDriver getRemoteDriver(DesiredCapabilities capabilities, Scenario scenario) {
        capabilities.setCapability("build", System.getProperty("url") + " - " + System.getProperty("application"));
        capabilities.setCapability("name", scenario.getName());
        String seleniumGridUrl = System.getProperty("seleniumGridUrl");
        try {
            WebDriver driver = new RemoteWebDriver(new URL(seleniumGridUrl), capabilities);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            return driver;
        } catch (UnreachableBrowserException e) {
            Assert.fail("UnreachableBrowserException: " + e.getMessage());
        } catch (MalformedURLException e) {
            Assert.fail("MalformedURLException: " + seleniumGridUrl);
        } catch (WebDriverException e) {
            Assert.fail("WebDriverException: " + e.getMessage());
        }
        return null;
    }

    /**
     * This method is used to launch the browser instance
     */
    public static WebDriver launchBrowser(Scenario scenario) {
        initializeSystemProperties();
        String browser = System.getProperty("browser");
        String driverPath = System.getProperty("pathToDriver");
        boolean useGrid = !System.getProperty("seleniumGridUrl").equals("none");
        DesiredCapabilities capabilities;
        if (browser.equalsIgnoreCase(BrowserConstants.CHROME)) {
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("download.default_directory", downloadPath);
            capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.merge(capabilities);
            options.addArguments("--window-size=1366,768");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);

            if (useGrid) {
                driver = getRemoteDriver(capabilities, scenario);
            } else {
                options.setHeadless(System.getProperty("headless", "false").equals("true"));
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(driverPath))
                        .usingAnyFreePort()
                        .build();
                driver = new ChromeDriver(service, options);
            }
        }

        if (browser.equalsIgnoreCase(BrowserConstants.FIREFOX)) {
            capabilities = DesiredCapabilities.firefox();
            FirefoxOptions options = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();

            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("browser.download.dir", downloadPath);
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv;application/pdf;text/plain");
            profile.setPreference("browser.helperApps.alwaysAsk.force", false);

            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
            options.setProfile(profile);

            if (useGrid) {
                driver = getRemoteDriver(capabilities, scenario);
            } else {
                options.addArguments("--headless");
                options.setBinary(driverPath);
                driver = new FirefoxDriver(options);
            }
        }

        assert driver != null;
        driver.manage().deleteAllCookies();
        return driver;
    }

    /**
	 * This method is used to return the targetted url
	 */
	private static void getApplicationUrl() {		
		String target = System.getProperty("target");
		String environment = System.getProperty("environment");
		String application = System.getProperty("application");
		//applicationUrl = System.getProperty("url");
		if(target.equalsIgnoreCase(BrowserConstants.ML)) {
			switch (application.toUpperCase()) {
			case "VISUALIZER": 
				//applicationUrl = System.getProperty("url");
				switch(environment) {
				case "DEV" : 
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ML_VISUALIZER_DEV_URL; 
					break;
				case "TST" : 
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ML_VISUALIZER_TST_URL; 
					break;
				case "STG" : 
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ML_VISUALIZER_STG_URL; 
					break;
				case "PRD" :
					
					applicationUrl = BrowserConstants.ML_VISUALIZER_PRD_URL; 
					break;
				default:
					applicationUrl = BrowserConstants.ML_VISUALIZER_DEV_URL;
					break;
				}
				break;
			case "ENGINE":
				switch(environment) {
				case "DEV" : 
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ML_ENGINE_DEV_URL; 
					break;
				case "TST" : 
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ML_ENGINE_TST_URL; 
					break;
				case "STG" : 
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ML_ENGINE_STG_URL; 
					break;
				case "PRD" : 
					engineEnvironment = BrowserConstants.ENV_PRD;
					applicationUrl = BrowserConstants.ML_ENGINE_PRD_URL; 
					break;
				default:
					applicationUrl = BrowserConstants.ML_ENGINE_DEV_URL;
					break;
				}
				break;
			}
		}
	}
	
    /**
	 * This method is used to return targetted environment
	 */
	private static void getTargetEnv() {
		targetUrl = System.getProperty("url");
		switch(targetUrl) {
		case "https://dev-engine.kurtosys.org" : 
			engineEnvironment = BrowserConstants.ENV_DEV;
			break;
		case "https://testing-engine.kurtosys.org" : 
			engineEnvironment = BrowserConstants.ENV_TST;
			break;
		case "https://staging-engine.kurtosys.org" : 
			engineEnvironment = BrowserConstants.ENV_STG;
			break;
		}
		
	}
}

