package TwitterObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class TwitterHomepage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[1]/span")
    public static WebElement featured;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[2]/span")
    public static WebElement sports;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[3]/span")
    public static WebElement news;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[4]/span")
    public static WebElement music;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[5]/span")
    public static WebElement entertainment;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/a[6]/span")
    public static WebElement lifestyle;

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[2]/div/div[2]/span")
    public static WebElement more;


    public void Home() throws InterruptedException {
        featured.click();
        sleep(3000);
        sports.click();
        sleep(3000);
        news.click();
        sleep(3000);
        music.click();
        sleep(3000);
        entertainment.click();
        sleep(3000);
        lifestyle.click();
        sleep(3000);
        more.click();
        sleep(3000);
    }
}