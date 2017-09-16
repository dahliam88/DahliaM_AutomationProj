package iGObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class TermsOfUse extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[1]/a")
    public static WebElement commGuidelines;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[2]/a")
    public static WebElement visibility;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_c']/span/ul/li[3]/a")
    public static WebElement addressAbuse;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[4]/a")
    public static WebElement blocking;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[5]/a")
    public static WebElement safetyTips;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[6]/a")
    public static WebElement parents;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[7]/a")
    public static WebElement lawEnforcement;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[9]/a")
    public static WebElement sharingPhotos;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[10]/a")
    public static WebElement eatingDisorders;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[11]/a")
    public static WebElement privacyPolicy;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[12]/a")
    public static WebElement termsOfUse;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_4']/span/ul/li[13]/a")
    public static WebElement platformPolicy;


    public void WebElement() throws InterruptedException {
        commGuidelines.click();
        sleep(1000);

        visibility.click();
        sleep(1000);

        addressAbuse.click();
        sleep(1000);

        blocking.click();
        sleep(1000);

        safetyTips.click();
        sleep(1000);

        parents.click();
        sleep(1000);

        lawEnforcement.click();
        sleep(1000);

        sharingPhotos.click();
        sleep(1000);

        eatingDisorders.click();
        sleep(1000);

        privacyPolicy.click();
        sleep(1000);

        termsOfUse.click();
        sleep(1000);

        platformPolicy.click();
        sleep(1000);
    }

}