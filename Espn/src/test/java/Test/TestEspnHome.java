package Test;

import EspnObjects.EspnHome;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEspnHome extends CommonAPI {
    @Test
    public void testBankHome() throws InterruptedException {
        driver.navigate().to("http://www.espn.com/");
        EspnHome espnHome = PageFactory.initElements(driver, EspnHome.class);
        espnHome.Home("basketball");
    }
}