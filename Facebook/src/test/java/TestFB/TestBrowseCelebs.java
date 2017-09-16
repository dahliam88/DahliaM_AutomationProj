package TestFB;

import common.CommonAPI;
import fbObjects.FacebookBrowseCelebs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;
import static java.lang.Thread.sleep;

public class TestBrowseCelebs extends CommonAPI {
    @Test
    public void testBrowseCelebs() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/directory/celebrities/");
        FacebookBrowseCelebs search = PageFactory.initElements(driver, FacebookBrowseCelebs.class);
        search.searchCelebs("Rihanna");
    }
}
