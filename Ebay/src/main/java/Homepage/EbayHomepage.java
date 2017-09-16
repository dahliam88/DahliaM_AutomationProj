package Homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Homepage.EbayHomepage;

import static java.lang.Thread.sleep;

public class EbayHomepage extends CommonAPI {

   @FindBy(how = How.XPATH, using = ".//*[@id='s2-4[0]']")
    public static WebElement photoGall;

    @FindBy(how = How.XPATH, using = ".//*[@id='s2-4[0]']")
    public static WebElement photoGall2;

    @FindBy(how = How.XPATH, using = ".//*[@id='s2-4[0]']")
    public static WebElement photoGall3;

    @FindBy(how = How.XPATH, using = ".//*[@id='s2-4[0]']")
    public static WebElement photoGall4;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-ac']")
    public static WebElement searchBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-btn']")
    public static WebElement searchBttn;


    public void searchItem(String item) throws InterruptedException {
        System.out.println("Scroll through photo gallery 4 times");

        photoGall.click();
        sleep(1000);

        photoGall2.click();
        sleep(1000);

        photoGall3.click();
        sleep(1000);

        photoGall4.click();
        sleep(1000);

        searchBox.sendKeys(item);
        sleep(3000);

        searchBttn.click();
        sleep(3000);
    }

}