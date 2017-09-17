package TestFB;

import common.CommonAPI;
import fBObjects.FacebookLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestFBLogin extends CommonAPI {
    @Test
    public void testLogin() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/login/");
        FacebookLogin facebookHome = PageFactory.initElements(driver, FacebookLogin.class);
        facebookHome.loginFB("diamondinaruff10@aim.com","flower123");
    }

}