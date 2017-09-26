package TestIG;

import iGObjects.InstagramSignup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestIGSignup {
    @Test
    public void testSignup() throws InterruptedException {
        driver.navigate().to("https://www.instagram.com");
        InstagramSignup igSignup = PageFactory.initElements(driver, InstagramSignup.class);
        igSignup.signUpIG("diamondinaruff1010@aim.com", "Daenerys Targaryen", "khaleesi12345678910", "drogon1010");
    }
}
