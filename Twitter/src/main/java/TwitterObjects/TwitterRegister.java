package TwitterObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class TwitterRegister extends CommonAPI {

    @FindBy(how = How.NAME, using = "user[name]")
    public static WebElement fullName;

    @FindBy(how = How.NAME, using = "user[email]")
    public static WebElement emailBox;

    @FindBy(how = How.NAME, using = "user[user_password]")
    public static WebElement passwordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='submit_button']")
    public static WebElement regBtn;

    public void registerTwitter(String fullname, String email, String password) throws InterruptedException {
        fullName.sendKeys(fullname);
        sleep(2000);
        emailBox.sendKeys(email);
        sleep(2000);
        passwordBox.sendKeys(password);
        sleep(2000);
        regBtn.click();
    }
}
