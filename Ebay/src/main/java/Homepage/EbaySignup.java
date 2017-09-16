package Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class EbaySignup {

    @FindBy(how = How.XPATH, using = ".//*[@id='firstname']")
    public static WebElement firstNameBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='lastname']")
    public static WebElement lastNameBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='email']")
    public static WebElement eMailBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='PASSWORD']")
    public static WebElement psswordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='ppaFormSbtBtn']")
    public static WebElement registerBtn;


    public void signUpEbay(String firstname, String lastname, String email, String password) throws InterruptedException {
        firstNameBox.sendKeys(firstname);
        sleep(2000);

        lastNameBox.sendKeys(lastname);
        sleep(2000);

        eMailBox.sendKeys(email);
        sleep(2000);

        psswordBox.sendKeys(password);
        sleep(2000);

        registerBtn.click();
        sleep(1000);
    }
}