package Test;

import Homepage.AmazonSignup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.CommonAPI.driver;

public class TestAmazonSignup {
    @Test
    public void testSignup() throws InterruptedException {
        driver.navigate().to("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=VEZ5PN1KNPP1Z8B1W841&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        AmazonSignup amazonSignup = PageFactory.initElements(driver, AmazonSignup.class);
        amazonSignup.signUpAmazon("Daenerys Targaryen", "diamondinaruff1010@aim.com", "drogon1010", "drogon1010");
    }

}
