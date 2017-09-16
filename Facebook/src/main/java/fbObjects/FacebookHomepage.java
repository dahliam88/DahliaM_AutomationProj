package fbObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class FacebookHomepage extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_a']/div[1]/div[1]/div/a/span")
    public static WebElement profile;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_c']")
    public static WebElement homeBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='findFriendsNav']")
    public static WebElement findFriends;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_c']")
    public static WebElement homeBtn9;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_217974574879787']/a/div")
    public static WebElement messenger;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn12;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_2392950137']/a/div")
    public static WebElement watchVideo;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn13;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_1606854132932955']/a/div")
    public static WebElement marketplace;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn14;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_1434659290104689']/a/div")
    public static WebElement groups;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn15;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_2530096808']/a/div")
    public static WebElement pages;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn16;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_2344061033']/a/div")
    public static WebElement events;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn17;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_1572366616371383']/a/div")
    public static WebElement friendLists;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn18;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_183217215062060']/a/div")
    public static WebElement pokes;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn19;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_193356651002223']/a/div")
    public static WebElement fundraisers;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn20;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_303257506544370']/a/div")
    public static WebElement onThisDay;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn21;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_140332009231']/a/div")
    public static WebElement games;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn22;

    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_1031093773624602']/a/div")
    public static WebElement liveVideo;

    @FindBy(how = How.ID, using = "u_0_c")
    public static WebElement homeBtn23;


    public void Home() throws InterruptedException{
        profile.click();
        sleep(2000);

        homeBtn.click();
        sleep(2000);

        findFriends.click();
        sleep(2000);

        homeBtn9.click();
        sleep(2000);

        messenger.click();
        sleep(2000);

        homeBtn12.click();
        sleep(2000);

        watchVideo.click();
        sleep(2000);

        homeBtn13.click();
        sleep(2000);

        marketplace.click();
        sleep(2000);

        homeBtn14.click();
        sleep(2000);

        groups.click();
        sleep(2000);

        homeBtn15.click();
        sleep(2000);

        pages.click();
        sleep(2000);

        homeBtn16.click();
        sleep(2000);

        events.click();
        sleep(2000);

        homeBtn17.click();
        sleep(2000);

        friendLists.click();
        sleep(2000);

        homeBtn18.click();
        sleep(2000);

        pokes.click();
        sleep(2000);

        homeBtn19.click();
        sleep(2000);

        fundraisers.click();
        sleep(2000);

        homeBtn20.click();
        sleep(2000);

        onThisDay.click();
        sleep(2000);

        homeBtn21.click();
        sleep(2000);

        games.click();
        sleep(2000);

        homeBtn22.click();
        sleep(2000);

        liveVideo.click();
        sleep(2000);

        homeBtn23.click();
        sleep(2000);

        System.out.println("Test passed");

    }

}

