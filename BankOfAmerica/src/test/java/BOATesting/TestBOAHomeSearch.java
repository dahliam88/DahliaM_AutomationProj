package BOATesting;

import BankOAObjects.BankOAHome;
import BankOAObjects.BankOAHomeSearch;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBOAHomeSearch extends CommonAPI {
    @Test
    public void testBankHome() throws InterruptedException {
        driver.navigate().to("https://www.bankofamerica.com");
        BankOAHomeSearch bankSearch = PageFactory.initElements(driver, BankOAHomeSearch.class);
        bankSearch.Search("credit");
    }
}
