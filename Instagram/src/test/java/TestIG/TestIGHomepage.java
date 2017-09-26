package TestIG;

import common.CommonAPI;
import iGObjects.InstagramHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestIGHomepage extends CommonAPI{
    @Test
    public void testHome() throws InterruptedException {
        driver.navigate().to("https://www.instagram.com");
        InstagramHomepage iGHome = PageFactory.initElements(driver, InstagramHomepage.class);
        iGHome.Home();
    }
}
