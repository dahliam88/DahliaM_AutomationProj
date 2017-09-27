package fBObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class FacebookBrowseCelebs extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='q_dashboard']")
    public static WebElement publicFiguresBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='search_form_button']")
    public static WebElement searchBtn;

    public void searchCelebs(String name) throws InterruptedException {
        publicFiguresBox.sendKeys(name);
        sleep(3000);
        searchBtn.click();
        sleep(4000);

        System.out.println("Test passed");
    }
}
