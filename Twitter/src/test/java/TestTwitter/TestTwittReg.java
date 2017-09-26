package TestTwitter;

import TwitterObjects.TwitterRegister;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTwittReg extends CommonAPI {
    @Test
    public void testSignup() throws InterruptedException {
        driver.navigate().to("https://twitter.com/signup");
        TwitterRegister twittSignup = PageFactory.initElements(driver, TwitterRegister.class);
        twittSignup.registerTwitter("Daenerys Targaryen", "drogon1010@aol.com", "khaleesi1010");
    }
}