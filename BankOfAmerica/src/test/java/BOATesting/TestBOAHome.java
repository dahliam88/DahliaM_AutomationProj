package BOATesting;

import BankOAObjects.BankOAHome;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestBOAHome extends CommonAPI {
    @Test
    public void testBankHome() throws InterruptedException {
        driver.navigate().to("https://www.bankofamerica.com");
        BankOAHome bankHome = PageFactory.initElements(driver, BankOAHome.class);
        bankHome.Home("dahliam324","020202");
    }
}
