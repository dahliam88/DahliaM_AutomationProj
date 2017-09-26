package EspnObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class EspnReportABug extends CommonAPI{

    @FindBy(how = How.NAME, using = "comment")
    public static WebElement reportBox;

    @FindBy(how = How.XPATH, using = "html/body/table/tbody/tr[2]/td[2]/span/form/p/input")
    public static WebElement commentBtn;

    public void reportBug(String comment) throws InterruptedException {
        reportBox.sendKeys(comment);
        sleep(2000);
        commentBtn.click();
        sleep(2000);
    }
}
