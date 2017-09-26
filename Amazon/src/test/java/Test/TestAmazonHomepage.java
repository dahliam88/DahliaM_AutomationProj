package Test;

import Homepage.AmazonHomepage;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import common.CommonAPI;
import org.testng.annotations.Test;
import Homepage.AmazonHomepage;

import static java.lang.Thread.sleep;

public class TestAmazonHomepage extends CommonAPI {
    @Test
    public void testHome() throws InterruptedException {
        AmazonHomepage amazonHome = PageFactory.initElements(driver, AmazonHomepage.class);
        amazonHome.searchInput("handbags");
    }

}
