package Test;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Homepage.EbayHomepage;

import static common.CommonAPI.driver;

public class TestEbayHome extends CommonAPI {
    @Test
    public void testHome() throws InterruptedException {
        driver.navigate().to("https://www.ebay.com/");
        EbayHomepage ebayHome = PageFactory.initElements(driver, EbayHomepage.class);
        ebayHome.searchItem("handbags");
    }

}
