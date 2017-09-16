package iGObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class InstagramAboutUs extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-18']/a")
    public static WebElement pressNews;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-19']/a")
    public static WebElement ourStory;

    @FindBy(how = How.XPATH, using = ".//*[@id='menu-item-21']/a")
    public static WebElement brandAssets;


    public void Press() throws InterruptedException {
        pressNews.click();
        sleep(1000);

        sleep(3000);
        ourStory.click();
        sleep(1000);

        brandAssets.click();
        sleep(3000);
    }

}
