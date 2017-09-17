package TestFB;

import common.CommonAPI;
import fBObjects.FacebookHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestFBHomepage extends CommonAPI {
    @Test
    public void testHome() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
        FacebookHomepage fBHome = PageFactory.initElements(driver, FacebookHomepage.class);
        fBHome.Home();
    }

}
