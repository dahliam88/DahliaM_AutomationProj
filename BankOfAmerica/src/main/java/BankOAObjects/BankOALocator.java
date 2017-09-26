package BankOAObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class BankOALocator {

    @FindBy(how = How.XPATH, using = ".//*[@id='rioSearchInput']")
    public static WebElement locationBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='rioSearchButton']")
    public static WebElement searchBttn;

    public void Location(String place) throws InterruptedException {
        locationBox.sendKeys(place);
        sleep(2000);
        searchBttn.click();
        sleep(2000);
    }
}
