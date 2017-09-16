package Test;

import Homepage.EbaySignup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestEbaySignup {

    @Test
    public void testSignup() throws InterruptedException {
        driver.navigate().to("https://reg.ebay.com/reg/PartialReg");
        EbaySignup ebaySignup = PageFactory.initElements(driver, EbaySignup.class);
        ebaySignup.signUpEbay("Daenerys", "Targaryen", "diamondinaruff1010@aim.com", "drogon1010");
    }

}
