package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class EbayLogin extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='userid']")
    public static WebElement userID;

    @FindBy(how = How.XPATH, using = ".//*[@id='pass']")
    public static WebElement pWBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='sgnBt']")
    public static WebElement sgnInBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='inflowfyp']")
    public static WebElement forgotPW;

    @FindBy(how = How.XPATH, using = ".//*[@id='otpanch']")
    public static WebElement tempPass;

    @FindBy(how = How.XPATH, using = ".//*[@id='rmdLtr']")
    public static WebElement phone;


    public void loginEbay(String userid, String password) throws InterruptedException {
        userID.sendKeys(userid);
        sleep(1000);
        pWBox.sendKeys(password);
        sleep(1000);
        sgnInBtn.click();
        sleep(1000);
        phone.click();
        sleep(1000);
    }

    public void forgotPassword() {
        forgotPW.click();
    }

    public void tempPass() {
        tempPass.click();
    }

}
