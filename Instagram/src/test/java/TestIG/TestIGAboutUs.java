package TestIG;

import common.CommonAPI;
import iGObjects.InstagramAboutUs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestIGAboutUs extends CommonAPI{

    @Test
    public void testDataPolicy() throws InterruptedException {
        driver.navigate().to("https://instagram-press.com/");
        InstagramAboutUs press = PageFactory.initElements(driver, InstagramAboutUs.class);
        press.Press();
    }

}
