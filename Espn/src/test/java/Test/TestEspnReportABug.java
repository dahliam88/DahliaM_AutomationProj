package Test;

import EspnObjects.EspnHome;
import EspnObjects.EspnReportABug;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEspnReportABug extends CommonAPI {
    @Test
    public void testBankHome() throws InterruptedException {
        driver.navigate().to("http://proxy.espn.com/espn/bugs?url=http://www.espn.com/");
        EspnReportABug comment = PageFactory.initElements(driver, EspnReportABug.class);
        comment.reportBug("The site is sooooo cool! Just like automation!");
    }
}
