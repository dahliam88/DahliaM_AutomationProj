package fBObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class FacebookLogin extends CommonAPI {

    @FindBy(how = How.ID, using = "email")
    public static WebElement emailBox;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement passBox;

    @FindBy(how = How.ID, using = "loginbutton")
    public static WebElement loginBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='loginform']/div[5]/a")
    public static WebElement createAcct;

    @FindBy(how = How.ID, using = "forgot-password-link")
    public static WebElement forgotPass;

    public void loginFB(String email, String password) throws InterruptedException {
        emailBox.sendKeys(email);
        sleep(1000);
        passBox.sendKeys(password);
        sleep(1000);
        loginBtn.click();
        sleep(1000);

        System.out.println("Test passed");
    }

    public void createAcct() {
        createAcct.click();
    }
    public void forgotPass() {
        forgotPass.click();
    }


}
