package BankOAObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class BankOAHome extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement banking;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[2]/a")
    public static WebElement creditCards;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[3]/a")
    public static WebElement loans;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[4]/a/span[1]")
    public static WebElement investments;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[5]/a")
    public static WebElement learning;

    @FindBy(how = How.NAME, using = "onlineId1")
    public static WebElement userID;

    @FindBy(how = How.NAME, using = "passcode1")
    public static WebElement passcode;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-sign-in-btn']")
    public static WebElement signIn;

    public void Home(String onlineID, String password) throws InterruptedException {
        banking.click();
        sleep(1050);
        creditCards.click();
        sleep(1050);
        loans.click();
        sleep(1050);
        investments.click();
        sleep(1050);
        learning.click();
        sleep(1050);
        userID.sendKeys(onlineID);
        sleep(2000);
        passcode.sendKeys(password);
        sleep(2000);
        signIn.click();
        sleep(2000);
    }
}
