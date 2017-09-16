package TestIG;

import common.CommonAPI;
import iGObjects.TermsOfUse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestIGTerms extends CommonAPI {
    @Test
    public void testDataPolicy() throws InterruptedException {
        driver.navigate().to("https://help.instagram.com/477434105621119/");
        TermsOfUse termsOf = PageFactory.initElements(driver, TermsOfUse.class);
        termsOf.WebElement();
    }

}
