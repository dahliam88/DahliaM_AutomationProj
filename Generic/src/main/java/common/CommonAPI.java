package common;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"browserName", "url", "operatingSystem"})
    @BeforeTest

    public void setUp(@Optional("firefox") String browserName, @Optional("https://www.amazon.com/") String url ,@Optional("win") String operatingSystem ) {
        getLocalDriver(browserName, operatingSystem);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(String browserName, String operatingSystem) {
        String browser = browserName.toLowerCase();
        String oS = operatingSystem.toLowerCase();
        if (browser.contains("chrome")) {
            if(oS.contains("os x") || oS.contains("macos")) {
                System.setProperty("webdriver.chrome.driver","\\Users\\Dahlia\\IdeaProjects\\PntAutomation\\Generic\\driver\\chromedriver.exe");
            }else if(oS.contains("win")) {
                System.setProperty("webdriver.chrome.driver","\\Users\\Dahlia\\IdeaProjects\\PntAutomation\\Generic\\driver\\chromedriver.exe");
            }
            driver = new ChromeDriver();

        }else if(browser.contains("firefox")) {
            if (oS.contains("os x") || oS.contains("macos")) {
                System.setProperty("webdriver.gecko.driver", "\\Users\\Dahlia\\IdeaProjects\\PntAutomation\\Generic\\driver\\geckodriver.exe");
            } else if (oS.contains("win")) {

                System.setProperty("webdriver.gecko.driver", "\\Users\\Dahlia\\IdeaProjects\\PntAutomation\\Generic\\driver\\geckodriver.exe");
            }
            driver = new FirefoxDriver();
        }
        return driver;

    }
    @AfterTest
    public void cleanUp() {
        driver.quit();
    }
}