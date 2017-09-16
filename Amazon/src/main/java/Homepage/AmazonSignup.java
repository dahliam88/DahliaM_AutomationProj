package Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class AmazonSignup {

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_customer_name']")
    public static WebElement nameBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement emailBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement passwordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password_check']")
    public static WebElement confirmPasswordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='continue']")
    public static WebElement createAccountBtn;


    public void signUpAmazon(String name, String email, String password, String password2) throws InterruptedException {
        nameBox.sendKeys(name);
        sleep(2000);

        emailBox.sendKeys(email);
        sleep(2000);

        passwordBox.sendKeys(password);
        sleep(2000);

        confirmPasswordBox.sendKeys(password2);
        sleep(2000);

        createAccountBtn.click();
        sleep(1000);
    }
}