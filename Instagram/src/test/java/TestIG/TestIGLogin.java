package TestIG;

import common.CommonAPI;
import iGObjects.InstagramLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestIGLogin extends CommonAPI {
    @Test
    public void testLogin() throws InterruptedException {
        driver.navigate().to("https://www.instagram.com/accounts/login/");
        InstagramLogin igLogin = PageFactory.initElements(driver, InstagramLogin.class);
        igLogin.loginIG("lolarabbit1010", "MARSUPIAL123");
    }
}
