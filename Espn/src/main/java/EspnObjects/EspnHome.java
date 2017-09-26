package EspnObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class EspnHome extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[1]/a/span/span[1]")
    public static WebElement nfl;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[2]/a/span/span[1]")
    public static WebElement nba;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[3]/a/span/span[1]")
    public static WebElement mlb;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[4]/a/span/span[1]")
    public static WebElement ncaaf;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[5]/a/span/span[1]")
    public static WebElement soccer;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[6]/a")
    public static WebElement more;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[10]/a/span/span[1]")
    public static WebElement watch;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[9]/a/span/span[1]")
    public static WebElement listen;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[8]/a/span/span[1]")
    public static WebElement fantasy;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-nav']/ul/li[7]/a")
    public static WebElement more2;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-search-trigger']")
    public static WebElement search;

    @FindBy(how = How.XPATH, using = ".//*[@id='global-search']/input[2]")
    public static WebElement searchBtn1;

    @FindBy(how = How.XPATH, using = ".//*[@id='gsc-i-id1']")
    public static WebElement searchBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='___gcse_0']/div/div/form/table[1]/tbody/tr/td[2]/input")
    public static WebElement searchBtn2;

    public void Home(String info) throws InterruptedException {
        nfl.click();
        sleep(1050);
        nba.click();
        sleep(1050);
        mlb.click();
        sleep(1050);
        ncaaf.click();
        sleep(1050);
        soccer.click();
        sleep(1050);
        more.click();
        sleep(1050);
        watch.click();
        sleep(1050);
        listen.click();
        sleep(1050);
        fantasy.click();
        sleep(1050);
        more2.click();
        sleep(1050);
        search.click();
        sleep(1050);
        searchBtn1.click();
        sleep(1000);
        searchBox.sendKeys(info);
        sleep(2000);
        searchBtn2.click();
        sleep(2000);
    }
}