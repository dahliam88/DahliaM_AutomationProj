package AMNewYorkObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class AMSignUp extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='rsFtr']/div/section[1]/dl/dd[4]/a")
    public static WebElement signUpNewsletter;

    @FindBy(how = How.XPATH, using = ".//*[@id='userContact']")
    public static WebElement emailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[1]")
    public static WebElement dailyMF;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[2]")
    public static WebElement breaking;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/a[3]")
    public static WebElement amExpress;

    @FindBy(how = How.XPATH, using = ".//*[@id='main']/div/form/input[4]")
    public static WebElement signUpBtn;

    public void signUpAM(String email) throws InterruptedException {
        signUpNewsletter.click();
        sleep(1000);
        emailAddress.sendKeys(email);
        sleep(2000);
        dailyMF.click();
        sleep(1000);
        breaking.click();
        sleep(1000);
        amExpress.click();
        sleep(1000);
        signUpBtn.click();
        sleep(1000);
    }
}