package BankOAObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class BankOAHomeSearch extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-search-query']")
    public static WebElement searchBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-1']/div[2]/div[2]/div/div/form/div[1]/input[2]")
    public static WebElement searchBtn;

    public void Search(String input) throws InterruptedException {
        searchBox.sendKeys(input);
        sleep(2000);
        searchBtn.click();
        sleep(2000);
    }
}
