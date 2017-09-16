package iGObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class InstagramHomepage extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[1]/a")
    public static WebElement discoverPeople;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")
    public static WebElement profileBtn;


    public void Home() throws InterruptedException {
        discoverPeople.click();
        sleep(3000);

        profileBtn.click();
        sleep(3000);
    }

}
