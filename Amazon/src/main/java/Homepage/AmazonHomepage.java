package Homepage;
import common.CommonAPI;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class AmazonHomepage extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='twotabsearchtextbox']")
    public static WebElement searchItems;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
    public static WebElement searchBtn;

    public void searchInput(String item) throws InterruptedException {
        searchItems.sendKeys(item);
        sleep(3000);

        searchBtn.click();
        sleep(3000);
    }
}