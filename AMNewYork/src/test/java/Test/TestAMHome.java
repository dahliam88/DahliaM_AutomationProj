package Test;

import AMNewYorkObjects.AMHome;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAMHome extends CommonAPI{
    @Test
    public void testAMHome() throws InterruptedException {
        AMHome amNYHome = PageFactory.initElements(driver, AMHome.class);
        //test #1
        amNYHome.Home("Trump");
        //test#2
        amNYHome.Newsletters("dahliam@live.com");
    }
}