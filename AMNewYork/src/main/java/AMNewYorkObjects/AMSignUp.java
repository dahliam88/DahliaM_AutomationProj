package AMNewYorkObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class AMSignUp {
    @FindBy(how = How.XPATH, using = ".//*[@id='rsFtr']/div/section[1]/dl/dd[4]/a")
    public static WebElement signUpNewsletter;

    @FindBy(how = How.XPATH, using = ".//*[@id='userContact']")
    public static WebElement email;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[1]")
    public static WebElement dailyMF;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[2]")
    public static WebElement breaking;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[3]")
    public static WebElement amExpress;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/input[4]")
    public static WebElement signUpBtn;

    public void signUpAM(String name, String email, String password, String password2) throws InterruptedException {
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
