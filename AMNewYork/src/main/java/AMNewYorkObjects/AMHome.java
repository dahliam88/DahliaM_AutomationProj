package AMNewYorkObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class AMHome extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[2]/a")
    public static WebElement news;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[3]/a")
    public static WebElement politics;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[4]/a")
    public static WebElement thingsToDo;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[5]/a")
    public static WebElement eatDrink;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[6]/a")
    public static WebElement entertainment;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[7]/a")
    public static WebElement realEstate;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[8]/a")
    public static WebElement transit;

    @FindBy(how = How.XPATH, using = ".//*[@id='front']/header/nav/div/div[2]/ul/li[9]/a")
    public static WebElement opinion;

    @FindBy(how = How.XPATH, using = ".//*[@id='soc']/a[1]")
    public static WebElement search1;

    @FindBy(how = How.XPATH, using = ".//*[@id='soc']/form/fieldset/button")
    public static WebElement search2;

    @FindBy(how = How.XPATH, using = ".//*[@id='q']")
    public static WebElement searchBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='searchBar']/fieldset[2]/button")
    public static WebElement searchBtn;

    public void Home(String keyword) throws InterruptedException {
        news.click();
        sleep(1000);
        politics.click();
        sleep(1000);
        thingsToDo.click();
        sleep(1000);
        eatDrink.click();
        sleep(1000);
        entertainment.click();
        sleep(1000);
        realEstate.click();
        sleep(1000);
        transit.click();
        sleep(1000);
        opinion.click();
        sleep(1000);
        search1.click();
        sleep(1000);
        search2.click();
        sleep(1000);
        searchBox.sendKeys(keyword);
        sleep(2000);
        searchBtn.click();
        sleep(1050);
    }
}