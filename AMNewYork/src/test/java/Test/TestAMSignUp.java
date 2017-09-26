package Test;

import AMNewYorkObjects.AMSignUp;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestAMSignUp extends CommonAPI{
    @Test
    public void testAMSignup() throws InterruptedException {
        driver.navigate().to("http://www.amny.com/news");
        AMSignUp Register = PageFactory.initElements(driver, AMSignUp.class);
        Register.signUpAM("");
    }
}
