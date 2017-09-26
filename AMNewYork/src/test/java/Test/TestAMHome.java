package Test;

import AMNewYorkObjects.AMHome;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAMHome extends CommonAPI{
    @Test
    public void testAMHome() throws InterruptedException {
        driver.navigate().to("http://www.amny.com/news");
        AMHome amNYHome = PageFactory.initElements(driver, AMHome.class);
        amNYHome.Home("Trump");
    }
}