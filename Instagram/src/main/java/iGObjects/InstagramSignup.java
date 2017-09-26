package iGObjects;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class InstagramSignup extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[2]/div/input")
    public static WebElement emailOrPhoneBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[3]/div/input")
    public static WebElement fullNameBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[4]/div/input")
    public static WebElement userNameBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[5]/div/input")
    public static WebElement passwordBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='react-root']/section/main/article/div[2]/div[1]/div/form/div[6]/span/button")
    public static WebElement signupBtn;


    public void signUpIG(String emailorphone, String fullname, String username, String password) throws InterruptedException {
        emailOrPhoneBox.sendKeys(emailorphone);
        sleep(2000);
        fullNameBox.sendKeys(fullname);
        sleep(2000);
        userNameBox.sendKeys(username);
        sleep(2000);
        passwordBox.sendKeys(password);
        sleep(2000);
        signupBtn.click();
        sleep(1000);
    }
}