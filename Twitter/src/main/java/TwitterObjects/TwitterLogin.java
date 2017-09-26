package TwitterObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class TwitterLogin extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")
    public static WebElement userName;

    @FindBy(how = How.XPATH, using = ".//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input")
    public static WebElement pssword;

    @FindBy(how = How.XPATH, using = ".//*[@id='page-container']/div/div[1]/form/div[2]/button")
    public static WebElement logIn;

    @FindBy(how = How.XPATH, using = ".//*[@id='page-container']/div/div[1]/form/div[2]/div/label/a")
    public static WebElement forgotPword;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-signup-link']")
    public static WebElement signUp;

    public void loginTwitt(String username, String password) throws InterruptedException {
        userName.sendKeys(username);
        sleep(3000);
        pssword.sendKeys(password);
        sleep(3000);
        logIn.click();
        sleep(2000);
    }

    public void signUp() {
        signUp.click();
    }

    public void forgotPassword() {
        forgotPword.click();
    }

}