package TestTwitter;

import TwitterObjects.TwitterHomepage;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTwittHome extends CommonAPI {
    @Test
    public void testHome() throws InterruptedException {
        driver.navigate().to("https://twitter.com");
        TwitterHomepage twittHome = PageFactory.initElements(driver, TwitterHomepage.class);
        twittHome.Home();
    }
}