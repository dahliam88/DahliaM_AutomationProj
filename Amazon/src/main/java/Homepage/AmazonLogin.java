package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.smartcardio.CommandAPDU;

import static java.lang.Thread.sleep;

public class AmazonLogin extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement emailBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement passwordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    public static WebElement signInBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='auth-fpp-link-bottom']")
    public static WebElement forgotPassword;

    @FindBy(how = How.XPATH, using = ".//*[@id='createAccountSubmit']")
    public static WebElement createAcct;


    public void loginAmazon(String email, String password) throws InterruptedException {
        emailBox.sendKeys(email);
        sleep(1000);
        passwordBox.sendKeys(password);
        sleep(1000);
        signInBtn.click();
        sleep(1000);
    }

    public void createAccount() {
        createAcct.click();
    }

    public void forgotPassword() {
        forgotPassword.click();
    }

}
