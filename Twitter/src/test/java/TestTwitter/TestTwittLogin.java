package TestTwitter;

import TwitterObjects.TwitterLogin;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTwittLogin extends CommonAPI {
    @Test
    public void testLogin() throws InterruptedException {
        driver.navigate().to("https://twitter.com/login/");
        TwitterLogin twittLogin = PageFactory.initElements(driver, TwitterLogin.class);
        twittLogin.loginTwitt("dahlmarc10", "cherry87");
    }
}