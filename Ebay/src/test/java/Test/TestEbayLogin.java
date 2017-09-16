package Test;

import Homepage.EbayLogin;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestEbayLogin extends CommonAPI{

    @Test
    public void testLogin() throws InterruptedException {
        driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        EbayLogin ebayLogin = PageFactory.initElements(driver, EbayLogin.class);
        ebayLogin.loginEbay("dahlmarc", "Cherry87");
    }
}
