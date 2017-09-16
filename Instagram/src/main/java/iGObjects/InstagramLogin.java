package iGObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class InstagramLogin extends CommonAPI {

    @FindBy(how = How.NAME, using = "username")
    public static WebElement usernameBox;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement passwordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/span/button")
    public static WebElement logInBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/div/article/div/div[1]/div/form/a")
    public static WebElement forgotPassword;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/div/article/div/div[2]/p/a")
    public static WebElement signUp;


    public void loginIG(String username, String password) throws InterruptedException {
        usernameBox.sendKeys(username);
        sleep(1000);
        passwordBox.sendKeys(password);
        sleep(1000);
        logInBtn.click();
        sleep(1000);
    }

    public void signUp() {
        signUp.click();
    }

    public void forgotPassword() {
        forgotPassword.click();
    }

}
