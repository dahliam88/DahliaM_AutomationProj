package BOATesting;

import BankOAObjects.BankOAHomeSearch;
import BankOAObjects.BankOALocator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestBOALocator {
    @Test
    public void testBankHome() throws InterruptedException {
        driver.navigate().to("https://locators.bankofamerica.com/");
        BankOALocator locator = PageFactory.initElements(driver, BankOALocator.class);
        locator.Location("Brooklyn");
    }
}
