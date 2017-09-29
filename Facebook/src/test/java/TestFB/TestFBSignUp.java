package TestFB;

import common.CommonAPI;
import fBObjects.FacebookSignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;

public class TestFBSignUp extends CommonAPI {
    @Test
    public void testSignUp() throws InterruptedException {
        FacebookSignUpPage SignUp = PageFactory.initElements(driver,FacebookSignUpPage.class);
        SignUp.signUpFB("Daenerys", "Targaryen", "motherofdragons@gmail.com", "drogon", "Jul", "25", "1988", "female");
    }
}