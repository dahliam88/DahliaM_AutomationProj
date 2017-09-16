package TestFB;

import common.CommonAPI;
import fbObjects.FacebookSignupPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;

public class TestFBSignup extends CommonAPI {
    @Test
    public void testSignup() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/r.php");
        FacebookSignupPage fbSignup = PageFactory.initElements(driver, FacebookSignupPage.class);
        fbSignup.signUpFB("Daenerys", "Targaryen", "motherofdragons@gmail.com", "drogon", "Jul", "25", "1988", "female");
    }

}